package hu.inf.unideb;

import hu.inf.unideb.model.Model;
import hu.inf.unideb.model.Notebook;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;


public class FXMLController implements Initializable {
    private Model model;

    public void setModel(Model model)
    {
        this.model = model;
    }

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

    @FXML
    private Button button;
/*
    private void refreshUI(){

        tcolId.setText(model.getNotebook().getId().toString());
        tcolManufacturer.setText("" + model.getNotebook().getManufacturer());
        tcolType.setText("" + model.getNotebook().getType());
        tcolDisplay.setText("" + model.getNotebook().getDisplay());
        tcolMemory.setText("" + model.getNotebook().getMemory());
        tcolHard_Drive.setText("" + model.getNotebook().getHard_drive());
        tcolGpu.setText("" + model.getNotebook().getGpu());
        tcolPrice.setText("" + model.getNotebook().getPrice());
        tcolCpu.setText("" + model.getNotebook().getCpu_id());
        tcolOs.setText("" + model.getNotebook().getOs_id());
        tcolAmount.setText("" + model.getNotebook().getAmount());
    }
*/

    ObservableList<Notebook> list = FXCollections.observableArrayList(
            new Notebook(1, "HP", "COMPAQ 615 NX556EA", 15.6,  1024, 160, "ATi Mobility Radeon HD3200", 95120, 1,1,0),
            new Notebook(2, "ASUS","K51AC-SX001D", 15.6, 2048,250,	"ATi Mobility Radeon HD3200 256MB"	,101200,1, 8, 2)
    );

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        tcolId.setCellValueFactory(new PropertyValueFactory<Notebook, Integer>("id"));
        tcolManufacturer.setCellValueFactory(new PropertyValueFactory<Notebook, String>("manufacturer"));
        tcolType.setCellValueFactory(new PropertyValueFactory<Notebook, String>("type"));
        tcolDisplay.setCellValueFactory(new PropertyValueFactory<Notebook, Double>("display"));
        tcolMemory.setCellValueFactory(new PropertyValueFactory<Notebook, Integer>("memory"));
        tcolHard_Drive.setCellValueFactory(new PropertyValueFactory<Notebook, Integer>("hard_drive"));
        tcolGpu.setCellValueFactory(new PropertyValueFactory<Notebook, String>("gpu"));
        tcolPrice.setCellValueFactory(new PropertyValueFactory<Notebook, Integer>("price"));
        tcolCpu.setCellValueFactory(new PropertyValueFactory<Notebook, Integer>("cpu_id"));
        tcolOs.setCellValueFactory(new PropertyValueFactory<Notebook, Integer>("os_id"));
        tcolAmount.setCellValueFactory(new PropertyValueFactory<Notebook, Integer>("amount"));

        twTable.setItems(list);
    }
    @FXML
    void handleButtonPushed(ActionEvent event) {
        System.out.println("Hello!");
    }
}
