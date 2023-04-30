package Labs01.Dang5;

public class Dang5 {
    public static void main(String[] args) {
        CustomHashMap customHashMap = new CustomHashMap();
        CustomHashMap customHashMap2 = new CustomHashMap();
        int[][] arr = {{1, 2}, {3, 4}, {5, 6}, {7, 99}, {5, 92}, {45, 23}, {1,99}, {788, 661}, {782, 345}, {15, 88}, {16, 3}};

        for (int i = 0; i < arr.length; i++) {
            customHashMap.setValue(arr[i][0], arr[i][1]);
        }

        for (int i = 0; i < customHashMap.getSize(); i++) {
            System.out.println("[Index :: Value] --- " + "["+ i + " :: " + customHashMap.getValueIndex(i) + "]");
        }

        System.out.println("--------");

        for (int i = 0; i < arr.length; i++) {
            customHashMap2.setValue(arr[i][0], arr[i][1], false);
        }

        for (int i = 0; i < customHashMap.getSize(); i++) {
            System.out.println("[Index :: Value] --- " + "["+ i + " :: " + customHashMap2.getValueIndex(i) + "]");
        }
        System.out.println(arr[0][0] + "---"+arr[0][1]);
    }
}
