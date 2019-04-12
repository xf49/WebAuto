package main_test;

import webauto.AddToCart;
import webauto.Login;
import webauto.Register;

public class Main_Test {

	public static void main(String[] args) throws InterruptedException{
		
		Login login = new Login();
		
		Register register = new Register();
		
		AddToCart atc = new AddToCart();
		
		
		atc.test();
		
		//register.test();
		
		//login.test();

	}

}
