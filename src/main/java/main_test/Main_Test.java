package main_test;

import webauto.AddToCart;
import webauto.ForgetPassword;
import webauto.Login;
import webauto.Register;

public class Main_Test {

	public static void main(String[] args) throws InterruptedException{
		
		Login login = new Login();
		
		Register register = new Register();
		
		AddToCart atc = new AddToCart();
		
		ForgetPassword FP = new ForgetPassword();
		
		
		
		//atc.test();
		
		register.test();
		
		
	    Thread.sleep(4000);
	    

		
		login.test();
		
		Thread.sleep(4000);
		
		FP.test();

	}

}
