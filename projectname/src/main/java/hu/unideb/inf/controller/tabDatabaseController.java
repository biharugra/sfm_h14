/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.unideb.inf.controller;

import hu.unideb.inf.model.Notebook;
import java.net.URL;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import javax.persistence.*;


public class tabDatabaseController implements Initializable {

    @FXML
    private Button btnSearch;

    @FXML
    private AnchorPane tabDatabase;

    @FXML
    private TableView<Notebook> tableViewData;

    @FXML
    private TableColumn<Notebook, Integer> tcolAmount;

    @FXML
    private TableColumn<Notebook, String> tcolCpu;

    @FXML
    private TableColumn<Notebook, Integer> tcolHdd;

    @FXML
    private TableColumn<Notebook, String> tcolManufacturer;

    @FXML
    private TableColumn<Notebook, Integer> tcolMemory;

    @FXML
    private TableColumn<Notebook, String> tcolName;

    @FXML
    private TableColumn<Notebook, String> tcolOpsystem;

    @FXML
    private TableColumn<Notebook, Integer> tcolPrice;

    @FXML
    private TableColumn<Notebook, String> tcolScreen;

    @FXML
    private TableColumn<Notebook, Integer> tcolShopid;

    @FXML
    private TableColumn<Notebook, String> tcolVga;

    @FXML
    private TextField textfSearch;

    @FXML
    void handleSerach(ActionEvent event) {
        System.out.println("btn pushed");
/*
        final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("br.com.fredericci.pu");
        final EntityManager entityManager = entityManagerFactory.createEntityManager();*/

/*
        Notebook s = new Notebook();
        s.setName(textfSearch.getText());
        s.setPrice(40);

        entityManager.getTransaction().begin();
        entityManager.persist(s);
        entityManager.getTransaction().commit();*/

        // test
        /*
        ObservableList<Notebook> databaseList =FXCollections.observableArrayList();
        databaseList.add(new Notebook());*/

/*
        Query q1 = entityManager.createQuery("SELECT n FROM Notebook n");
        databaseList = q1.getResultList();*/

        //adatb listája
        ObservableList<Notebook> getDatabase = FXCollections.observableArrayList(find());
        System.out.println(getDatabase);


        // tableview
        tcolShopid.setCellValueFactory(new PropertyValueFactory<Notebook,Integer>("shop_id"));
        tcolManufacturer.setCellValueFactory(new PropertyValueFactory<Notebook,String>("manufacturer"));
        tcolName.setCellValueFactory(new PropertyValueFactory<Notebook,String>("name"));
        tcolScreen.setCellValueFactory(new PropertyValueFactory<Notebook,String>("screen"));
        tcolMemory.setCellValueFactory(new PropertyValueFactory<Notebook,Integer>("memory"));
        tcolHdd.setCellValueFactory(new PropertyValueFactory<Notebook,Integer>("hdd"));
        tcolVga.setCellValueFactory(new PropertyValueFactory<Notebook,String>("vga"));
        tcolCpu.setCellValueFactory(new PropertyValueFactory<Notebook,String>("cpu"));
        tcolOpsystem.setCellValueFactory(new PropertyValueFactory<Notebook,String>("opsystem"));
        tcolPrice.setCellValueFactory(new PropertyValueFactory<Notebook,Integer>("price"));
        tcolAmount.setCellValueFactory(new PropertyValueFactory<Notebook,Integer>("amount"));

        tableViewData.setItems(getDatabase);

    }

    final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("br.com.fredericci.pu");
    final EntityManager entityManager = entityManagerFactory.createEntityManager();

    ObservableList<Notebook> databaseList =FXCollections.observableArrayList();
    List<Notebook> list = new ArrayList<>();

    // lekérdez mindent a notebook táblából
    public List<Notebook> find() {
        Query q1 = entityManager.createQuery("SELECT n FROM Notebook n");


        return q1.getResultList();
    }


/*
    @FXML
    void handleAdd(ActionEvent event) {
        System.out.println("btn pushed");

        final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("br.com.fredericci.pu");
        final EntityManager entityManager = entityManagerFactory.createEntityManager();


        Notebook s = new Notebook();
        s.setName(textfieldAdd.getText());
        s.setPrice(40);

        entityManager.getTransaction().begin();
        entityManager.persist(s);
        entityManager.getTransaction().commit();

        Notebook getdata = entityManager.find(Notebook.class,10);

        System.out.println(getdata);

        ObservableList<Notebook> list =FXCollections.observableArrayList();
        list.add(getdata);
        System.out.println(getdata);

        tcolId.setCellValueFactory(new PropertyValueFactory<Notebook, Integer>("id"));
        tcolName.setCellValueFactory(new PropertyValueFactory<Notebook, String>("name"));
        tcolPrice.setCellValueFactory(new PropertyValueFactory<Notebook, String>("price"));

        tableViewData.setItems(list);


    }*/



    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
