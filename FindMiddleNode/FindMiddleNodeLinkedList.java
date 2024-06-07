package FindMiddleNode;



public class FindMiddleNodeLinkedList {


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

    public FindMiddleNodeLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
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

    public Node findMiddleNode() {
        if(head == null) {
            return null;
        } else {
            Node tortoise = head;
            Node hare = head;
            for(int i = 0; ; i++) {
                hare = hare.next;
                if(hare == null) {
                    break;
                }
                tortoise = tortoise.next;
                hare = hare.next;
                if(hare == null) {
                    break;
                }

            }
            return tortoise;
        }
    }



}
