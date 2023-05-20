package Labs07.Bai5;

import java.util.Optional;

class Student{
    String name;
}

public class Bai5_1 {
    private Student getStudent(){
        Student student = new Student();
        return null;
    }

    public void notUsedOptional(){
        Student student = getStudent();
        if (student != null) System.out.println(student.name);
    }

    public void usedOptional(){
        Student student = getStudent();
        Optional<Student> opt = Optional.of(student);
        //cach 1
        if (opt.isPresent()){
            System.out.println(opt.get().name);
        }

        //cach 2
        opt.ifPresent(s -> System.out.println(s.name));
    }
}