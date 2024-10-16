package jan.hashtable;

public class MyHashV1 {
   public Slot[] hashTable;

    public MyHashV1(Integer size) {
        this.hashTable = new Slot[size];
    }

    public class Slot {
        String key;
        String value;
        Slot next;
        Slot(String key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }


}
