package Labs01.Dang7;

public class QueueCustom {
    private Integer[] arr = new Integer[5];
    private Integer head = 0;
    private Integer tail = 0;

    public QueueCustom() {}

    public void add(Integer value) {
        if (isEmpty()){
            arr[head] = value;
            tail = head;
        } else if (isFull()) {
            System.out.println("Queue is full!");
        } else {
            arr[(tail+1)%5] = value;
            tail = tail +1;
        }
    }

    //retrieves and removes the head of this queue
    public Integer remove() {
        if (isEmpty()){
            System.out.println("Queue is empty!");
            return null;
        } else {
            head = head +1;
            int data = arr[head -1];
            arr[head-1] = null;
            return data;
        }
    }

    //retrieves but does not remove the head of this queue
    public Integer element() {
        if (isEmpty()){
            System.out.println("Queue is empty!");
            return null;
        } else {
            return arr[head];
        }
    }

    public Boolean isFull() {
        int count = 0;
        while (count < 5){
            if (arr[count] == null){
                return false;
            }
            count++;
        }
        return true;
    }
    public Boolean isEmpty() {
        int count = 0;
        while (count < 5) {
            if (arr[count] != null) {
                return false;
            }
            count++;
        }
        return true;
    }

    public static void main(String[] args) {
    QueueCustom queueCustom = new QueueCustom();
    queueCustom.add(1);
    queueCustom.add(2);
    queueCustom.add(3);
    queueCustom.add(4);
    queueCustom.add(5);
    System.out.println("Head::"+ queueCustom.head%5);
    System.out.println("Tail::"+ queueCustom.tail%5);
    System.out.println(queueCustom.remove());
    System.out.println(queueCustom.remove());
    System.out.println(queueCustom.remove());
    System.out.println(queueCustom.remove());
    System.out.println("Head::"+ queueCustom.head%5);
    System.out.println("Tail::"+ queueCustom.tail%5);
    queueCustom.add(78);
    System.out.println("Head::"+ queueCustom.head%5);
    System.out.println("Tail::"+ queueCustom.tail%5);
    }
}
