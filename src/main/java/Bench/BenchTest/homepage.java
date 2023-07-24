package Bench.BenchTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class homepage {
	
	WebDriver driver;

	@BeforeClass
	public void startBrowser(){

		ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

 

        driver.get("https://blazedemo.com/index.php");
}

	@AfterClass
	public void stopBrowser(){
	driver.quit();
	}

}
