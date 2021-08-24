package leet;
public class Nsol {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        for(int i = digits.length-1; i >= 0;i--) {
            if(digits[i] == 9) {
                carry = 1;
                digits[i] = 0;
            } else {
                digits[i] += 1;
                return digits;
            }
        }
        if(carry == 1) {
            int[] copy = new int[digits.length+1];
            copy[0] = 1;
            for(int i = 1; i<digits.length+1;i++) {
                copy[i] = 0;
            }
            return copy;
        }
        return digits;
    }
}
