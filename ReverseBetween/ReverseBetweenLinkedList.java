package ReverseBetween;

import RemoveDuplicates.RemoveDuplicatesLinkedList;

public class ReverseBetweenLinkedList {

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public ReverseBetweenLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    public void reverseBetween(int startIndex, int endIndex) {
        if(head == null) {
            return;
        }
        Node temp = head;
        Node point = temp;
        Node previousNodeOfReplaceNode = temp;

        if(startIndex == 0) {
            for(int i = 0; i < endIndex; i++) {
                point = temp;
                temp = temp.next;
                //System.out.println("Temp: " + temp.value);
            }
            Node SecondNode = head.next;
            Node tempNextHolder = temp.next;
            temp.next = SecondNode;
            point.next = head;
            head.next = tempNextHolder;
            head = temp;

            temp = head;
            point = temp;
            previousNodeOfReplaceNode = temp;

            startIndex++;
            endIndex--;
        }
        //System.out.println("Start: " + startIndex + " end: " + endIndex);

        for(int j = 0; j < endIndex-1; j++) {
            if(j >= startIndex-1) {
                //System.out.println("Replace Node:" + previousNodeOfReplaceNode.value);
                for (int i = 0; i < endIndex; i++) {
                    point = temp;
                    //System.out.println("Temp: " + temp.value);
                    temp = temp.next;
                }
                //System.out.println("Temp: " + temp.next);


                point.next = temp.next;
                temp.next = previousNodeOfReplaceNode.next;
                previousNodeOfReplaceNode.next = temp;


                temp = head;
            }

            previousNodeOfReplaceNode = previousNodeOfReplaceNode.next;

        }

        System.out.println("Head: " + head.value);
    }

}
