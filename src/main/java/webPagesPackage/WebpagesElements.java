package webPagesPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebpagesElements {
	
	public WebpagesElements(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath ="(//p[@class='txt'])[1]")
	public WebElement autobutton;
	@FindBy(xpath="//input[@id='zipCode_overlay']")
	public WebElement zipCode;
	@FindBy(xpath = "//input[@id='qsButton_overlay']")
	public WebElement quote;
	

	public void autoButtonMethod() {
		autobutton.click();
	}
	
	public void zipCodeMethod() {
		zipCode.sendKeys("11373");
	}
	
	public void quoteMethod() {
		quote.click();
	}
	

}
