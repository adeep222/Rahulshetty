import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class addingspecificproducts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Gekodriver\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		
		//List<WebElement> allopts=driver.findElements(By.cssSelector("h4[class='product-name']"));
		//WebElement w=driver.findElement(By.xpath("//h4[@class='product-name']"));
		List<WebElement> items=driver.findElements(By.cssSelector("[class='product-name']"));
		//System.out.println("Adeeps text value is:" +w.getText());
		//System.out.println(allopts);
for (int i=0;i<items.size();i++)
{
	System.out.println("Total iterations :" +i);
	String prodname=items.get(i).getText();
	
	if(prodname.contains("Cucumber"))
	{
		System.out.println("Hi");
		//driver.findElements(By.cssSelector("[type='button']")).get(i).click();
		driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
		break;
}
	
}
	}

	}
