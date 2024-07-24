package algorithms.xplorer.impl;

import algorithms.xplorer.Queue;
import lombok.Getter;

public class MyQueue implements Queue {

  private Node head; // remove from the head
  private Node tail; // add thing here

  @Getter private int size;

  @Override
  public int size() {
    return this.size;
  }

  @Override
  public int peek() {
    return head.data;
  }

  @Override
  public void add(int data) {

    Node newNode = new Node(data);
    if (tail != null) {
      tail.next = newNode;
    }
    tail = newNode;

    if (head == null) {
      head = newNode;
    }
    this.size++;
  }

  @Override
  public int remove() {

    if (this.head == null) {
      return -1;
    }

    int data = this.head.data;
    this.head = this.head.next;
    if (this.head == null) {
      this.tail = null;
    }

    this.size--;
    return data;
  }

  private static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
    }
  }
}
