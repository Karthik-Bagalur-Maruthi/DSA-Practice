// Valid Anagarm
//  TC - O(nlogn)

import java.util.*;
public class Anagram {
    public static boolean checkAnagram(String s , String t){
        if(s.length()!=t.length()){
            return false;
        }

        char ch1[] = s.toCharArray();
        char ch2[] = t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1 , ch2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1: ");
        String str1 = sc.nextLine();
        System.out.println("Enter String 2: ");
        String str2 = sc.nextLine();

        System.out.println(checkAnagram(str1, str2));
    }
    
}
