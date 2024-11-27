package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_TestCase01 extends BaseClass{

	@Test
	public void test() throws InterruptedException {
	HomePage hp=new HomePage(driver);
	hp.clickRevenueCalculator();
	hp.movetoMedicareText();
	
	Thread.sleep(500);
	
	//hp.moveSlider();
	
	hp.setTextInSlider();
	String text=hp.getText();
	Assert.assertEquals(text, "560");
	System.out.println("the value in text is 560");
	
	hp.setTextInTheSlider();
	
	hp.clkCheckBox1();
	hp.clkCheckBox2();
	hp.clkCheckBox3();
	hp.Element();
	hp.clkCheckBox4();
	
	String value=hp.textMessage();
	Assert.assertEquals(value, "$110700");
	
	System.out.println("Test case passed");
	
	}
}
