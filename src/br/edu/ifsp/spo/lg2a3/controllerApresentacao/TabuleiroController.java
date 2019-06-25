package br.edu.ifsp.spo.lg2a3.controllerApresentacao;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class TabuleiroController implements Initializable {

	@FXML private Button btnVoltar;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("oi");
		btnVoltar.setOnMouseClicked((MouseEvent e)-> {

			try {
				AbrirTela.trocarScene("../apresentacao/selecaoJogadores.fxml");
				
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		});
		
	}
	
}
