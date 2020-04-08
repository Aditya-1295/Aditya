package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class dialogcontroller {


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

    String question;
    String option1;
    String option2;
    String option3;
    String option4;


    public void processResult(){
        question = editQuestion.getText().trim();
        option1 = editopt1.getText().trim();
        option2 = editopt2.getText().trim();
        option3 = editopt3.getText().trim();
        option4 = editopt4.getText().trim();

        System.out.println(question);
        System.out.println(option1);
        System.out.println(option2);
        System.out.println(question);
        System.out.println(question);



    }

}
