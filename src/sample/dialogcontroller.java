package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


import java.net.URL;
import java.util.ResourceBundle;


public class dialogcontroller implements Initializable{

    Question temporaryQuestion;

    @FXML
    public TextField editQuestion;
    @FXML
    public TextField editopt1;
    @FXML
    public TextField editopt2;
    @FXML
    public TextField editopt3;
    @FXML
    public TextField editopt4;

    Stage currentStage;

    String question;
    String option1;
    String option2;
    String option3;
    String option4;


    public void processResult(MouseEvent mouseEvent){

        temporaryQuestion.setQuestion(editQuestion.getText().trim());
        temporaryQuestion.setOpt1(editopt1.getText());
        temporaryQuestion.setOpt2(editopt2.getText());
        temporaryQuestion.setOpt3(editopt3.getText());
        temporaryQuestion.setOpt4(editopt4.getText());
        currentStage.close();

    }

    public void setQuestion(Question temporaryQuestion) {
        this.temporaryQuestion = temporaryQuestion;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Platform.runLater(()->{
            editQuestion.setText(temporaryQuestion.getQuestion());
            editopt1.setText(temporaryQuestion.getOpt1());
            editopt2.setText(temporaryQuestion.getOpt2());
            editopt3.setText(temporaryQuestion.getOpt3());
            editopt4.setText(temporaryQuestion.getOpt4());

        });

    }
}
