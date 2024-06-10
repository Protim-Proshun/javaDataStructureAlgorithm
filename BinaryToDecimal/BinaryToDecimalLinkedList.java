package BinaryToDecimal;

public class BinaryToDecimalLinkedList {

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public BinaryToDecimalLinkedList(int value) {
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
        if (temp == null) {
            System.out.println("empty");
        } else {
            while (temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if (temp != null) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
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

    public int binaryToDecimal() {
        if(head == null) {
            return 0;
        } else {
            Node temp = head;
            Node point = temp;
            int num = 0;
            int j = 0;

            while(true) {
                while (temp.next != null) {
                    point = temp;
                    temp = temp.next;
                }
                //System.out.println("temp.value " + temp.value);
                num = num + (temp.value * (int) Math.pow(2, j));
                //System.out.println(num);
                j++;
                if(point.next == null) {
                    break;
                }
                temp = head;
                point.next = null;

            }


            return num;
        }
    }

}


