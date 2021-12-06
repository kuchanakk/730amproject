package objrep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {


	static WebDriver driver; 
	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//@FindBy(att="value") webelement name;
	
	@FindBy(linkText="POPULAR ITEMS")
	static WebElement pitem;


	@FindBy(id="details_16")
	static WebElement tab;

	@FindBy(id="details_10")
	static WebElement lap;

	@FindBy(id="details_21")
	static WebElement spk;
	
	@FindBy(xpath="//*[@id=\"Description\"]/h1")
	static WebElement productdetails;
	
public static WebElement poplink() {
		
		return pitem;
	}
public static WebElement tablink() {
	
	return tab;
}
public static WebElement laplink() {
	
	return lap;
}
public static WebElement spklink() {
	
	return spk;
}
public static WebElement producttext() {
	
	return productdetails;
}
	
	
	
}
