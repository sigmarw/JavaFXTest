package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

	@FXML
	TextArea out;

	@FXML
	TextField in1;
	@FXML
	TextField in2;
	@FXML
	TextField in3;
	@FXML
	TextField in4;

	@Override
	public void start(final Stage primaryStage) {
		try {
			final AnchorPane page = (AnchorPane) FXMLLoader.load(getClass()
					.getResource("/MainWindow.fxml"));
			final Scene scene = new Scene(page, 400, 400);
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
	void b1(final ActionEvent e) {
		out.setText(out.getText() + in1.getText() + "\n");
	}

	@FXML
	void b2(final ActionEvent e) {
		out.setText(out.getText() + in2.getText() + "\n");
	}

	@FXML
	void b3(final ActionEvent e) {
		out.setText(out.getText() + in3.getText() + "\n");
	}

	@FXML
	void b4(final ActionEvent e) {
		out.setText(out.getText() + in4.getText() + "\n");
	}
}
