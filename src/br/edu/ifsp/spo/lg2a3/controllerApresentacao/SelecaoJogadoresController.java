package br.edu.ifsp.spo.lg2a3.controllerApresentacao;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;;

public class SelecaoJogadoresController implements Initializable {

	@FXML private Button btn2Jogadores;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	
		
		
		btn2Jogadores.setOnMouseClicked((MouseEvent e)-> {
			
			try {
				AbrirTela.trocarScene("../apresentacao/Tabuleiro.fxml");
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		
	}

}
