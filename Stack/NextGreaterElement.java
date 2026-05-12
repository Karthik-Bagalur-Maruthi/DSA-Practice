//Finding next Greater Element in the array
//TC : O(n)
//SC : O(n)


import java.util.Stack;
public class NextGreaterElement{
  public static void nextGreater(int arr[] , int result[]){
    Stack<Integer> s = new Stack<>();

    for(int i = arr.length - 1 ; i>= 0 ; i--){
      while(!s.isEmpty() && arr[i] >= arr[s.peek()]){
        s.pop();
      }

      if(s.isEmpty()){
        result[i] = -1;
      }else{
        result[i] = arr[s.peek()];
      }
      s.push(i);
    }
  }
}
  
