package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    // Write the code necessary to convert the following sequence of ListNode objects:
    //
    // list -> [1] -> [2] /
    // Into this sequence of ListNode objects:
    //
    // list -> [3] -> [1] -> [2] /
    // Assume that you are using ListNode class as defined in the textbook:
    //
    // public class ListNode {
    //    public int data;       // data stored in this node
    //    public ListNode next;  // a link to the next node in the list
    //
    //    public ListNode() { ... }
    //    public ListNode(int data) { ... }
    //    public ListNode(int data, ListNode next) { ... }
    // }

    public static void main(String[] args) {
        // write your code here

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        LinkedIntList linkedIntList = new LinkedIntList("list");

        linkedIntList.add(node3.data);
        linkedIntList.add(node1.data);
        linkedIntList.add(node2.data);

        System.out.println(linkedIntList);
    }
}
