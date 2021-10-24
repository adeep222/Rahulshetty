import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkboxselection {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Gekodriver\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		boolean val=driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected();
	System.out.println(val);
	int checkboxes=driver.findElements(By.cssSelector("[type='checkbox']")).size();
	System.out.println("The total no of checkboxes in the page is: "+checkboxes);
	
	}

}
