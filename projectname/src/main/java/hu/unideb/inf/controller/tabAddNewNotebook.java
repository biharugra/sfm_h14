package hu.unideb.inf.controller;

import hu.unideb.inf.model.Notebook;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.net.URL;
import java.util.ResourceBundle;

public class tabAddNewNotebook implements Initializable {

    @FXML
    private Button buttonAdd;

    @FXML
    private TextField textfieldName;

    @FXML
    void handleAdd(ActionEvent event) {
        System.out.println("Add button pushed");

        final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("br.com.fredericci.pu");
        final EntityManager entityManager = entityManagerFactory.createEntityManager();


        Notebook s = new Notebook();
        s.setName(textfieldName.getText());


        entityManager.getTransaction().begin();
        entityManager.persist(s);
        entityManager.getTransaction().commit();




    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}