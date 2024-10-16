package jan.hashtable;

public class MyHashV0 {
    public Slot[] hashTable;

    public MyHashV0(Integer size) {
        this.hashTable = new Slot[size];
    }

    public class Slot {
        String value;

        Slot(String value) {
            this.value = value;
        }
    }

    public int hashFunc(String key) {
        return (int) (key.charAt(0)) % this.hashTable.length;
    }

    public boolean saveDate(String key, String value) {
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) {
            this.hashTable[address].value = value;
        } else {
            this.hashTable[address] = new Slot(value);
        }
        return true;
    }

    public String getData(String key) {
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) {
            return this.hashTable[address].value;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        MyHashV0 mh = new MyHashV0(20);
        mh.saveDate("Park", "1000");
        mh.saveDate("Kim", "2000");
        mh.saveDate("Kwon", "3000");
        System.out.println(mh.getData("Kwon"));

    }
}
