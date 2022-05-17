package hu.inf.unideb.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class JoinTable {

    @Id
    @GeneratedValue
    private int id;
    private String proc_id;
    private String os_id;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "Processzor")
    @JoinColumn(name = "Operációs rendszer")
    private List<Notebook> notebooks = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProc_id() {
        return proc_id;
    }

    public void setProc_id(String proc_id) {
        this.proc_id = proc_id;
    }

    public String getOs_id() {
        return os_id;
    }

    public void setOs_id(String os_id) {
        this.os_id = os_id;
    }

    public List<Notebook> getNotebooks() {
        return notebooks;
    }

    public void setNotebooks(List<Notebook> notebooks) {
        this.notebooks = notebooks;
    }
}
