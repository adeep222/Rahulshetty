import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class mystaticdropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Gekodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//WebElement drop=driver.findElement(By.cssSelector("div[class='currency-dropdown']"));
		WebElement drop=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		drop.click();
		 Select s=new Select(drop);
		 Thread.sleep(1000);
		//s.selectByIndex(3);
		 s.selectByVisibleText("AED");
		 
		System.out.println("The text is " +s.getFirstSelectedOption().getText());
		Thread.sleep(5000);
		driver.findElement(By.id("divpaxinfo")).click();
		/*Select 6 adults*/
		int i=0;
		while(i<5)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
	}
		String adultcount=driver.findElement(By.id("spanAudlt")).getText();
		Assert.assertEquals(adultcount, "6");
		
	
}
	}


