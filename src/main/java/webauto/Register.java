package webauto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import commondata.CommonData;
import commondata.RegisterData;

public class Register {
	
   public void test() throws InterruptedException {
	   
	   WebDriver driver = new ChromeDriver();
	   WebDriverWait wait = new WebDriverWait(driver,2);
	   
	   CommonData cd = new CommonData();
	   
	   RegisterData rd = new RegisterData();
	   
	   driver.get(cd.urlRegister);
	   
	   driver.manage().window().maximize();
	   
	   String first_name = rd.getRandomName();
	   String last_name = rd.getRandomName();
	   String email = rd.getEmail();
	   String password = rd.getPassword();
	   
	   driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/section/div/form/div[1]/div/div[1]/input")).sendKeys(first_name);
	   
	   Thread.sleep(2000);
       
	   driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/section/div/form/div[2]/div/div[1]/input")).sendKeys(last_name);
  
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/section/div/form/div[3]/div/div[1]/input")).sendKeys(email);
  
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/section/div/form/div[4]/div/div[1]/input")).sendKeys(password);
   
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/section/div/form/button")).click();

	   Thread.sleep(2000);
	   //driver.get(cd.urlAboutus);

	   driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/section/header/section/div/div/a")).click();

	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div/h1/p/a")).click();
	   
	   
   }
	

}
