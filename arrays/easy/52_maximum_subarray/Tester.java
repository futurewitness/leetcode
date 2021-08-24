import leet.DCSol;
import java.io.*;
import java.util.regex.Pattern;
import java.util.*;


class Tester {
    public static void main(String args[]) {
        DCSol dc_sol = new DCSol();
        //NSol n_sol = new Nsol();

        File f = new File("/home/tmleong/public/leet/arrays/easy/52_maximum_subarray/leet/testcases.txt");
        try {

        BufferedReader br = new BufferedReader(new FileReader(f));
        String buf = "";
        int[] nums;
        String[] holder;
        while((buf = br.readLine()) != null) {
            holder = buf.split(" ");
            nums = new int[holder.length];
            for(int i = 0; i<holder.length;i++) {
                nums[i] = Integer.parseInt((holder[i]));
            }
            int v = dc_sol.maxSubArray(nums);
            System.out.println(String.valueOf(v));
        }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

    } 
}