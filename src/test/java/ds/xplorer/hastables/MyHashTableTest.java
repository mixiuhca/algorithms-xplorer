package ds.xplorer.hastables;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyHashTableTest {

  private MyHashTable hashTable;

  @BeforeEach
  void setUp() {
    int buckets = 10;
    hashTable = new MyHashTable(buckets);
  }

  @Test
  void put() {

    assertEquals(0, hashTable.getSize());

    int result = hashTable.put("key-1", 1);
    assertEquals(0, result);
    result = hashTable.put("key-2", 2);
    assertEquals(0, result);
    result = hashTable.put("key-3", 3);
    assertEquals(0, result);
    result = hashTable.put("key-4", 4);
    assertEquals(0, result);

    assertEquals(4, hashTable.getSize());
  }

  @Test
  void remove() {

    assertEquals(0, hashTable.getSize());
    int result = hashTable.put("key-1", 204);
    assertEquals(0, result);
    assertEquals(1, hashTable.getSize());

    String key = "key-1";
    int value = hashTable.remove(key);
    assertEquals(204, value);
    assertEquals(0, hashTable.getSize());
  }

  @Test
  void get() {
    assertEquals(0, hashTable.getSize());
    int result = hashTable.put("key-1", 204);
    assertEquals(0, result);
    result = hashTable.put("key-2", 204);
    assertEquals(0, result);
    result = hashTable.put("key-3", 204);
    assertEquals(0, result);
    assertEquals(3, hashTable.getSize());

    String key = "key-3";
    int value = hashTable.get(key);
    assertEquals(204, value);
    assertEquals(3, hashTable.getSize());
  }

  @Test
  void resizeTest() {

    assertEquals(10, hashTable.getNumBuckets());
    for (int i = 0; i < 10; i++) {
      int result = hashTable.put("key-" + i + 1, 204);
      assertEquals(0, result);
    }
    assertEquals(20, hashTable.getNumBuckets());
  }
}
