package Bench.BenchTest;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Positive extends homepage{
	
	@Test
	public void positive(){
		
        Select departure = new Select(driver.findElement(By.xpath("//body/div[3]/form[1]/select[1]")));
        departure.selectByIndex(0);
        Select destination = new Select(driver.findElement(By.xpath("//body/div[3]/form[1]/select[2]")));
        destination.selectByIndex(4);
        driver.findElement(By.xpath("//body/div[3]/form[1]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("//tbody/tr[2]/td[1]/input[1]")).click();
        driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Paramjeet");
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys("Madhuban");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("india");
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("india");
        driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("1111");
        Select visaType = new Select(driver.findElement(By.xpath("//select[@id='cardType']")));
        visaType.selectByIndex(1);
        driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("0000000000");
        driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("0000");
        driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Param");
        driver.findElement(By.xpath("//body/div[2]/form[1]/div[11]/div[1]/input[1]")).click();
		
	}
	

}

