import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multiCartitemsarraylist {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Gekodriver\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		String[] items= {"Brocolli - 1 Kg","Cauliflower - 1 Kg","Beans - 1 Kg"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		List<WebElement> products=driver.findElements(By.cssSelector("h4[class='product-name']"));
		for(int i=0;i<products.size();i++)
		{
			
			String name=products.get(i).getText();
			//System.out.println("Hey "+name);
			List<String> itemsneeded=Arrays.asList(items);
			if(itemsneeded.contains(name))
			{
				System.out.println("HI");
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			}

	}
	}
}

