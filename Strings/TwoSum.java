//Two Sum
//TC - O(n^2)

import java.util.*;
public class TwoSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int nums[] = {2,8,9,7,6,1};
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        for(int i = 0 ;i<nums.length-1;i++){
            for(int j = i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    System.out.println("Elements present at the following indexes give the target : ");
                    System.out.println("[" + i +","+ j + "]");;
                }
            }
        }
    }
    
}
