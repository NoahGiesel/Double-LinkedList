package DoubleLinkedList;

import java.io.Console;
import java.util.Scanner;

import DoubleLinkedList.Node;
import DoubleLinkedList.linkedList;
 
public class run {
 
    public static void main(String[] args)
 
    {
        Scanner scan = new Scanner(System.in);
 
        linkedList list = new linkedList();
 
        System.out.println("\nDouble LinkedList\n");
 
 
 
        if (list.isEmpty() == true) {
            System.out.println("Insert information and key for the first Head:");
            System.out.print("information:");
            String information0 = scan.next();
            System.out.print("key:");
            int key0 = scan.nextInt();
 
            while (key0 < 1 || key0 > 1000000) {
                System.out.println("Insert a key number betweem 1 and 10^6");
                System.out.print("Key:");
                key0 = scan.nextInt();
                if (key0 >= 1 || key0 <= 1000000) {
                    list.insertFirst(information0, key0);
                }
            }
 
            list.insertFirst(information0, key0);
 
            list.getFirst();
            System.out.println();
 
        }
        while (list.isEmpty() == false) {
            do {
                System.out.println("Operation you can do:");
                System.out.println("1. insert in first position");
                System.out.println("2. insert a new node");
                System.out.println("3. insert the last node");
                System.out.println("4. insert in position'x'");
                System.out.println("5. delete from position 'x'");
                System.out.println("6. verify if the LinkedList is empty");
                System.out.println("7. number of Nodes");
                System.out.println("8. return head");
                System.out.println("9. return tail");
                System.out.println("10. return element in position 'x'");
                System.out.print("Input:");
                int choice2 = scan.nextInt();
 
                switch (choice2) {
                case 1:
                    System.out.println("Insert information and key for the node");
                    System.out.print("information:");
                    String information = scan.next();
                    System.out.print("key:");
                    int key = scan.nextInt();
 
                    while (key < 1 || key > 1000000) {
                        System.out.println("insert a key number between 1 and 10^6");
                        System.out.print("key:");
                        key = scan.nextInt();
                        if (key >= 1 || key <= 1000000) {
                            list.insertFirst(information, key);
                        }
                       
                    }
                    list.insertFirst(information, key);
                    System.out.println();
 
                    break;
                case 2:
                    int pos = 2;
                    System.out.println("Insert information and key for the node");
                    String information4 = scan.next();
                    int key4 = scan.nextInt();
                    while (key4 < 1 || key4 > 1000000) {
                        System.out.println("insert a key number between 1 and 10^6");
                        System.out.print("key:");
                        key = scan.nextInt();
                        if (key4 >= 1 || key4 <= 1000000) {
                            list.insertAfterHead(information4, key, pos);
                        }
                    }
                    list.insertAfterHead(information4, key4, pos);
                    break;
                case 3:
                    System.out.println("Insert information and key for the node");
                    System.out.print("information:");
                    String information2 = scan.next();
                    System.out.print("key:");
                    int key2 = scan.nextInt();
                    while (key2 < 1 || key2 > 1000000) {
                        System.out.println("insert a key number between 1 and 10^6");
                        System.out.print("key:");
                        key2 = scan.nextInt();
                        if (key2 >= 1 || key2 <= 1000000) {
                            list.insertLast(information2, key2);
                        }
                    }
                    list.insertLast(information2, key2);
 
                    break;
                case 4:
                    System.out.println("Insert information and key for the node");
                    int pos2 = 0;
                    System.out.print("iformation:");
                    String information3 = scan.next();
                    System.out.print("key:");
                    int key3 = scan.nextInt();
                    if (key3 < 1 || key3 > 1000000) {
                        System.out.println("insert a key number between 1 and 10^6");
                        System.out.print("key:");
                        key = scan.nextInt();
 
                            list.insertInPosition(information3, key3, pos2);
                       
                    }else{list.insertInPosition(information3, key3, pos2);}
                    System.out.print("Insert position: ");
                    pos2 = scan.nextInt();
                   
                    while (pos2 < 1 || pos2 > list.getSize()){
                        System.out.println("Position not possible, insert a position between " + 1 + " and " + list.getSize());
                        int pos3 = 0;
                        System.out.print("Insert position: ");
                        pos3 = scan.nextInt();
                        list.insertInPosition(information3, key3, pos3);
                        }
                       
                   
                list.insertInPosition(information3, key3, pos2);
                    break;
                case 5:
                    System.out.println("Insert Position\n");
                    int p = scan.nextInt();
                    if (p < 1 || p > list.getSize())
                        System.out.println("Position is not possible.");
                    else
                        list.deleteNode(p);
                    break;
                case 6:
                    System.out.println("Empty list= " + list.isEmpty());
                    break;
                case 7:
                    System.out.println("Length = " + list.getSize());
                    break;
                case 8:
                    System.out.print("First Element :");
                    list.getFirst();
                    System.out.println();
                    break;
                case 9:
                    System.out.print("Last Element :");
                    list.getLast();
                    System.out.println();
                    break;
                case 10:
                   
                    System.out.println("Insert position for the node to search for");
                    int pos1 = scan.nextInt();
                    while(pos1 > list.getSize()){
                        System.out.print("Inserted position not valid. Retry");
                        System.out.println("Insert position for the node to search for");
                         pos1 = scan.nextInt();
                        list.searchPosition(pos1);
                    }
                    list.searchPosition(pos1);
                    System.out.println();
                   
                        break;
                case 11:
                    System.out.print("Search node in the LinkedList: ");
                    int x = scan.nextInt();
                    list.serachNodeKey(x);
                    System.out.println();
                    break;
                case 12:
                    System.out.print("Search node in the LinkedList: ");
                    int f = scan.nextInt();
                    list.getDistanceNodeFromHead(f);
                    list.getDistanceNodeToTail(f);
                    System.out.println();
                    break;
            }
                        /*
                 * } /* Display List
                 */
                list.display();
                System.out.println();
            } while (list.isEmpty() == false);
 
            }
        }
    }