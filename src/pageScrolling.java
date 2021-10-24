import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pageScrolling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Gekodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		/* Since this is an interface this got added
		  JavascriptExecutor js=new JavascriptExecutor() {
			
			@Override
			public Object executeScript(String arg0, Object... arg1) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object executeAsyncScript(String arg0, Object... arg1) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		*/
		JavascriptExecutor js=(JavascriptExecutor)driver;//cast ur driver and driver will be aware that it can go ahead and execute javascripts
js.executeScript("window.scrollBy(0,500)");
	/*for a particular table first you shd call the dom object  */
	}
	
}
