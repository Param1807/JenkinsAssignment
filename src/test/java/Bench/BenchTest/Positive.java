package Bench.BenchTest;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Positive extends Homepage{
	
	@Test
	public void positive(){
		
        Select departure = new Select(driver.findElement(By.xpath("//body/div[3]/form[1]/select[1]")));
        departure.selectByIndex(0);
        Select destination = new Select(driver.findElement(By.xpath("//body/div[3]/form[1]/select[2]")));
        destination.selectByIndex(4);
        driver.findElement(By.xpath("//body/div[3]/form[1]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("//tbody/tr[2]/td[1]/input[1]")).click();
        driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Piyush");
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys("32 Avenue Street");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("New York");
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("New York");
        driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("10203");
        Select visaType = new Select(driver.findElement(By.xpath("//select[@id='cardType']")));
        visaType.selectByIndex(1);
        driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("2066357573");
        driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2036");
        driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Piyush");
        driver.findElement(By.xpath("//body/div[2]/form[1]/div[11]/div[1]/input[1]")).click();
		
	}
}

