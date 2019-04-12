package webauto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import commondata.CommonData;

public class Login {
	
	public void test() throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		CommonData cd = new CommonData();
		
		
		
		driver.get(cd.urlLogin);
		
		driver.manage().window().maximize();
		
		//collect email
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/footer/div[1]/div[3]/form/div/div/div[1]/input")).sendKeys("xf49@njit.edu");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/footer/div[1]/div[3]/form/div/div/div[1]/div/button/span")).click();
		
		
		Thread.sleep(3000);
		//input credentials
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/section/div/form/div[1]/div/div[1]/input")).sendKeys(cd.email);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/section/div/form/div[2]/div/div[1]/input")).sendKeys(cd.password);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/section/div/form/button")).click();
		
	}

}