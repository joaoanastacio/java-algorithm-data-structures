import datastructures.linkedlist.LinkedList;
import datastructures.linkedlist.LinkedListNode;
import datastructures.linkedlist.Person;

public class Driver {

    public static void main(String[] args) {

        /**
         *  Singly Linked List
         */

        // Trying a null Linked List
        LinkedList nullableLinkedList = new LinkedList();
        System.out.println(nullableLinkedList.getHeadNode());

        // Trying a LinkedList with elements
        LinkedListNode firstNode = new LinkedListNode(new Person("Joao Victor", "Anastacio", 24));
        LinkedListNode secondNode = new LinkedListNode(new Person("Yuri Daniel", "Moreira", 24));
        firstNode.setNextNode(secondNode);
        LinkedListNode thirdNode = new LinkedListNode(new Person("Vinicius", "Viel", 23));
        secondNode.setNextNode(thirdNode);

        LinkedList populatedLinkedList = new LinkedList(firstNode);
        System.out.println(populatedLinkedList.getHeadNode());
        populatedLinkedList.displayLinkedListNodes();
    }
}
