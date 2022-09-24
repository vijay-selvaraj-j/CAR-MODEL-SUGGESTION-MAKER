package application;
import java.awt.Desktop;
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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class controllermain implements Initializable
{
	@FXML
	private ChoiceBox<String> choice,checkbud,checat,cheeng;
	private String[] models = {"Altroz XE","Altroz XM","Altroz XM Plus","Altroz XE Diesel","Altroz XT","Altroz XM Diesel","Altroz XZ","Altroz XT Turbo","Altroz XZ Option","Altroz XZ Plus","Altroz XT Diesel","Altroz XZ Turbo","Altroz XZ Option Turbo","Altro1z XZ Diesel","Altroz XZ Plus Turbo","Altroz XZ Option Diesel","Altroz XZ Plus Diesel"};
	private String[] budgets = {"<=6.5L","6.5l - 7.0L","7.01L - 7.5L","7.51L - 8.0L","8.01L - 8.50L","8.51L - 9.0L","9.01L - 9.50L",">9.51L"};
	private String[] categories = {"Basic","Basic+","Comfort","Comfort+","Performance","Value for Money","Comfort and Performance","Comfort+ and Performance","Value for money and Performance"};
	private String[] engines = {"Petrol","Diesel","Turbo Petrol","Electric","CNG"};
	
	@FXML
	TextArea text = new TextArea();
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	@FXML
	private AnchorPane rootPane;
	
		
	
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
		Parent root = FXMLLoader.load(getClass().getResource("developer.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
		scene = new Scene(root,Color.BLACK);
		stage.setScene(scene);
		String css=this.getClass().getResource("application.css").toExternalForm();
		scene.getStylesheets().add(css);
		stage.show();

	}
	
	
	public void Tech(ActionEvent e)
	{
		Desktop d = Desktop.getDesktop();
		try {
			d.browse(new URI("https://www.cardekho.com/india-car-news.htm"));
		}
		catch (IOException | URISyntaxException e1) 
		{
			e1.printStackTrace();
		}
	}
	
	public void compare(ActionEvent e)
	{
		Desktop d = Desktop.getDesktop();
		try {
			d.browse(new URI("https://www.cardekho.com/compare-cars"));
		}
		catch (IOException | URISyntaxException e1) 
		{
			e1.printStackTrace();
		}
	}
	
		
	public void Var(ActionEvent e)
	{
		Desktop d = Desktop.getDesktop();
		try {
			d.browse(new URI("https://youtu.be/7H2cTAFSSIc"));
		}
		catch (IOException | URISyntaxException e1) 
		{
			e1.printStackTrace();
		}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1)
	{
		
		choice.getItems().addAll(models);
		choice.setOnAction(arg01 -> {
			try {
				getModels(arg01);
			}
		catch (IOException | URISyntaxException e) {
				
				//e.printStackTrace();
			}
		});
		
		
		checkbud.getItems().addAll(budgets);
		checkbud.setOnAction(arg01 -> {
		getBudget(arg01);
		
				
		});
		
		
		checat.getItems().addAll(categories);
		checat.setOnAction(arg01 -> {
			try {
				getCategory(arg01);
			}
		catch (IOException | URISyntaxException e) {
				
					System.out.println("Here");		}
		});
		
		cheeng.getItems().addAll(engines);
		cheeng.setOnAction(arg01 -> {
			try {
				getEngine(arg01);
			}
		catch (IOException | URISyntaxException e) {
				
					System.out.println("Here");		}
		});
		
		text.setEditable(false);
		text.setWrapText(true);
		text.appendText("Tata Altroz is India's safest car with 5 stars Global NCAP ratings with amazing Safety Features like ABS, EBD, Corner Stability Control, Built on the ALFA Architecture, loaded with all the necessary Tech, taking the PREMIUM HATCHBACK experience to a WHOLE NEW Level");	
		text.appendText("\n-------------------------------------------------------------");

	}

	public void getModels(ActionEvent event) throws IOException, URISyntaxException
	{
		
		String myModel = choice.getValue();
		Desktop d = Desktop.getDesktop();
		switch(myModel)
		{
		case "Altroz XE": 
				d.browse(new URI("https://www.cardekho.com/overview/Tata_Altroz/Tata_Altroz_XE.htm"));
			break;
			
		case "Altroz XM": 
				d.browse(new URI("https://www.cardekho.com/overview/Tata_Altroz/Tata_Altroz_XM.htm"));
			break;
			
		case "Altroz XM Plus":
				d.browse(new URI("https://www.cardekho.com/overview/Tata_Altroz/Tata_Altroz_XM_plus.htm"));
			break;
			
		case "Altroz XE Diesel":
			d.browse(new URI("https://www.cardekho.com/overview/Tata_Altroz/Tata_Altroz_XE_Diesel.htm"));
			break;
			
		case "Altroz XT":
			d.browse(new URI("https://www.cardekho.com/overview/Tata_Altroz/Tata_Altroz_XT.htm"));
			break;
			
		case "Altroz XM Diesel":
			d.browse(new URI("https://www.cardekho.com/overview/Tata_Altroz/Tata_Altroz_XM_Diesel.htm"));
			break;
			
		case "Altroz XZ":
			d.browse(new URI("https://www.cardekho.com/overview/Tata_Altroz/Tata_Altroz_XZ.htm"));
			break;
			
		case "Altroz XT Turbo":
			d.browse(new URI("https://www.cardekho.com/overview/Tata_Altroz/Tata_Altroz_XT_Turbo.htm"));
			break;
			
		case "Altroz XZ Option":
			d.browse(new URI("https://www.cardekho.com/overview/Tata_Altroz/Tata_Altroz_XZ_Option.htm"));
			break;
			
		case "Altroz XZ Plus":
	 		 d.browse(new URI("https://www.cardekho.com/overview/Tata_Altroz/Tata_Altroz_XZ_Plus.htm"));
			break;
			
		case "Altroz XT Diesel":
			 d.browse(new URI("https://www.cardekho.com/overview/Tata_Altroz/Tata_Altroz_XT_Diesel.htm"));
			break;
			
		case "Altroz XZ Turbo":
			 d.browse(new URI("https://www.cardekho.com/overview/Tata_Altroz/Tata_Altroz_XZ_Turbo.htm"));
			break;
			
		case "Altroz XZ Option Turbo":
			 d.browse(new URI("https://www.cardekho.com/overview/Tata_Altroz/Tata_Altroz_XZ_Opt_Turbo.htm"));
			break;
			
		case "Altroz XZ Diesel":
			 d.browse(new URI("https://www.cardekho.com/overview/Tata_Altroz/Tata_Altroz_XZ_Diesel.htm"));
			break;
			
		case "Altroz XZ Plus Turbo":
			 d.browse(new URI("https://www.cardekho.com/overview/Tata_Altroz/Tata_Altroz_XZ_Plus_Turbo.htm"));
			break;
			
		case "Altroz XZ Option Diesel":
			 d.browse(new URI("https://www.cardekho.com/overview/Tata_Altroz/Tata_Altroz_XZ_Option_Diesel.htm"));
			break;
			
		case "Altroz XZ Plus Diesel":
			 d.browse(new URI("https://www.cardekho.com/overview/Tata_Altroz/Tata_Altroz_XZ_Plus_Diesel.htm"));
			break;
			
		default:
			break;
			
		}
		
	}
		
	
	public void getBudget(ActionEvent event)
			//throws IOException, URISyntaxException
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
				
		
		
		String budget = checkbud.getValue();
		switch(budget)
		{
		case "<=6.5L": 
			for(int i=0;i<17;i++)
			 {
				if(obj[i].price<=6.5)
				{
					text.appendText("\nName:\t\t" + obj[i].name + "\nEngine:\t\t" + obj[i].engine + "\nCategory:\t" + obj[i].category+"\n");
				}
			 }
			text.appendText("-------------------------------------------------------------");

			break;
			
		case "6.5l - 7.0L": 
			for(int i=0;i<17;i++)
			 {
		 		if(obj[i].price>6.5 && obj[i].price<=7.0)
		 		{
		 			text.appendText("\nName:\t\t" + obj[i].name + "\nEngine:\t\t" + obj[i].engine + "\nCategory:\t" + obj[i].category+"\n");
		 		}
			 }
			text.appendText("-------------------------------------------------------------");

			break;
			
		case "7.01L - 7.5L":
			for(int i=0;i<17;i++)
	 		 {
				if(obj[i].price>7.0 && obj[i].price<=7.5)
				{
					text.appendText("\nName:\t\t" + obj[i].name + "\nEngine:\t\t" + obj[i].engine + "\nCategory:\t" + obj[i].category +"\n");
				}
			}
			text.appendText("-------------------------------------------------------------");

			break;
			
		case "7.51L - 8.0L":
			for(int i=0;i<17;i++)
	 		 {
				if(obj[i].price>7.5 && obj[i].price<=8.0)
				{
					text.appendText("\nName:\t\t" + obj[i].name + "\nEngine:\t\t" + obj[i].engine + "\nCategory:\t" + obj[i].category+"\n");
				}
				
	 		 }
			text.appendText("-------------------------------------------------------------");

			break;
			
		case "8.01L - 8.50L":
			for(int i=0;i<17;i++)
			 {
				if(obj[i].price>8.0 && obj[i].price<=8.50)
				{
					text.appendText("\nName:\t\t" + obj[i].name + "\nEngine:\t\t" + obj[i].engine + "\nCategory:\t" + obj[i].category +"\n");
				}
				
			 }
			text.appendText("-------------------------------------------------------------");

			break;
			
		case "8.51L - 9.0L":
			for(int i=0;i<17;i++)
	 		 {
				if(obj[i].price>8.5 && obj[i].price<=9.0)
				{
					text.appendText("\nName:\t\t" + obj[i].name + "\nEngine:\t\t" + obj[i].engine + "\nCategory:\t" + obj[i].category+"\n");
				}
				
	 		 }
			text.appendText("-------------------------------------------------------------");

			break;
			
		case "9.01L - 9.50L":
			for(int i=0;i<17;i++)
	 		 {
				if(obj[i].price>9.0 && obj[i].price<=9.50)
				{
					text.appendText("\nName:\t\t" + obj[i].name + "\nEngine:\t\t" + obj[i].engine + "\nCategory:\t" + obj[i].category+"\n");
				}
				
	 		 }
			text.appendText("-------------------------------------------------------------");

			break;
			
		case ">9.51L":
			for(int i=0;i<17;i++)
	 		 {
				if(obj[i].price>9.5)
				{
					text.appendText("\nName:\t\t" + obj[i].name + "\nEngine:\t\t" + obj[i].engine + "\nCategory:\t" + obj[i].category+"\n");
				}
				
	 		 }
			text.appendText("-------------------------------------------------------------");

			break;
			
		default:
			break;
			
		}
		
	}

	
	public void getCategory(ActionEvent event) throws IOException, URISyntaxException
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
		
	String cat1="Basic";
	String cat2="Basic+";
	String cat3="Comfort";
	String cat4="Performance";
	String cat5="Value for Money";
	String cat6="Comfort+";
	String cat7="Comfort and Performance";
	String cat8="Value for money and Performance";
	String cat9="Comfort+ and Performance";
	String categor = checat.getValue();
	switch(categor)
	{

	case "Basic": for(int i=0;i<17;i++)
	{
		if(obj[i].category.compareToIgnoreCase(cat1)==0)
		{
			text.appendText("\nName: " + obj[i].name + "\nEngine: " + obj[i].engine + "\nPrice: " + obj[i].price+"\n");
		}
		
	}
		text.appendText("-------------------------------------------------------------");
		
		break;
	
	case "Basic+": for(int i=0;i<17;i++)
	{
		if(obj[i].category.compareToIgnoreCase(cat2)==0)
		{
			text.appendText("\nName: " + obj[i].name + "\nEngine: " + obj[i].engine + "\nPrice: " + obj[i].price +"\n");
		}
		
	}
	text.appendText("-------------------------------------------------------------");

		break;
	
	case "Comfort": for(int i=0;i<17;i++)
			{
				if(obj[i].category.compareToIgnoreCase(cat3)==0)
				{
					text.appendText("\nName: " + obj[i].name + "\nEngine: " + obj[i].engine + "\nPrice: " + obj[i].price+"\n");
				}
				
			}
	text.appendText("-------------------------------------------------------------");

		break;

	case "Performance": for(int i=0;i<17;i++)
			{
				if(obj[i].category.compareToIgnoreCase(cat4)==0)
				{
					text.appendText("\nName: " + obj[i].name + "\nEngine: " + obj[i].engine + "\nPrice: " + obj[i].price+"\n");
				}
				
			}
	text.appendText("-------------------------------------------------------------");

		break;
	
	case "Value for Money": for(int i=0;i<17;i++)
			{
				if(obj[i].category.compareToIgnoreCase(cat5)==0)
				{
					text.appendText("\nName: " + obj[i].name + "\nEngine: " + obj[i].engine + "\nPrice: " + obj[i].price+"\n");
				}
				
			}
	text.appendText("-------------------------------------------------------------");

		break;
	
	case "Comfort+": for(int i=0;i<17;i++)
			{
				if(obj[i].category.compareToIgnoreCase(cat6)==0)
				{
					text.appendText("\nName: " + obj[i].name + "\nEngine: " + obj[i].engine + "\nPrice: " + obj[i].price+"\n");
				}
				
			}
	text.appendText("-------------------------------------------------------------");

		break;
	
	case "Comfort and Performance": for(int i=0;i<17;i++)
			{
				if(obj[i].category.compareToIgnoreCase(cat7)==0)
				{
					text.appendText("\nName: " + obj[i].name + "\nEngine: " + obj[i].engine + "\nPrice: " + obj[i].price+"\n");
				}
				
			}
	text.appendText("-------------------------------------------------------------");

		break;
	
	case "Value for money and Performance": for(int i=0;i<17;i++)
			{
				if(obj[i].category.compareToIgnoreCase(cat8)==0)
				{
					text.appendText("\nName: " + obj[i].name + "\nEngine: " + obj[i].engine + "\nPrice: " + obj[i].price+"\n");
				}
				
			}
	text.appendText("-------------------------------------------------------------");

		break;
	
	case "Comfort+ and Performance": for(int i=0;i<17;i++)
			{
				if(obj[i].category.compareToIgnoreCase(cat9)==0)
				{
					text.appendText("\nName: " + obj[i].name + "\nEngine: " + obj[i].engine + "\nPrice: " + obj[i].price+"\n");
				}
				
			}
	text.appendText("-------------------------------------------------------------");

		break;
		
	default:// System.out.println(ConsoleColors.PURPLE_BRIGHT+"Invalid Entry"+ ConsoleColors.RESET);
		break;
	}
	
}

	public void getEngine(ActionEvent event) throws IOException, URISyntaxException
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

		
		
		String str1="Petrol";
		String str2="Diesel";
		String str3="Turbo Petrol";
		String str4="Electric";
		String str5="CNG";
		String engin = cheeng.getValue();
		switch(engin)
		{
			case "Petrol": for(int i=0;i<17;i++)
					{
						if(obj[i].engine.compareToIgnoreCase(str1)==0)
						{
							text.appendText("\n"+obj[i].name + ": " + obj[i].price + "L" );
						}
						
					}
			text.appendText("\n-------------------------------------------------------------");

					break;
		
			case "Diesel": for(int i=0;i<17;i++)
					{
						if(obj[i].engine.compareToIgnoreCase(str2)==0)
						{
							text.appendText("\n"+obj[i].name + ": " + obj[i].price + "L" );
						}	
						
					}
			text.appendText("\n-------------------------------------------------------------");

					break;
	
			case "Turbo Petrol": for(int i=0;i<17;i++)
					{
						if(obj[i].engine.compareToIgnoreCase(str3)==0)
						{
							text.appendText("\n"+obj[i].name + ": " + obj[i].price + "L");
						}	
						
					}
			text.appendText("\n-------------------------------------------------------------");

					break;
	
			case "Electric": for(int i=0;i<17;i++)
					{
						if(obj[i].engine.compareToIgnoreCase(str4)==0)
						{
							text.appendText("\n"+obj[i].name + ": " + obj[i].price);
						}
						else if(i==16)
						{
							text.appendText("\nEngine Option Doesn't Exist :(");
						}
						
					}
			text.appendText("\n-------------------------------------------------------------");

					break;
	
			case "CNG": for(int i=0;i<17;i++)
					{
						if(obj[i].engine.compareToIgnoreCase(str5)==0)
						{
							text.appendText("\n"+obj[i].name + ": " + obj[i].price );
						}
						else if(i==16)
						{
							text.appendText("\nEngine Option Doesn't Exist :(");
						}
						
					}	
			text.appendText("\n-------------------------------------------------------------");

					break;
		
			default: //System.out.println(ConsoleColors.PURPLE_BRIGHT+"Engine option not found...."+ ConsoleColors.RESET);
					break;
		}
	}
	
}
