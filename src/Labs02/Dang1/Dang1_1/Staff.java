package Labs02.Dang1.Dang1_1;

public class Staff extends Person {
    private String school;
    private  Double salary;

    public Staff(String name, String address, String school, Double salary) {
        super(name, address);
        this.salary = salary;
        this.school = school;
    }
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double upToSalary(Integer percent) {
        return salary*(1 + percent/100);
    }
}
