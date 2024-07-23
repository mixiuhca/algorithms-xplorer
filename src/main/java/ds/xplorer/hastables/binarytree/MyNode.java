package ds.xplorer.hastables.binarytree;

public class MyNode {

  int data;
  MyNode left, right;
  int size;

  public MyNode(int data) {
    this.data = data;
  }

  public void insert(int data) {

    if (data <= this.data) {
      if (this.left == null) {
        this.left = new MyNode(data);
      } else {
        left.insert(data);
      }
    } else {
      if (this.right == null) {
        this.right = new MyNode(data);
      } else {
        this.right.insert(data);
      }
    }

    this.size++;
  }

  public boolean contains(int data) {

    if (this.data == data) {
      return true;
    }

    if (this.data > data) {

      if (this.left == null) {
        return false;
      } else {
        return left.contains(data);
      }

    } else {

      if (this.right == null) {
        return false;
      } else {
        right.contains(data);
      }
    }

    return false;
  }

  public int getSize() {
    return size;
  }
}
