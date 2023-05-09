package Test;

public class Test {
    static boolean compare(String name1, String name2) {
        String[] arr1 = name1.trim().split("\\s+");
        String[] arr2 = name2.trim().split("\\s+");
        if (arr1[arr1.length - 1].compareTo(arr2[arr2.length - 1]) < 0){
            return true;
        }else if (arr1[arr1.length - 1].compareTo(arr2[arr2.length - 1]) > 0) {
            return false;
        } else if (arr1.length == 2 || arr2.length == 2) {
            if (arr1[0].compareTo(arr2[0]) < 0){
                return true;
            }else if (arr1[0].compareTo(arr2[0]) > 0) {
                return false;
            }
        } else {
            int index = 1;
            while (index < Math.min(arr1.length - 2, arr2.length - 2)){
                if (arr1[index].compareTo(arr2[index]) < 0){
                    return true;
                }else if (arr1[index].compareTo(arr2[index]) > 0) {
                    return false;
                }
                index++;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String name1 = "hoang manh dung";
        String[] arr1 = name1.trim().split("\\s+");
        System.out.println(arr1.length);
        for (int i = 0; i < 3; i++){
            System.out.println(arr1[i]);
        }
        System.out.println(compare("Hoang Manh Dung", "Hoang Anh Anh"));
    }
}
