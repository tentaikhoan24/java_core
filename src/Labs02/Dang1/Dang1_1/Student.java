package Labs02.Dang1.Dang1_1;

public class Student extends Person {
    private String program;
    private Integer year;
    private Double score;

    public Student(String name, String address, String program, Integer year, Double score) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.score = score;
    }


    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getRating(Double score) {
        if (score >= 9){
            return "Xuat sac";
        } else if (score >= 8) {
            return "Gioi";
        } else if (score >= 7) {
            return "Kha";
        } else if (score >= 5) {
            return "Trung binh";
        } else if (score >= 4 ) {
            return "Yeu";
        }else {
            return "Kem";
        }
    }
}
