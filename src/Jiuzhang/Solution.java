package Jiuzhang;

public class Solution {
	public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        while (head.next != null && head.next.next != null) {
            if (head.next.val == head.next.next.val) {
                int val = head.next.val;
                while (head.next != null && head.next.val == val) {
                    head.next = head.next.next;
                }            
            } else {
                head = head.next;
            }
        }
        return dummy.next;
    }
    public void listNodeShow(ListNode head){
		if(head == null){
			System.out.println("The list node is empty");
			return;
		}
		while(head != null){
			System.out.print(head.val+"->");
			head = head.next;
		}
		System.out.println("null");
	}
	public static void main(String args[]){
		ListNode head = new ListNode(1);
    	ListNode node1 = new ListNode(1);
    	ListNode node2 = new ListNode(1);
    	ListNode node3 = new ListNode(2);
    	ListNode node4 = new ListNode(2);
    	ListNode node5 = new ListNode(5);
    	ListNode node6 = new ListNode(5);
    	head.next = node1;
    	node1.next = node2;
    	node2.next = node3;
    	node3.next = node4;
    	node4.next = node5;
    	node5.next = node6;
    	Solution solution = new Solution();
    	solution.listNodeShow(head);
    	head = solution.deleteDuplicates(head);
    	solution.listNodeShow(head);
	}
}
