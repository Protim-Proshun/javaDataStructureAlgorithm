package FindKthFromEnd;

import FindMiddleNode.FindMiddleNodeLinkedList;

public class FindKthFromEndLinkedList {

    class Node {
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    public FindKthFromEndLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Node findKthFromEnd(int k) {
        if(head == null) {
            return null;
        } else {
            Node temp = head;
            head = tail;
            tail = temp;
            Node before = null;
            Node after = temp.next;
            for(int i = 0; ;i++) {
                after = temp.next;
                temp.next = before;
                before = temp;
                temp = after;
                if(temp == null) {
                    break;
                }
            }

            temp = head;
            for(int i = 1; i < k; i++) {
                temp = temp.next;
                if(temp == null) {
                    return null;
                }
            }

            return temp;
        }
    }

    public void printList() {
        if(head == null) {
            System.out.println("Empty List");
        } else {
            Node temp = head;
            while(temp != null) {
                System.out.println(temp.value);
                temp = temp.next;
            }
        }
    }

}
