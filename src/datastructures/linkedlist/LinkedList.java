package datastructures.linkedlist;

public class LinkedList {

    LinkedListNode headNode;

    public LinkedList() {
        this.headNode = null;
    }

    public LinkedList(LinkedListNode headNode) {
        this.headNode = headNode;
    }

    public LinkedListNode getHeadNode() {
        return headNode;
    }

    public void displayLinkedListNodes() {
        LinkedListNode currentHead = this.headNode;

        if (this.headNode == null) {
            System.out.println("Linked List is empty");
        }

        while(currentHead != null) {
            System.out.println(currentHead.nodeData);
            currentHead = currentHead.nextNode;
        }
    }
}
