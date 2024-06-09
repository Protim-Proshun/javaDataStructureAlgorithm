package RemoveDuplicates;

public class Main {

    public static void main(String[] args) {
        RemoveDuplicatesLinkedList myLinkedList = new RemoveDuplicatesLinkedList(1);
//        myLinkedList.append(1);
//        myLinkedList.append(2);
//        myLinkedList.append(2);
//        myLinkedList.append(3);
//        myLinkedList.append(3);
//        myLinkedList.append(3);
//        myLinkedList.append(4);

//        myLinkedList.append(2);
//        myLinkedList.append(3);
//        myLinkedList.append(4);
//        myLinkedList.append(3);
//        myLinkedList.append(5);
//        myLinkedList.append(3);
//        myLinkedList.append(6);
//        myLinkedList.append(3);

//        myLinkedList.append(1);
//        myLinkedList.append(2);
//        myLinkedList.append(2);
//        myLinkedList.append(3);
//        myLinkedList.append(3);
//        myLinkedList.append(3);
//        myLinkedList.append(4);

        myLinkedList.append(1);
        myLinkedList.append(1);
        myLinkedList.append(1);
        myLinkedList.append(1);
        myLinkedList.append(1);
        myLinkedList.append(1);

        myLinkedList.printList();
        System.out.println();

        myLinkedList.removeDuplicates();
        myLinkedList.printList();
    }

}
