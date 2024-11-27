package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	//creating constructor
	
		public HomePage(WebDriver driver) {
			super(driver);
		}
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		Actions act=new Actions(driver);
		
		
		@FindBy(xpath="//div[contains(text(),'Revenue Calculator')]")
		WebElement clk_revenuecalculator;
		
		@FindBy(xpath="//h4[normalize-space()='Medicare Eligible Patients']")
		WebElement txt_medicare;
		
		@FindBy(xpath="//input[@type='range']")
		WebElement clk_slider;
		
		@FindBy(xpath="//*[@type='number']")
		WebElement txt_enterInSlider;
		
		@FindBy(xpath="//p[text()=\"560\"]")
		WebElement gettext;
		
		@FindBy(xpath="//div[@class='MuiBox-root css-rfiegf']//div[1]//label[1]//span[1]//input[1]")
		WebElement clk_checkbox1;
		
		@FindBy(xpath="//div[@class='MuiBox-root css-1p19z09']//div[2]//label[1]//span[1]//input[1]")
		WebElement clk_checkbox2;
		
		@FindBy(xpath="//div[3]//label[1]//span[1]//input[1]")
		WebElement clk_checkbox3;
		
		@FindBy(xpath="//p[normalize-space()='CPT-99474']")
		WebElement element;
		
		@FindBy(xpath="//div[8]//label[1]//span[1]//input[1]")
		WebElement clk_checkbox4;
		
		@FindBy(xpath="//p[normalize-space()='$110700']")
		WebElement txt_message;
		
		public void clickRevenueCalculator() {
			clk_revenuecalculator.click();
		}
		
		public void movetoMedicareText() {
			js.executeScript("arguments[0].scrollIntoView()", txt_medicare);
		}
		
		public void moveSlider() {
			int desired_value=820;
			js.executeScript("arguments[0].value=arguments[1]; arguments[0].dispatchEvent(new Event('change'));", clk_slider,desired_value);
//			Actions act=new Actions(driver);
//			act.dragAndDropBy(clk_slider,0,820).perform();
		}
		
		public void setTextInSlider() throws InterruptedException {
			
			act.click(txt_enterInSlider).keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
			act.keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).sendKeys("560").perform();
		}
			
		public void setTextInTheSlider() {
			act.click(txt_enterInSlider).keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
			act.keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).sendKeys("820").perform();
		}
		
		public String getText() {
			String str=gettext.getText();
			return str;
		}
		
		public void clkCheckBox1() {
			clk_checkbox1.click();
		}
		
		public void clkCheckBox2() {
			clk_checkbox2.click();
		}
		
		public void clkCheckBox3() {
			clk_checkbox3.click();
		}
		
		public void Element() {
			js.executeScript("arguments[0].scrollIntoView()",element);
		}
		
		public void clkCheckBox4() {
			clk_checkbox4.click();
		}
		
		public String textMessage() {
			String str=txt_message.getText();
			return str;
		}
}
