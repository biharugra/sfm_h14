package hu.unideb.inf.Model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;

public class Students {
    private StringProperty name = new SimpleStringProperty();
    private int credits;
    private LocalDate dateOfBirth;

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                '}';
    }

    public Students(String name, int credits, LocalDate dateOfBirth) {
        this.name.setValue(name);
        this.credits = credits;
        this.dateOfBirth = dateOfBirth;
    }

    public StringProperty nameProperty(){
        return name;
    }

    public void setName(String name) {
        this.name.setValue(name);
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name.getValue();
    }

    public int getCredits() {
        return credits;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
