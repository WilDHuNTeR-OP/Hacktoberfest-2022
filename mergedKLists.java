/**
* Definition for singly-linked list.
* public class ListNode {
* int val;
* ListNode next;
* ListNode() {}
* ListNode(int val) { this.val = val; }
* ListNode(int val, ListNode next) { this.val = val; this.next = next; }
* }
*/
class Solution {
public ListNode mergeKLists(ListNode[] lists) {
ListNode l = null;
PriorityQueue<Integer> q = new PriorityQueue<Integer>();
for(int i = 0;i<lists.length;i++){
ListNode x = lists[i];
while(x != null){
q.add(x.val);
x = x.next;
}
}
int i = 0;
if(!q.isEmpty()){
l = new ListNode();
l.val = q.poll();
}
ListNode head = l;
while(i<q.size()){
l.next = new ListNode(q.poll());
l = l.next;
}

return head;
}
}
