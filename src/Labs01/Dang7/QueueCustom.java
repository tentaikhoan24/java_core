package Labs01.Dang7;

public class QueueCustom {
    private Integer length = 5;
    private Integer[] arr = new Integer[length];
    private Integer head = -1;
    private Integer tail = -1;

    public QueueCustom() {}

    public void add(Integer value) {
        if (isEmpty()){
            arr[head+1] = value;
            tail++;
            head++;
        } else if (isFull()) {
            System.out.println("Queue is full!");
        } else {
            arr[(tail+1)%length] = value;
            tail = tail +1;
        }
    }

    //retrieves and removes the head of this queue
    public Integer remove() {
        if (isEmpty()){
            System.out.println("Queue is empty!");
            return null;
        } else {
            if (head%5 == tail%length){
                int index = head%length;
                head = -1;
                tail = -1;
                return arr[index];
            } else {
                int index = head%length;
                head++;
                return arr[index];
            }
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
        if (head%length == 0 && tail%length == 4){
            return true;
        }
        if(head%5 > tail%length && tail%length-head%length == 1){
            return true;
        }
        return false;
    }
    public Boolean isEmpty() {
        if (head == -1 && tail == -1){
            return  true;
        }
        return false;
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
