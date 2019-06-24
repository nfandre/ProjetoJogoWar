package br.edu.ifsp.spo.lg2a3.controllerApresentacao;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class SelecaoJogadoresController implements Initializable {

	@FXML private Button btn2jogadores;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		btn2jogadores.setOnMouseClicked((MouseEvent e)-> {
			
			AbrirTela.trocarScene(nomeArquivoFxml);
		});
		
	}

}
