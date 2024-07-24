package algorithms.xplorer.impl;

import algorithms.xplorer.Stack;
import lombok.Getter;

public class MyStack implements Stack {

  private Node top;

  @Getter private int size;

  @Override
  public int peek() {

    if (this.top == null) {
      throw new RuntimeException();
    }

    return this.top.data;
  }

  @Override
  public void push(int data) {

    Node newNode = new Node(data);

    if (this.top == null) {
      this.top = newNode;
      this.size++;
      return;
    }

    newNode.next = this.top;
    this.top = newNode;
    this.size++;
  }

  @Override
  public int pop() {
    int result = this.top.data;
    this.top = this.top.next;
    this.size--;
    return result;
  }

  @Override
  public int size() {
    return this.size;
  }

  @Override
  public boolean isEmpty() {
    return this.top == null;
  }

  private static class Node {

    public int data;
    public Node next;

    public Node(int data) {
      this.data = data;
    }
  }
}
