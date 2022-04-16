/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.unideb.inf.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Notebook {
    @Id
    @GeneratedValue
    private int id;
    private int shop_id;
    private String manufacturer;
    private String name;
    private String screen;
    private int memory;
    private int hdd;
    private String vga;
    private String cpu;
    private String opsystem;
    private int price;
    private int amount;

    @Override
    public String toString() {
        return "Notebook{" +
                "id=" + id +
                ", shop_id=" + shop_id +
                ", manufacturer='" + manufacturer + '\'' +
                ", name='" + name + '\'' +
                ", screen='" + screen + '\'' +
                ", memory=" + memory +
                ", hdd=" + hdd +
                ", vga='" + vga + '\'' +
                ", cpu='" + cpu + '\'' +
                ", opsystem='" + opsystem + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getShop_id() {
        return shop_id;
    }

    public void setShop_id(int shop_id) {
        this.shop_id = shop_id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public String getVga() {
        return vga;
    }

    public void setVga(String vga) {
        this.vga = vga;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getOpsystem() {
        return opsystem;
    }

    public void setOpsystem(String opsystem) {
        this.opsystem = opsystem;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
