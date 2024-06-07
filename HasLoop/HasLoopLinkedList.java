package HasLoop;

public class HasLoopLinkedList {

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    Node head;
    Node tail;
    int length;

    public HasLoopLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
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
        length++;
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public boolean hasLoop() {
        if(head == null) {
            return false;
        } else {
            Node slow = head;
            Node fast = head;
            while(true) {
                fast = fast.next;
                if(fast == null) {
                    return false;
                }
                slow = slow.next;
                fast = fast.next;
                if(fast == null) {
                    return false;
                } else if(fast == slow) {
                    return true;
                }
            }
        }
    }

}
