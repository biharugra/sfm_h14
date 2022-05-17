/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.unideb.inf.controller;

import hu.unideb.inf.model.Notebook;
import java.net.URL;
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

    final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("br.com.fredericci.pu");
    final EntityManager entityManager = entityManagerFactory.createEntityManager();

    @FXML
    void handleSerach(ActionEvent event) {
        System.out.println("Search btn pushed");

        //adatb listája
        ObservableList<Notebook> databaseList = FXCollections.observableArrayList(getDatabase());
        //System.out.println(databaseList);

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

        tableViewData.setItems(databaseList);
    }

    // lekérdez mindent a notebook táblából
    public List<Notebook> getDatabase() {
        Query q1 = entityManager.createQuery("SELECT n FROM Notebook n");
        return q1.getResultList();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
