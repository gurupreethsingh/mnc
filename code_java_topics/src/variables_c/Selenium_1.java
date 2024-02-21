package variables_c;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		System.setProperty("Webdriver.chrome.Driver", "C:\\Users\\HP\\AppData\\Local\\Google\\Chrome\\Application");
		driver.get("https://www.utest.com");
		

	}

}
