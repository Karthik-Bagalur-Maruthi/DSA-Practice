//Checking wheather ll is palindrome
//Tc - O(n)
//Sc - O(1)

public class Ispalindrome {
    public Node findMid(){
        Node slow = Head;
        Node fast = Head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean ispalindrome(){
        if(Head==null || Head.next==null){
            return true;
        }
        Node prev = null;
        Node curr = findMid();
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = Head;
        Node right = prev;

        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

}
