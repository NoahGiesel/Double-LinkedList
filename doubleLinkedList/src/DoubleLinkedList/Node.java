package DoubleLinkedList;


public class Node {
   public int data;
   public String information;
   public Node next, prev;
   public Node head;

   /* Constructor */
   public Node() {
       next = null;
       prev = null;
       data = 0;
       information = null;
   }

  
   public Node(String k,int i, Node n, Node p) {
       information = k;
       data = i;
       next = n;
       prev = p;
   }

   /* Function to set link to next node */
   public void setLinkNext (Node n) {
       next = n;
   }

   public void getNode(Node n){
       Node head  = n;
   }
   /* Function to set link to previous node */
   public void setLinkPrev(Node p) {
       prev = p;
   }

   /* Function to get link to next node */
   public Node getNext() {
       return next;
   }
   public void getFirst(Node n){
       Node head  = n;
   }
  
   /* Function to get link to previous node */
   public Node getPrev() {
       return prev;
   }
   /* Function to set information to node */
   public void setInformazione(String i) {
       information = i;
   }

   /* Function to get data from node */
   public String getInformation() {
       return information;
   }
   /* Function to set data to node */
   public void setData(int d) {
       data = d;
   }

   /* Function to get data from node */
   public int getData() {
       return data;
   }
}
