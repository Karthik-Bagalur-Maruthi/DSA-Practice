//Stock Span Problem
//TC : O(n)
//SC : O(n)

import java.util.Stack;
public class JavaBasics{
  public static void stockSpan(int price[] , int span[]){
    Stack<Integer> s = new Stack<>();
    span[0] = 1;
    s.push(0);
    for(int i = 1 ;i<price.length ; i++){
      while(!s.isEmpty() && price[i]>=price[s.peek()]){
        s.pop();
      }

      if(s.isEmpty()){
        span[i] = i+1;
      }else{
        span[i] = i - s.peek();
      }
      s.push(i);
    }
  }
}
        
