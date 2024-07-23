package algorithms.xplorer.impl;

import static org.junit.jupiter.api.Assertions.*;

import algorithms.xplorer.Trie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyTrieTest {

  private Trie trie;

  @BeforeEach
  void setUp() {
    trie = new MyTrie();
  }

  @Test
  void insert() {
    trie.insert("symphonies");
    trie.insert("symphonic");
    assertTrue(trie.search("symphonies"));
    assertTrue(trie.startsWith("sy"));
  }

  @Test
  void search() {
    trie.insert("music");
    assertFalse(trie.search("symphonies"));
    assertTrue(trie.search("music"));
  }

  @Test
  void startsWith() {
    trie.insert("music");
    assertTrue(trie.startsWith("mu"));
    assertFalse(trie.startsWith("app"));
  }
}
