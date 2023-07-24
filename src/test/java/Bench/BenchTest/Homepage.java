package Bench.BenchTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Homepage{
	
	WebDriver driver;

	@BeforeClass
	public void startBrowser(){
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://blazedemo.com/index.php");
	}

	@AfterClass
	public void stopBrowser(){
	driver.quit();
	}
}
