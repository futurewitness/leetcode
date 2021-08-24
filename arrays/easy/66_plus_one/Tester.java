import java.io.*;
import java.util.regex.Pattern;
import java.util.*;
import leet.Nsol;


public class Tester {
    public static void main(String args[]) {
        Nsol n_sol = new Nsol();

        File f = new File("/home/tmleong/public/leet/arrays/easy/66_plus_one/leet/testcases.txt");
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
            nums = n_sol.plusOne(nums);
            for(int i = 0; i<nums.length;i++) {
                System.out.print(nums[i]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

    } 
}