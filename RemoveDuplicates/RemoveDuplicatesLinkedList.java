package RemoveDuplicates;

public class RemoveDuplicatesLinkedList {

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node head;

    public RemoveDuplicatesLinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void removeDuplicates() {
        if(head == null) {
            return;
        } else {
            Node temp = head;
            while(temp != null) {
                Node before = temp;
                Node point = before.next;
                while(point != null) {
                    if(point.value == temp.value) {
                        point = point.next;
                        before.next = point;
                        continue;
                    }
                    point= point.next;
                    before = before.next;
                }
                temp = temp.next;
            }
        }
    }

    /*public void removeDuplicates() {
        if(head == null) {
            return;
        } else {
            Node temp = head;
            while(temp != null) {
                Node point = temp.next;
                while(point != null) {
                    if(point.value == temp.value) {
                        point = point.next;
                        temp.next = point;
                    }
                    if(point != null) {
                        point = point.next;
                    }
                }
                temp = temp.next;
            }
        }
    }*/


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
