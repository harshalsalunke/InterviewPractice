package LeetCodeProblem;

import java.util.Arrays;

public class MoveZeros {

    static void main(String[] args) {
        MoveZeros moveZeros = new MoveZeros();
        moveZeros.moveZeroes(new int[]{0, 1, 0, 3, 12});
    }
    public void moveZeroes(int[] nums) {
        int scanner=0,writer=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[writer]=nums[i];
                writer++;
            }
            else{
                scanner++;
            }
        }
        while (scanner>0){
            nums[writer]=0;
            writer++;
            scanner--;
        }
        System.out.println(Arrays.toString(nums));


    }
}
