package TableView;

import PhoneList.InputPhone;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private TableView<InputPhone> table;



    @FXML
    private TableColumn<InputPhone, String> nameColumn;

    @FXML
    private TableColumn<InputPhone, String> phoneColumn;


    private ObservableList<InputPhone> phoneList;



    @FXML
    private TextField nameText;

    @FXML
    private TextField phoneText;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        phoneList = FXCollections.observableArrayList(
                new InputPhone("Nam", "091282"),
                new InputPhone("Hưng", "093939")
        );

        nameColumn.setCellValueFactory(new PropertyValueFactory<InputPhone, String>("name"));
        phoneColumn.setCellValueFactory(new PropertyValueFactory<InputPhone, String>("phone"));

        table.setItems(phoneList);
    }

    public void add (ActionEvent e){
        InputPhone newList = new InputPhone();

        newList.setName(nameText.getText());
        newList.setPhone(phoneText.getText());

        phoneList.add(newList);
    }

}