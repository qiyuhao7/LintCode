package Naive;
import Public.ListNode;
public class Topic466 {
    public int countNodes(ListNode head) {
        // write your code here
        int res = 0;
        while(head != null){
            res += 1;
            head = head.next;
        }
        return res;
    }
}
