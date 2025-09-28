package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList newList = new LinkedList(4);
        newList.append(2);
        System.out.println(newList.removeLast().value);
        System.out.println(newList.removeLast());
        System.out.println(newList.removeLast());

        /*
        newList.getHead();
        newList.getTail();
        newList.getLength();
        newList.printList();
         */
    }
}
