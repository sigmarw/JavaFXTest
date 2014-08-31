package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

	@FXML
	TextArea out;

	@Override
	public void start(final Stage primaryStage) {
		try {
			final AnchorPane page = (AnchorPane) FXMLLoader.load(getClass()
					.getResource("/MainWindow.fxml"));
			final Scene scene = new Scene(page, 400, 400);
			scene.getStylesheets().add(
					getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("BlahDiBlah");
			primaryStage.show();
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(final String[] args) {
		launch(args);
	}

	@FXML
	void b4(final ActionEvent e) {
		System.out.println("hi");
		out.setText("3======>");
	}
}
