package FindKthFromEnd;

public class Main {

    public static void main(String[] args) {
        FindKthFromEndLinkedList myList = new FindKthFromEndLinkedList(1);
        myList.append(2);
        myList.append(3);
        myList.append(4);
        myList.append(5);
        myList.printList();
        System.out.println("kth value from end: " + myList.findKthFromEnd(6));
        myList.printList();
    }


}
