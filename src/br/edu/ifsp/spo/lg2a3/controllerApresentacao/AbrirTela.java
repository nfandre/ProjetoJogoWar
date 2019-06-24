package br.edu.ifsp.spo.lg2a3.controllerApresentacao;


import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class AbrirTela extends Application {
	private static Stage stage;

	
	@Override
	public void start(Stage primaryStage) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("../apresentacao/inicioJogo.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("War");
		primaryStage.setScene(scene);
		setStage(primaryStage);
		primaryStage.show();
	}
	public static Stage getStage() {
		return stage;
	}
	public static  void setStage(Stage stage) {
		AbrirTela.stage = stage;
	}
	public static void main(String[] args) {
		launch(args);
	}
	public static void trocarScene( String nomeArquivoFxml) throws IOException{
		
		AbrirTela c = new AbrirTela();
		Parent rootTroca = c.trocaArquivoFxml(nomeArquivoFxml);
		
		getStage().setScene(new Scene(rootTroca));
		getStage().show();
	}
	public Parent trocaArquivoFxml(String nomeArquivoFxml) throws IOException {
		return FXMLLoader.load(getClass().getResource(nomeArquivoFxml));
	}

	
}
