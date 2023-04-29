package Dang5;

public class CustomHashMap {
    private Integer value;
    private static final Integer size = 10;
    private boolean overwrite = true;
    private Integer[] arr = new Integer[size];

    private Integer hashCode(Integer key) {
        int i = key * key % 10;
        return i;
    }

    public CustomHashMap() {

    }

    public Integer getValue() {
        return value;
    }

    /*
         overwrite == true: co ghi de
         overwrite == true: khong co ghi de
    */
    public void setValue(Integer key ,Integer value, boolean overwrite) {
        this.overwrite = overwrite;
        int index = hashCode(key);
        if (arr[index] != null && overwrite){
            arr[index] = value;
        } else if (arr[index] == null) {
            arr[index] = value;
        }
    }

    // mac dinh overwrite = true
    public void setValue(Integer key,Integer value) {
        int index = hashCode(key);
        arr[index] = value;
    }

    public Integer getValueKey(Integer key) {
        int index = hashCode(key);
        return arr[index];
    }

    public Integer getValueIndex(Integer index) {
        return arr[index];
    }

    public Integer getSize() {
        return size;
    }
}
