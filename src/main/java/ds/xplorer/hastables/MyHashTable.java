package ds.xplorer.hastables;

import java.util.LinkedList;

public class MyHashTable {
  private int numBuckets;

  public int getNumBuckets() {
    return numBuckets;
  }

  private int size;

  public int getSize() {
    return size;
  }

  private LinkedList[] buckets;

  public MyHashTable(int numBuckets) {
    this.numBuckets = numBuckets;
    buckets = new LinkedList[numBuckets];
    this.size = 0;

    for (int i = 0; i < numBuckets; i++) {
      buckets[i] = new LinkedList<HashNode>();
    }
  }

  private int getBucketIndex(String key) {

    int h = 0;
    int len = key.length();

    for (int i = 0; i < len; i++) {
      char c = key.charAt(i);
      h = 31 * h + key.charAt(i);
    }

    return (h & 0x7fffffff) % this.numBuckets;
  }

  public int put(String key, int value) {
    int bucketIndex = getBucketIndex(key);
    LinkedList bucket = this.buckets[bucketIndex];

    for (int i = 0; i < bucket.size(); i++) {
      HashNode node = (HashNode) bucket.get(i);
      if (node.getKey().equals(key)) {
        node.setValue(value);
        return 0;
      }
    }

    // Insert new node if key does not exist
    HashNode newNode = new HashNode(key, value);
    bucket.add(newNode);
    this.size++;

    // Check load factor and resize if necessary
    // load factor = num of elem / num buckets
    if (((1.0 * this.size) / this.numBuckets) > 0.7) {
      resize();
    }

    return 0;
  }

  private void resize() {
    // Store old buckets
    // Double the number of buckets
    // Create new array of linked lists
    // Initialize new buckets
    // Reset size
    // Rehash all nodes from old buckets to new buckets
    LinkedList<HashNode>[] oldBuckets = this.buckets;
    this.numBuckets = this.numBuckets * 2;
    this.buckets = new LinkedList[this.numBuckets];

    for (int i = 0; i < this.buckets.length; i++) {
      this.buckets[i] = new LinkedList();
    }

    this.size = 0;
    for (int i = 0; i < oldBuckets.length; i++) {
      LinkedList<HashNode> oldBucket = oldBuckets[i];
      for (int j = 0; j < oldBucket.size(); j++) {
        HashNode node = oldBucket.get(j);
        put(node.getKey(), node.getValue());
      }
    }
  }

  public int remove(String key) {
    // compute the index from the key
    int bucketIndex = getBucketIndex(key);
    // get the bucket at he specified index
    LinkedList bucket = this.buckets[bucketIndex];
    for (int i = 0; i < bucket.size(); i++) {
      HashNode node = (HashNode) bucket.get(i);
      if (node.getKey().equals(key)) {
        bucket.remove(node);
        this.size--;
        return node.getValue();
      }
    }
    // if not found return 1
    return -1;
  }

  public int get(String key) {
    // compute the indexBucket from the key
    // Retrieve the bucket associated with the key
    // Iterate over the LinkedList searching for the node
    // If there's a match return the value

    int bucketIndex = getBucketIndex(key);
    LinkedList bucket = this.buckets[bucketIndex];
    for (int i = 0; i < bucket.size(); i++) {
      HashNode node = (HashNode) bucket.get(i);
      if (node.getKey().equals(key)) {
        return node.getValue();
      }
    }

    return -1;
  }
}

class HashNode {
  String key;
  int value;
  HashNode next;

  HashNode(String key, int value) {
    this.key = key;
    this.value = value;
  }

  public String getKey() {
    return key;
  }

  public int getValue() {
    return value;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public void setValue(int value) {
    this.value = value;
  }
}
