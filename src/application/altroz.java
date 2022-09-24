package application;
import application.controllermain;
import application.Main;
public class altroz extends controllermain
{
	String name;
	String engine;
	String category;
	double price;

	altroz(String name,String engine,String category,double price)
	{
		this.name=name;
		this.engine=engine;
		this.category=category;
		this.price=price;
	}
}
