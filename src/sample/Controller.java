package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;


public class Controller implements Initializable {


    public void showeditDialog(ActionEvent actionEvent) throws Exception{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("editDialogBox.fxml"));
        Parent root = loader.load();
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Add new to do item");
        primaryStage.setScene(new Scene(root, 600, 400));


        Question temporaryQuestion = new Question();
        ((dialogcontroller)loader.getController()).currentStage = primaryStage;
        ((dialogcontroller)loader.getController()).setQuestion(temporaryQuestion);

        primaryStage.showAndWait();
        listView.getItems().add(temporaryQuestion);

    }


    public void removeQuestion(ActionEvent actionEvent) {

        listView.getItems().remove(0);



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
//


                            //Question Box
                            Label question_box = new Label();


                            question_box.setText("Q )  " + item.getQuestion());
                            question_box.setLayoutX(20);
                            question_box.setLayoutY(20);
                            question_box.setPrefWidth(200);
                            question_box.setPrefHeight(50);

                            //Option 1
                            Label opt1 = new Label();
                            opt1.setText(item.getOpt1());
                            opt1.setLayoutX(20);
                            opt1.setLayoutY(104);
                            opt1.setPrefHeight(20);
                            opt1.setPrefWidth(100);


                            Label opt2 = new Label();
                            opt2.setText(item.getOpt2());
                            opt2.setLayoutX(20);
                            opt2.setLayoutY(134);
                            opt2.setPrefHeight(20);
                            opt2.setPrefWidth(100);


                            Label opt3 = new Label();
                            opt3.setText(item.getOpt3());
                            opt3.setLayoutX(20);
                            opt3.setLayoutY(164);
                            opt3.setPrefHeight(20);
                            opt3.setPrefWidth(100);


                            Label opt4 = new Label();
                            opt4.setText(item.getOpt4());
                            opt4.setLayoutX(20);
                            opt4.setLayoutY(194);
                            opt4.setPrefHeight(20);
                            opt4.setPrefWidth(100);

                            ToggleGroup group = new ToggleGroup();

                            RadioButton rb1 = new RadioButton();
                            rb1.setToggleGroup(group);
                            rb1.setLayoutY(110);

                            RadioButton rb2 = new RadioButton();
                            rb2.setToggleGroup(group);
                            rb2.setLayoutY(140);

                            RadioButton rb3 = new RadioButton();
                            rb3.setToggleGroup(group);
                            rb3.setLayoutY(170);

                            RadioButton rb4 = new RadioButton();
                            rb4.setToggleGroup(group);
                            rb4.setLayoutY(200);



                            AnchorPane anchorPane = new AnchorPane();
                            anchorPane.getChildren().addAll(question_box,opt1,opt2,opt3,opt4,rb1,rb2,rb3,rb4);

                            setGraphic(anchorPane);
                            System.out.println(" it is not empty");

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
