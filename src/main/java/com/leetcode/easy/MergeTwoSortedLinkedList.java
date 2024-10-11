package com.leetcode.easy;

//! Passed 0ms runtime 100% beat
class ListNode {
     int val;
    ListNode next;
     ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class MergeTwoSortedLinkedList {
 public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
  ListNode temp = list1;
  ListNode topNode = new ListNode();
  ListNode head = topNode;
  while(temp != null && list2 != null) {

   if(temp.val <= list2.val) {
    ListNode loopNode = new ListNode(temp.val);
    topNode.next = loopNode;
    topNode = loopNode;
    loopNode.next = null;
    temp = temp.next;
   } else {
    ListNode loopNode = new ListNode(list2.val);
    topNode.next = loopNode;
    topNode = loopNode;
    loopNode.next = null;
    list2 = list2.next;
   }

  }

  while(temp!=null) {
   ListNode loopNode = new ListNode(temp.val);
   topNode.next = loopNode;
   topNode = loopNode;
   loopNode.next = null;
   temp = temp.next;
  }

  while(list2!=null) {
   ListNode loopNode = new ListNode(list2.val);
   topNode.next = loopNode;
   topNode = loopNode;
   loopNode.next = null;
   list2 = list2.next;
  }

  return head.next;
 }
}
