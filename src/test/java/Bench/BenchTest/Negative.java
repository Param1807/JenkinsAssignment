package Bench.BenchTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Negative extends homepage{
	
	@Test
	public void negative() {
		
		driver.findElement(By.xpath("//a[contains(text(),'home')]")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Param");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Param@123");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		
	}

}
