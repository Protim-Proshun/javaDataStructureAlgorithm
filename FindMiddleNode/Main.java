package FindMiddleNode;

public class Main {

    public static void main(String[] args) {

        FindMiddleNodeLinkedList myList = new FindMiddleNodeLinkedList(1);
        myList.append(2);
        myList.append(3);
        myList.append(4);
        myList.append(5);
        FindMiddleNodeLinkedList.Node middleNode = myList.findMiddleNode();
        System.out.println("Middle Node: " + middleNode.value); // Output: 3

        myList.append(6);
        middleNode = myList.findMiddleNode();
        System.out.println("Middle Node: " + middleNode.value); // Output: 4

    }

}
