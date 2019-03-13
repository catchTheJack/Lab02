package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.alien.model.AlienModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
	AlienModel model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtWord;

    @FXML
    private Button btnTranslate;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;

    @FXML
    void doReset(ActionEvent event) {
    	txtResult.clear();

    }

    @FXML
    void doTranslate(ActionEvent event) {
    	String[] sx = txtWord.getText().split(" ");
    	if(sx.length == 1) {
    		txtResult.setText(model.getTrad(txtWord.getText()));
    		txtWord.clear();
    	}
    	else if(sx.length == 2) {
    		model.addWord(txtWord.getText());
    		txtWord.clear();
    		txtResult.setText("System correctly update\n");
    	}
    	else {
    		txtWord.clear();
    		txtResult.setText("Invalid form of data\n");
    	}


    }

    @FXML
    void initialize() {
        assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";

    }

	public AlienModel getModel() {
		return model;
	}

	public void setModel(AlienModel model) {
		this.model = model;
	}
    
    

}

