package hu.inf.unideb;

import hu.inf.unideb.model.Notebook;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;


public class NotebookTable implements Initializable {

    @FXML
    private TableView<Notebook> twTable;

    @FXML
    private TableColumn<Notebook, Integer> tcolId;

    @FXML
    private TableColumn<Notebook, String> tcolManufacturer;

    @FXML
    private TableColumn<Notebook, String> tcolType;

    @FXML
    private TableColumn<Notebook, Double> tcolDisplay;

    @FXML
    private TableColumn<Notebook, Integer> tcolMemory;

    @FXML
    private TableColumn<Notebook, Integer> tcolHard_Drive;

    @FXML
    private TableColumn<Notebook, String> tcolGpu;

    @FXML
    private TableColumn<Notebook, Integer> tcolPrice;

    @FXML
    private TableColumn<Notebook, Integer> tcolCpu;

    @FXML
    private TableColumn<Notebook, Integer> tcolOs;

    @FXML
    private TableColumn<Notebook, Integer> tcolAmount;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
