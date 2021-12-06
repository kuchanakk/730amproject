package pack1;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import commonmethods.Screenshot;
import exceldata.Exceldriven;
import objrep.Homepage;

public class ExampleTest extends TestBase {

	static Homepage hp;
	static Exceldriven excel;
	static Screenshot sc;
	@BeforeMethod
	public static void openbrowser() {
		
		TestBase tb = new TestBase();
		tb.browserlaunch();
			
	}
	
	@AfterMethod
	public static void closebrowserr() {
		
	driver.close();	
	}
	@Test
	public static void tablettest() throws InterruptedException, IOException {
		 sc = new Screenshot();
		 excel= new Exceldriven();
		 hp = new Homepage(driver);
			Thread.sleep(10000);

		hp.poplink().click();
		Thread.sleep(10000);
		hp.tablink().click();
		String actualtext=hp.producttext().getText();
		String expectedtext=excel.readdata(3, 0);
		
		if(actualtext.contains(expectedtext)) {
			
			excel.writedata(3, 1, "valid data");
			System.out.println(" valid data");
			Assert.assertTrue(true);
			
		}else {
			excel.writedata(3, 1, "invalid data");
			System.out.println(" invalid data");
			sc.sshot();
			
			Assert.assertTrue(false);
			
		}
		
		
	}
	@Test
	public static void laptoptest() throws InterruptedException, IOException {
		sc = new Screenshot();
		 excel= new Exceldriven();
		 hp = new Homepage(driver);
			Thread.sleep(10000);

		hp.poplink().click();
		Thread.sleep(10000);
		hp.laplink().click();
		String lapacttext=hp.producttext().getText();
String lapexptext=excel.readdata(1, 0);
		
		if(lapacttext.contains(lapexptext)) {
			
			excel.writedata(1, 1, "valid data");
			System.out.println(" valid data");
			Assert.assertTrue(true);
			
		}else {
			excel.writedata(1, 1, "invalid data");
			System.out.println(" invalid data");
			sc.sshot();
			
			Assert.assertTrue(false);
			
		}
	
	
	}
	
	
	@Test
	public static void spktest() throws InterruptedException, IOException {
		
		sc = new Screenshot();
		 excel= new Exceldriven();
		 hp = new Homepage(driver);
			Thread.sleep(10000);

		hp.poplink().click();
		Thread.sleep(10000);
		hp.spklink().click();
		String spkacttext=hp.producttext().getText();
String spkexptext=excel.readdata(2, 0);
		
		if(spkacttext.contains(spkexptext)) {
			
			excel.writedata(2, 1, "valid data");
			System.out.println(" valid data");
			Assert.assertTrue(true);
			
		}else {
			excel.writedata(2, 1, "invalid data");
			System.out.println(" invalid data");
			sc.sshot();
			
			Assert.assertTrue(false);
			
		}
	
	
	}
		
		
	
	
	
		
	}
	
	
	

