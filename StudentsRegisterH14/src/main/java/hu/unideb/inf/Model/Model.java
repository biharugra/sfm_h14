package hu.unideb.inf.Model;

import java.time.LocalDate;

public class Model {
    private Students student;

    public Model(){
        this.student = new Students("Rob Smith", 55, LocalDate.of(1991, 12, 03));
    }

    public Students getStudent() {
        return student;
    }

    public void setStudent(Students student) {
        this.student = student;
    }
}
