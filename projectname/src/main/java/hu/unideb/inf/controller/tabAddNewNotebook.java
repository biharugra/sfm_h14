package hu.unideb.inf.controller;

import hu.unideb.inf.model.Notebook;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class tabAddNewNotebook implements Initializable {

    @FXML
    private TextField textfieldManufacturer;

    @FXML
    private Button buttonAdd;

    @FXML
    private ChoiceBox<?> choiceboxShop;

    @FXML
    private TextField textfieldAmount;

    @FXML
    private TextField textfieldCpu;

    @FXML
    private TextField textfieldHdd;

    @FXML
    private TextField textfieldMemory;

    @FXML
    private TextField textfieldName;

    @FXML
    private TextField textfieldOpsystem;

    @FXML
    private TextField textfieldPrice;

    @FXML
    private TextField textfieldScreen;

    @FXML
    private TextField textfieldVga;

    @FXML
    private Label labelWarning0;

    @FXML
    private Label labelWarning1;


    final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("br.com.fredericci.pu");
    final EntityManager entityManager = entityManagerFactory.createEntityManager();

    @FXML
    void handleAdd(ActionEvent event) {
        System.out.println("Add button pushed");

        // adatok ell.
        boolean result = checkFields();

        if (result){
            labelWarning0.setOpacity(0);
            labelWarning1.setOpacity(0);
            Notebook newNotebook = getNewNotebookDetails();
            addToDatabase(newNotebook);
        }else
        {labelWarning0.setOpacity(1);labelWarning1.setOpacity(1);}
    }

    // megnézi azokat a textfieldeket amik számot várnak h számokat kaptak e, ha nem
    // megjeleníti az Error labelt az Add gomb alatt
    public boolean checkFields(){
        try
        {
            Integer.parseInt(textfieldMemory.getText());
            Integer.parseInt(textfieldHdd.getText());
            Integer.parseInt(textfieldPrice.getText());
            Integer.parseInt(textfieldAmount.getText());
            return true;
        }
        catch (NumberFormatException e)
        {
            System.out.println("Caught the 'checkFields function' !");
            return false;
        }
    }

    // lekérdezi, eltárolja, visszaadja a textfield-ek ben lévő adatokat
    public Notebook getNewNotebookDetails(){
        Notebook newNotebook = new Notebook();
        newNotebook.setManufacturer(textfieldManufacturer.getText());
        newNotebook.setScreen(textfieldScreen.getText());
        newNotebook.setMemory(Integer.parseInt(textfieldMemory.getText()));
        newNotebook.setHdd(Integer.parseInt(textfieldHdd.getText()));
        newNotebook.setVga(textfieldVga.getText());
        newNotebook.setCpu(textfieldCpu.getText());
        newNotebook.setOpsystem(textfieldOpsystem.getText());
        newNotebook.setName(textfieldName.getText());
        newNotebook.setPrice(Integer.parseInt(textfieldPrice.getText()));
        newNotebook.setAmount(Integer.parseInt(textfieldAmount.getText()));

        // shop ?
        //newNotebook.setShop_id();

        return newNotebook;
    }

    // egy notebbok-ot feltölt az adatbázisba
    void addToDatabase(Notebook n){
        entityManager.getTransaction().begin();
        entityManager.persist(n);
        entityManager.getTransaction().commit();
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}