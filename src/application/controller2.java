package application;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class controller2
{
	@FXML
	private RadioButton rbut1,rbut2,rbut3;
	
	@FXML
	private TextArea text1;
	
	@FXML
	private TextField budin;

	private Stage stage;
	private Scene scene;
	private Parent root;
	double budget;
	String en1,en2,en3;
	
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
	
	
	public void suggestion(ActionEvent event)
	{
		
		
		altroz[] obj = new altroz[17];
		obj[0] = new altroz("Altroz XE","Petrol","Basic",5.79);
		obj[1] = new altroz("Altroz XM","Petrol","Basic",6.459);
		obj[2] = new altroz("Altroz XM Plus","Petrol","Basic+",6.75);
		obj[3] = new altroz("Altroz XE Diesel","Diesel","Performance",6.99);
		obj[4] = new altroz("Altroz XT","Petrol","Value for Money",7.289);
		obj[5] = new altroz("Altroz XM Diesel","Diesel","Performance",7.609);
		obj[6] = new altroz("Altroz XZ","Petrol","Comfort",7.859);
		obj[7] = new altroz("Altroz XT Turbo","Turbo Petrol","Value for Money and Performance",7.939);
		obj[8] = new altroz("Altroz XZ Option","Petrol","Comfort+",8.009);
		obj[9] = new altroz("Altroz XZ Plus","Petrol","Comfort+",8.409);
		obj[10] = new altroz("Altroz XT Diesel","Diesel","Value for Money and Performance",8.439);
		obj[11] = new altroz("Altroz XZ Turbo","Turbo Petrol","Comfort and Performance",8.455);
		obj[12] = new altroz("Altroz XZ Option Turbo","Turbo Petrol","Comfort+ and Performance",8.659);
		obj[13] = new altroz("Altroz XZ Diesel","Diesel","Comfort and Performance",9.009);
		obj[14] = new altroz("Altroz XZ Plus Turbo","Turbo Petrol","Comfort+ and Performance",9.059);
		obj[15] = new altroz("Altroz XZ Option Diesel","Diesel","Comfort+ and Performance",9.159);
		obj[16] = new altroz("Altroz XZ Plus Diesel","Diesel","Comfort+ and Performance",9.559);
				
		en1=rbut1.getText();
		en2=rbut2.getText();
		en3=rbut3.getText();
		
		try
		{
		budget = Double.parseDouble(budin.getText());
		}
		catch(NumberFormatException e)
		{
			text1.appendText("\nEnter only numbers in Budget Field");
			text1.appendText("\n------------------------------------------------------------------");
		}
		
			
		for(int i=0;i<16;i++)
		{
			
			if(rbut1.isSelected())
			{
				if((en1.compareToIgnoreCase(obj[i].engine)==0))
				{
					if(budget<=6.5)
					{
						text1.appendText("\nName: Altroz XM\nPrice: 6.459L\nCategory: Basic");
						text1.appendText("\n\nBy paying "+(6.75-budget)+" extra,\nYou get:-\n");
						text1.appendText("\nName: Altroz XM Plus\nPrice: 6.75L\nCategory: Basic+");
						text1.appendText("\n------------------------------------------------------------------");
						break;
					}
					if(budget>6.5&&budget<=7.0)
					{
						text1.appendText("\nName: Altroz XM Plus\nPrice: 6.75L\nCategory: Basic+");
						text1.appendText("\n\nBy paying "+(7.289-budget)+" extra,\nYou get:-\n");
						text1.appendText("\nName: Altroz XT\nPrice: 7.289L\nCategory: Value for Money");
						text1.appendText("\n------------------------------------------------------------------");
						break;
					}
					if(budget>7.0&&budget<=7.5)
					{
						text1.appendText("\nName: Altroz XT\nPrice: 7.289L\nCategory: Value for Money");
						text1.appendText("\n\nBy paying "+(7.859-budget)+" extra,\nYou get:-\n");
						text1.appendText("\nName: Altroz XZ\nPrice: 7.859L\nCategory: Comfort");
						text1.appendText("\n------------------------------------------------------------------");
						break;
					}
					if(budget>7.5&&budget<=8.0)
					{
						text1.appendText("\nName: Altroz XZ\nPrice: 7.859L\nCategory: Comfort");
						text1.appendText("\n\nBy paying "+(8.009-budget)+" extra,\nYou get:-\n");
						text1.appendText("\nName: Altroz XZ Option\nPrice: 8.009L\nCategory: Comfort+");
						text1.appendText("\n------------------------------------------------------------------");
						break;
					}
					if(budget>8.0&&budget<=8.5)
					{
						text1.appendText("\nName: Altroz XZ Plus\nPrice: 8.409L\nCategory: Comfort+");
						text1.appendText("\n------------------------------------------------------------------");
						break;
					}
					if(budget>8.5&&budget<=9.0)
					{
						text1.appendText("\nName: Altroz XZ Plus\nPrice: 8.409L\nCategory: Comfort+");
						text1.appendText("\n------------------------------------------------------------------");
						break;
					}
					if(budget>9.0&&budget<=9.5)
					{
						text1.appendText("\nName: Altroz XZ Plus\nPrice: 8.409L\nCategory: Comfort+");
						text1.appendText("\n------------------------------------------------------------------");
						break;
					}
					if(budget>9.5)
					{
						text1.appendText("\nName: Altroz XZ Plus\nPrice: 8.409L\nCategory: Comfort+");
						text1.appendText("\n------------------------------------------------------------------");
						break;
					}
				}
			}
			
			else if(rbut2.isSelected())
			{
				if((en2.compareToIgnoreCase(obj[i].engine)==0))
				{
					if(budget<=6.5)
					{
						text1.appendText("\n\nBy paying "+(6.99-budget)+" extra,\nYou get:-\n");
						text1.appendText("\nName: Altroz XE Diesel\nPrice: 6.99L\nCategory: Performance");
						text1.appendText("\n------------------------------------------------------------------");
						break;
					}
					if(budget>6.5&&budget<=7.0)
					{
						text1.appendText("\nName: Altroz XE Diesel\nPrice: 6.99L\nCategory: Performance");
						text1.appendText("\n------------------------------------------------------------------");
						break;
					}
					if(budget>7.0&&budget<=7.5)
					{
						text1.appendText("\nName: Altroz XE Diesel\nPrice: 6.99L\nCategory: Performance");
						text1.appendText("\n\nBy paying "+(7.609-budget)+" extra,\nYou get:-\n");
						text1.appendText("\nName: Altroz XM Diesel\nPrice: 7.609L\nCategory: Performance");
						text1.appendText("\n------------------------------------------------------------------");
						break;
					}
					if(budget>7.5&&budget<=8.0)
					{
						text1.appendText("\nName: Altroz XM Diesel\nPrice: 7.609L\nCategory: Performance");
						text1.appendText("\n\nBy paying "+(8.439-budget)+" extra,\nYou get:-\n");
						text1.appendText("\nName: Altroz XT Diesel\nPrice: 8.439L\nCategory: Value for Money and Performance");
						text1.appendText("\n------------------------------------------------------------------");
						break;
					}
					if(budget>8.0&&budget<=8.5)
					{
						text1.appendText("\nName: Altroz XT Diesel\nPrice: 8.439L\nCategory: Value for Money and Performance");
						text1.appendText("\n\nBy paying "+(9.009-budget)+" extra,\nYou get:-\n");
						text1.appendText("\nName: Altroz XZ Diesel\nPrice: 9.009L\nCategory: Comfort and Performance");
						text1.appendText("\n------------------------------------------------------------------");
						break;
					}
					if(budget>8.5&&budget<=9.0)
					{
						text1.appendText("\nName: Altroz XT Diesel\nPrice: 8.439L\nCategory: Value for Money and Performance");
						text1.appendText("\n\nBy paying "+(9.159-budget)+" extra,\nYou get:-\n");
						text1.appendText("\nName: Altroz XZ Option Diesel\nPrice: 9.159L\nCategory: Comfort+ and Performance");
						text1.appendText("\n------------------------------------------------------------------");
						break;
					}
					if(budget>9.0&&budget<=9.5)
					{
						text1.appendText("\nName: Altroz XZ Option Diesel\nPrice: 9.159L\nCategory: Comfort+ and Performance");
						text1.appendText("\n\nBy paying "+(9.559-budget)+" extra,\nYou get:-\n");
						text1.appendText("\nName: Altroz XZ Plus Diesel\nPrice: 9.559L\nCategory: Comfort+ and Performance");
						text1.appendText("\n------------------------------------------------------------------");
						break;
					}
					if(budget>9.5)
					{
						text1.appendText("\nName: Altroz XZ Plus Diesel\nPrice: 9.559L\nCategory: Comfort+ and Performance");
						text1.appendText("\n------------------------------------------------------------------");
						break;
					}
				}
			}
			else if(rbut3.isSelected())
			{
				if((en3.compareToIgnoreCase(obj[i].engine)==0))
				{
					if(budget<=6.5)
					{
						text1.appendText("\nNo Variants Available...");
						text1.appendText("\n------------------------------------------------------------------");
						break;
					}
					if(budget>6.5&&budget<=7.0)
					{
						text1.appendText("\nNo Variants Available...");
						text1.appendText("\n------------------------------------------------------------------");
						break;
					}
					if(budget>7.0&&budget<=7.5)
					{
						text1.appendText("\n\nBy paying "+(7.939-budget)+" extra,\nYou get:-\n");
						text1.appendText("\nName: Altroz XT Turbo\nPrice: 7.9399L\nCategory: Value for Money and Performance");
						text1.appendText("\n------------------------------------------------------------------");
						break;
					}
					if(budget>7.5&&budget<=8.0)
					{
						text1.appendText("\nName: Altroz XT Turbo\nPrice: 7.9399L\nCategory: Value for Money and Performance");
						text1.appendText("\n\nBy paying "+(8.455-budget)+" extra,\nYou get:-\n");
						text1.appendText("\nName: Altroz XZ Turbo\nPrice: 8.455L\nCategory: Comfort and Performance");
						text1.appendText("\n------------------------------------------------------------------");
						break;
					}
					if(budget>8.0&&budget<=8.5)
					{
						text1.appendText("\nName: Altroz XZ Turbo\nPrice: 8.455L\nCategory: Comfort and Performance");
						text1.appendText("\n\nBy paying "+(8.659-budget)+" extra,\nYou get:-\n");
						text1.appendText("\nName: Altroz XZ Option Turbo\nPrice: 8.659L\nCategory: Comfort+ and Performance");
						text1.appendText("\n------------------------------------------------------------------");
						break;
					}
					if(budget>8.5&&budget<=9.0)
					{
						text1.appendText("\nName: Altroz XZ Option Turbo\nPrice: 8.659L\nCategory: Comfort+ and Performance");
						text1.appendText("\n\nBy paying "+(9.059-budget)+" extra,\nYou get:-\n");
						text1.appendText("\nName: Altroz XZ Plus Turbo\nPrice: 9.059L\nCategory: Comfort+ and Performance");
						text1.appendText("\n------------------------------------------------------------------");
						break;
					}
					if(budget>9.0&&budget<=9.5)
					{
						text1.appendText("\nName: Altroz XZ Plus Turbo\nPrice: 9.059L\nCategory: Comfort+ and Performance");
						text1.appendText("\n------------------------------------------------------------------");
						break;
					}
					if(budget>9.5)
					{
						text1.appendText("\nName: Altroz XZ Plus Turbo\nPrice: 9.059L\nCategory: Comfort+ and Performance");
						text1.appendText("\n------------------------------------------------------------------");
						break;
					}				
				}
			}
		
		}
			
		
	
	}
	
}
