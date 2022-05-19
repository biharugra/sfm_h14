package hu.inf.unideb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Notebook {

    @Id
    @GeneratedValue
    private Integer id;
    private String manufacturer;
    private String type;
    private double display;
    private int memory;
    private int hard_drive;
    private String gpu;
    private int price;
    private int cpu_id;
    private int os_id;
    private int amount;

    public Notebook(Integer id, String manufacturer, String type, double display, int memory, int hard_drive, String gpu, int price, int cpu_id, int os_id, int amount) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.type = type;
        this.display = display;
        this.memory = memory;
        this.hard_drive = hard_drive;
        this.gpu = gpu;
        this.price = price;
        this.cpu_id = cpu_id;
        this.os_id = os_id;
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDisplay() {
        return display;
    }

    public void setDisplay(float display) {
        this.display = display;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getHard_drive() {
        return hard_drive;
    }

    public void setHard_drive(int hard_drive) {
        this.hard_drive = hard_drive;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCpu_id() {
        return cpu_id;
    }

    public void setCpu_id(int cpu_id) {
        this.cpu_id = cpu_id;
    }

    public int getOs_id() {
        return os_id;
    }

    public void setOs_id(int os_id) {
        this.os_id = os_id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
