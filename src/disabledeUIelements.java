import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class disabledeUIelements {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Gekodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		Boolean val1 = driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled();
		System.out.println(val1);
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		Boolean val2 = driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled();
		System.out.println(val2);
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("Its enabled");
		} else {
			System.out.println("Its disabled");

		}
	}

}
