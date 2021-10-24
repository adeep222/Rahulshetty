
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class autosuggestdropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Gekodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(3000);
		//driver.findElement(By.cssSelector("a[id='ui-id-5']")).click();
		//the above works but if the position of display changes in case additional option is added then this will not work
		//driver.findElements(By.cssSelector("li[class='ui-menu-item'] a")) --> with css to go to child give space and child tag
		List<WebElement> options=driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));	
		for(WebElement option: options)
		{
			
			if(option.getText().equalsIgnoreCase("Indonesia"))
					{
				option.click();
				break;
					}
					
		}
	}
}


