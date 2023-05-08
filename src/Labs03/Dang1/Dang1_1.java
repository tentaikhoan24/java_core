package Labs03.Dang1;

public class Dang1_1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        try {
            System.out.println(3/0);
        } catch (Exception e) {
            throw new Exception(e);
        }finally {
            System.out.println("Finally");
        }
    }

}
