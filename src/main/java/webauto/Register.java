package webauto;

import java.util.ArrayList;
import java.util.List;
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
	   
	   RegisterData rd = new RegisterData();
	   
	   
	   
		List<String> urlList = new ArrayList<String>();
		
		urlList.add(rd.urlRegisterDhohoo);
		urlList.add(rd.urlRegisterYeahBra);
		urlList.add(rd.urlRegisterBlendPlus);
		urlList.add(rd.urlRegisterKiperLine);
		urlList.add(rd.urlRegisterAbeatis);
		//urlList.add(rd.urlRegister21Smarthome);
		urlList.add(rd.urlRegisterWiseho);
		urlList.add(rd.urlRegisterWessme);
		
     
	for(String urllist:urlList) {
		
		   driver.get(urllist);
		   driver.manage().window().maximize();
		   
		   String first_name = rd.getRandomName();
		   String last_name = rd.getRandomName();
		   String email = rd.getEmail();
		   String password = rd.getPassword();
		 
		 
		   driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/section/div/form/div[1]/div/div/input")).sendKeys(first_name);
		   
		   Thread.sleep(2000);
	    
		   driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/section/div/form/div[2]/div/div/input")).sendKeys(last_name);

		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/section/div/form/div[3]/div/div/input")).sendKeys(email);

		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/section/div/form/div[4]/div/div/input")).sendKeys(password);

		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/section/div/form/button")).click();

		   Thread.sleep(2000);
		   


	}
	

	   

	   
	   
   }
	

}
