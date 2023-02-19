class Solution {
    public int getDecimalValue(ListNode head) {
        int size = -1;
        int sum = 0;
        for(ListNode temp = head; temp != null; temp = temp.next){
            size++;
        }
        ListNode node = head;
        while(node != null){
            sum += node.val * (Math.pow(2,size--));
            node = node.next;
        }
        return sum;
    }
}
