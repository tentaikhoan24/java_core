package Labs02.Dang1.Dang1_1;

public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }
}
