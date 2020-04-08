package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;


public class Controller implements Initializable {


    public void showeditDialog(ActionEvent actionEvent) {


        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(anchorPane.getScene().getWindow());
        dialog.setTitle("Add new to do item");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("editDialogBox.fxml"));
        try {

            dialog.getDialogPane().setContent(fxmlLoader.load());

        } catch (IOException e) {
            System.out.println("Couldn't load the display");
            e.printStackTrace();
            return;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();

        if (result.isPresent() && result.get() == ButtonType.OK) {
            listView.getItems().add(new Question());



        }









    }

    private class Question{
        String question;
        String opt1;
    }

    Stage currentStage;
    @FXML AnchorPane anchorPane;
    @FXML ListView listView;







    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listView.setCellFactory(new Callback() {
            @Override
            public Object call(Object param) {
                return new ListCell<Question>() {

                    @Override
                    protected void updateItem(Question item, boolean empty) {
                        super.updateItem(item, empty);
                        if(!empty) {

                            dialogcontroller dialogcontroller = new dialogcontroller();



                            setHeight(1000);

                            //Question Box
                            TextField question_box = new TextField();

                            question_box.setText(dialogcontroller.editQuestion.getText().trim());
                            question_box.setLayoutX(20);
                            question_box.setLayoutY(20);
                            question_box.setPrefWidth(200);
                            question_box.setPrefHeight(50);

                            //Option 1
                            TextField opt1 = new TextField();
                            opt1.setText(dialogcontroller.editopt1.getText().trim());
                            opt1.setLayoutX(20);
                            opt1.setLayoutY(100);
                            opt1.setPrefHeight(20);
                            opt1.setPrefWidth(100);


                            TextField opt2 = new TextField();
                            opt2.setText(dialogcontroller.editopt2.getText().trim());
                            opt2.setLayoutX(20);
                            opt2.setLayoutY(130);
                            opt2.setPrefHeight(20);
                            opt2.setPrefWidth(100);


                            TextField opt3 = new TextField();
                            opt3.setText(dialogcontroller.editopt3.getText().trim());
                            opt3.setLayoutX(20);
                            opt3.setLayoutY(160);
                            opt3.setPrefHeight(20);
                            opt3.setPrefWidth(100);


                            TextField opt4 = new TextField();
                            opt4.setText(dialogcontroller.editopt4.getText().trim());
                            opt4.setLayoutX(20);
                            opt4.setLayoutY(190);
                            opt4.setPrefHeight(20);
                            opt4.setPrefWidth(100);

                            AnchorPane anchorPane = new AnchorPane();
                            anchorPane.getChildren().addAll(question_box,opt1,opt2,opt3,opt4);

                            setGraphic(anchorPane);

                        }
                    }
                };
            }
        });
    }

    public void setCurrentStage(Stage stage){
        this.currentStage = stage;
    }



}
