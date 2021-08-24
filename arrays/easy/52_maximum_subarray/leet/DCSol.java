package leet;
import java.util.Arrays;
class ArrMetadata {
    public int max;
    public int end_max;
    public int begin_max;
    public int sum;
    public ArrMetadata(int _max,int _begin_max, int _end_max, int _sum) {
        this.max = _max;
        this.begin_max = _begin_max;
        this.end_max = _end_max;
        this.sum = _sum;
    }
    public String toString() {
        return String.valueOf(max) +" "+ String.valueOf(begin_max) +" "+String.valueOf(end_max)+" "+String.valueOf(sum);
    }
}
public class DCSol {
    public ArrMetadata merge(ArrMetadata f,ArrMetadata s) {
       // System.out.println(f.toString());
        //System.out.println(s.toString());
        int combo_max = f.end_max + s.begin_max;
        int begin_max = f.sum + s.begin_max;
        int end_max = f.end_max + s.sum;
        int overall_max = Math.max(begin_max,Math.max(Math.max(f.max,s.max),end_max));
        return new ArrMetadata(Math.max(combo_max,overall_max),Math.max(f.begin_max,begin_max),Math.max(s.end_max,end_max),f.sum+s.sum);
    }
    public ArrMetadata dc_max(int[] nums) {
        if(nums.length == 0) {
            return new ArrMetadata(0,0,0,0);
        }
        if(nums.length == 1) {
            ArrMetadata tmp = new ArrMetadata(nums[0],nums[0],nums[0],nums[0]);
            return tmp;
        } else {
            ArrMetadata f = dc_max(Arrays.copyOfRange(nums, 0,nums.length/2));
            ArrMetadata s = dc_max(Arrays.copyOfRange(nums, nums.length/2,nums.length));
            return merge(f,s);
        }
        
    }
    public int maxSubArray(int[] nums) {
       ArrMetadata obj = dc_max(nums);
       return Math.max(obj.max,obj.sum);
    }
}
