package ui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;

public class ControllerArbolPintado implements Initializable {

	private ControllerMenu cm;
	
	@FXML
	private Canvas arbolPintado;
	@FXML
	private Button jugar;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		cm = new ControllerMenu();
	}

	
	
}
