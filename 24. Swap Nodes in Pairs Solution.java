class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
        else
        {
           ListNode temp1=head;
           ListNode temp2=temp1.next;
           int c=0;
           while(true)
           {
               c=temp2.val;
               temp2.val=temp1.val;
               temp1.val=c;
               temp1=temp2.next;
               if(temp1==null || temp1.next==null)
               {
                  break;
               }
               else
               {
                    temp2=temp1.next;
               }
           }
        }
       return head;
    }
}
