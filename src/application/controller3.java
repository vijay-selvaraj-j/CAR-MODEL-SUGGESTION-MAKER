package application;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class controller3 
{
	@FXML
	private Label label1;
	
	@FXML
	private TextField textfi;
	
	
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	private int pwd=8970;
	int pwdin;
	
	public void submit(ActionEvent event) throws IOException  
	{
		try
		{
		pwdin = Integer.parseInt(textfi.getText());
		if(pwdin==pwd)
		{			
				Parent root= FXMLLoader.load(getClass().getResource("developer2.fxml"));
				stage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
				scene = new Scene(root,Color.BLACK);
				stage.setScene(scene);
				String css=this.getClass().getResource("application.css").toExternalForm();
				scene.getStylesheets().add(css);
				stage.show();	
		}
		else
		{
			label1.setText("Wrong Pin");
		}
		}
		catch(NumberFormatException e)
		{
			label1.setText("Enter only numbers");
		}
		catch(Exception e)
		{
			System.out.println(e);
			label1.setText("Error");
		}
		
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
	
	public void switchToScene2(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("suggestion.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
		scene = new Scene(root,Color.BLACK);
		stage.setScene(scene);
		String css=this.getClass().getResource("application.css").toExternalForm();
		scene.getStylesheets().add(css);
		stage.show();

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

}
