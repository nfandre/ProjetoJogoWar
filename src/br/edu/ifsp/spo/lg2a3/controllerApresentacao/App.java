package br.edu.ifsp.spo.lg2a3.controllerApresentacao;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class App extends Application {
	private static Stage stage;
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		Parent root = FXMLLoader.load(getClass().getResource("inicioJogo.fxml"));
		System.out.println(root.toString());
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
		App.stage = stage;
	}
	public static void main(String[] args) {
		launch(args);
	}
}
