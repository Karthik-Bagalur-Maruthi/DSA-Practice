//Search In Sorted Matrix
//TC - O(n+m)
//SC - O(1)

import java.util.*;
public class SearchInSortedMatrix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Enter the key you want to search: ");
        int key = sc.nextInt();
        int row = 0 , col = matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col] == key){
                System.out.println("Element found at : (" + row + "," + col + ")");
                return;
            }else if(matrix[row][col] > key){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("Element Not found");
    }
    
}
