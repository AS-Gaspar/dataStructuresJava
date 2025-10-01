package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList newList = new LinkedList(4);
        newList.append(2);
        newList.append(10);
        newList.append(5);
        System.out.println(newList.findMiddleNode().value);
        newList.printList();

        /*
        newList.getHead();
        newList.getTail();
        newList.getLength();
        newList.printList();
         */
    }
}
