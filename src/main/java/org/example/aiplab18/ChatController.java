package org.example.aiplab18;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ChatController {
    @FXML
    private TextArea Display;
    @FXML
    private TextField MessageInp;
    @FXML
    private Button SendButton;

    @FXML
    private void sendMsg(ActionEvent event) {
        String message = MessageInp.getText();
        if (!message.isEmpty()){
            Display.appendText(message+"\n");
            MessageInp.clear();
        }
    }
}