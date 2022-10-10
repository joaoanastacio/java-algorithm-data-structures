package datastructures.linkedlist;

public class LinkedListNode {
    
    Person nodeData;
    LinkedListNode nextNode;

    public LinkedListNode(Person nodeData) {
        this.nodeData = nodeData;
        this.nextNode = null;
    }

    public void setNextNode(LinkedListNode nextNode) {
        this.nextNode = nextNode;
    }
}
