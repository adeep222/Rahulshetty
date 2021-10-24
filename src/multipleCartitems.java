
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multipleCartitems {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Gekodriver\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		String[] items= {"Brocolli","Beetroot"};
		//List<String> items = new ArrayList<>();
	//	items.add("Brocolli");
	//	items.add("Beetroot");
	
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		List<WebElement> products=driver.findElements(By.cssSelector("h4[class='product-name']"));
		for(int i=0;i<products.size();i++)
		{
			String name=products.get(i).getText();
			
			for(int j =0; j<items.length;j++) {
				if(name.contains(items[j])) {
					
					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				break;
				}
			}
		
		}
		}

	}


