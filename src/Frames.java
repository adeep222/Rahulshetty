import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Gekodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		/* Now to print the number of frames in apage use the following*/
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		//driver.findElement(By.cssSelector("div[id='draggable']")).click();
		//Since the element is within the frame was not able to identify this directly
		WebElement frame=driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
		driver.switchTo().frame(frame);
		//driver.switchTo().frame(0);
		/*The above line also will work to switch to frames by index mainly when there are multiple frames, but sometimes if more frames are added or removed then the indexes may not work*/
		//driver.findElement(By.cssSelector("div[id='draggable']")).click();
		Actions a=new Actions(driver);
		WebElement source=driver.findElement(By.cssSelector("div[id='draggable']"));
		WebElement destination=driver.findElement(By.cssSelector("div[id='droppable']"));
		a.dragAndDrop(source, destination).build().perform();
		//if you do not give build and perform nothing will happen
		System.out.println("Hi");
		/* Now to print the number of frames in apage use the following*/
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().defaultContent();/*This line is required to get the control outside the frame or else action on other elements cannot be performed*/
		Thread.sleep(2000);
		driver.findElement(By.linkText("Accept")).click();
		
	}

}
