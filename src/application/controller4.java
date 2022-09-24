package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class controller4 
{
	@FXML
	private RadioButton rbut1,rbut2,rbut3;
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void submit(ActionEvent event) throws IOException  
	{
	
	if(rbut1.isSelected())
	{
		Parent root= FXMLLoader.load(getClass().getResource("add.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
		scene = new Scene(root,Color.BLACK);
		stage.setScene(scene);
		String css=this.getClass().getResource("application.css").toExternalForm();
		scene.getStylesheets().add(css);
		stage.show();
	}
	else if(rbut2.isSelected())
	{
		Parent root= FXMLLoader.load(getClass().getResource("delete.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
		scene = new Scene(root,Color.BLACK);
		stage.setScene(scene);
		String css=this.getClass().getResource("application.css").toExternalForm();
		scene.getStylesheets().add(css);
		stage.show();
	}
	else if(rbut3.isSelected())
	{
		Parent root= FXMLLoader.load(getClass().getResource("edit.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
		scene = new Scene(root,Color.BLACK);
		stage.setScene(scene);
		String css=this.getClass().getResource("application.css").toExternalForm();
		scene.getStylesheets().add(css);
		stage.show();
	}
	
	
	}
	
	public void switchToScene3(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("developer2.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
		scene = new Scene(root,Color.BLACK);
		stage.setScene(scene);
		String css=this.getClass().getResource("application.css").toExternalForm();
		scene.getStylesheets().add(css);
		stage.show();
		
		

	}
	public void switchToScene1(ActionEvent event) throws IOException  
	{
		Parent root= FXMLLoader.load(getClass().getResource("maincss.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
		scene = new Scene(root,Color.BLACK);
		stage.setScene(scene);
		String css=this.getClass().getResource("application.css").toExternalForm();
		scene.getStylesheets().add(css);
		stage.show();
	}

}
