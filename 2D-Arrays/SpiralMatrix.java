//Spiral Matrix
//TC - O(n × m)


public class SpiralMatrix {
    public static void main(String args[]){
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int firstrow = 0 , lastrow = arr.length - 1 , firstcol = 0 , lastcol = arr[0].length -1;
        while(firstrow<=lastrow &&  firstcol <= lastcol){
            for(int i = firstcol ; i<=lastcol ; i++){
                System.out.print(arr[firstrow][i]+" ");
            }
            for(int i = firstrow+1 ; i<= lastrow ; i++){
                System.out.print(arr[i][lastcol]+" ");
            }
            for(int  i = lastcol -1 ; i>=firstcol ; i--){
                if(firstrow == lastrow){
                    break;
                }
                System.out.print(arr[lastrow][i]+" ");
            }
            for(int i = lastrow - 1  ; i> firstrow ; i--){
                if(firstcol == lastcol){
                    break;
                }
                System.out.print(arr[i][firstcol]+" ");
            }
            firstrow++;
            firstcol++;
            lastrow--;
            lastcol--;
        }
    }
    
}
