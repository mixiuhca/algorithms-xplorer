package ds.xplorer.hastables;

public class MyLinkedList {

  // head of the linkedlist initially null
  Node head;

  // Method to insert a new node at the beginnig of the list
  public int insertAtBeginning(int data) {
    // crate a new Node with given data
    Node newNode = new Node(data);
    // link the new node to the head of the list
    newNode.next = head;
    head = newNode; // Update the head to point to the new node
    increaseSize();
    return 0;
  }

  // Method to insert a new node at the end of the list
  public int insertAtEnd(int data) {
    // create a new node with the given data
    Node newNode = new Node(data);
    // if the list is empty make the newNode the head
    if (head == null) {
      head = newNode;
      increaseSize();
      return 0;
    } else {
      // Start at the head of the list
      Node temp = head;
      Node prev = null;
      while (temp != null) {
        prev = temp;
        temp = temp.next; // Traverse to the end of the list
      }
      prev.next = newNode; // Link the last node to the new Node
      increaseSize();
      return 0;
    }
  }

  // Method to delete a node
  public int deleteNode(int key) {
    // Start at the head of the list
    Node temp = head;
    Node prev = null; // keep track of the previous node

    // if the head node itself holds the key to be deleted
    if (temp != null && temp.value == key) {
      // change head to the next node
      head = temp.next;
      decreaseSize();
      return 0;
    }

    // search for the key to be deleted, keep track of the previous node
    while (temp != null && temp.value != key) {
      temp = temp.next;
      prev = temp;
    }

    // if the key was not present in the list
    if (temp == null) {
      return -1;
    }

    // unlink the node from the linkedlist
    prev.next = temp.next;

    this.size--;
    return 0;
  }

  // Helper methods for testing
  public void print() {
    Node temp = this.head;
    while (temp != null) {
      System.out.printf("Node value %d%n", temp.value);
      temp = temp.next;
    }
  }

  private int size;

  public int getSize() {
    return size;
  }

  private void increaseSize() {
    this.size++;
  }

  private void decreaseSize() {
    this.size--;
  }
}

class Node {
  int value;
  Node next;

  public Node(int value) {
    this.value = value;
  }
}
