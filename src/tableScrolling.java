import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tableScrolling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Gekodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor)driver;//cast ur driver and driver will be aware that it can go ahead and execute javascripts
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('[class=tableFixHead]').scrollTop=5000");
		
		/*We are directly using javascipt in selenium as above*/
		//js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000"); Can use this too
	}

}
