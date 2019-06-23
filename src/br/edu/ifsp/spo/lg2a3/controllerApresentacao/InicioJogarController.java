package br.edu.ifsp.spo.lg2a3.controllerApresentacao;

import java.net.URL;
import java.util.ResourceBundle;
import com.sun.corba.se.spi.orbutil.fsm.Action;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;



public class InicioJogarController implements Initializable{

	 @FXML private Button btnJogar;
	
	   
	


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		btnJogar.setOnMouseClicked((MouseEvent e)->{
			
			App.getStage().close();
		});
	}}
