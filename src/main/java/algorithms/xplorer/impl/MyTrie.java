package algorithms.xplorer.impl;

import algorithms.xplorer.Trie;

public class MyTrie implements Trie {

  private Node root;

  public MyTrie() {
    this.root = new Node('\0'); // empty string
  }

  @Override
  public void insert(String word) {
    Node curr = this.root;
    for (int i = 0; i < word.length(); i++) {
      char c = word.charAt(i);
      int idx = c - 'a';
      if (curr.children[idx] == null) {
        curr.children[idx] = new Node(c);
      }
      curr = curr.children[idx];
    }
    curr.isWord = true;
  }

  @Override
  public boolean search(String word) {
    Node node = getNode(word);
    return node != null && node.isWord;
  }

  @Override
  public boolean startsWith(String prefix) {
    return getNode(prefix) != null;
  }

  private Node getNode(String word) {
    Node curr = this.root;
    for (int i = 0; i < word.length(); i++) {
      char c = word.charAt(i);
      int idx = c - 'a';
      if (curr.children[idx] == null) {
        return null;
      }
      curr = curr.children[idx];
    }
    return curr;
  }

  class Node {
    char c;
    boolean isWord;
    Node[] children;

    public Node(char c) {
      this.c = c;
      this.children = new Node[26];
    }
  }
}
