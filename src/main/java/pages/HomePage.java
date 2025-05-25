package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

//import io.cucumber.messages.types.Duration;
import java.time.Duration;

public class HomePage {
	@FindBy(xpath="//span[@id='nav-cart-count']")
	WebElement	carticon;
	@FindBy(xpath="//div[@class='dcl-product-image-container'])[1]")
	WebElement lapsection;
	@FindBy(xpath="(//*[@class='sponsored-products-truncator-truncated'])[1]")
	WebElement verifylaptop;
	 WebDriverWait wait;
	
	
	
	WebDriver driver;
	public HomePage(WebDriver driver) {
	this.driver=driver;
	
	wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	
	
		
	}
	
	
	
	public String fetchtitle()
	{
		String titlename = driver.getTitle();
		return titlename;
	}
	public boolean  verifycarticon() {
		boolean isDisplaying = carticon.isDisplayed();
		return isDisplaying;
	}
	public void clickonlapsection()
	{
		wait.until(ExpectedConditions.visibilityOf(lapsection));
		lapsection.click();
	}
	public boolean verifylapy()
	{
		boolean isdisplaylapdell = verifylaptop.isDisplayed();
		return isdisplaylapdell;
		
	}

}
