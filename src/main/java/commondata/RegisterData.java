package commondata;

public class RegisterData {
	
	public String urlRegisterDhohoo="https://www.dhohoo.com/account/register";
	public String urlRegisterYeahBra="https://shop.yeahbra.com/account/register";
	public String urlRegisterBlendPlus="https://shop.blendplustech.com/account/register";
	public String urlRegisterKiperLine="https://shop.kiperline.com/account/register";
	public String urlRegisterAbeatis="https://www.abeatis.com/account/register";
	public String urlRegister21Smarthome="https://www.21smarthome.com/account/register";
	public String urlRegisterWiseho="https://special.wiseho.com/account/register";
	public String urlRegisterWessme="https://shop.wessme.com/account/register";
	
	
	
	
    public String getRandomName() 
    { 
  
        
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz"; 
  
        int n = (int) (20*Math.random());
        
        StringBuilder sb = new StringBuilder(n); 
  
        for (int i = 1; i < n; i++) { 
  

            int index 
                = (int)(AlphaNumericString.length() 
                        * Math.random()); 
  

            sb.append(AlphaNumericString .charAt(index)); 
        } 
  
        return sb.toString(); 
    }
    
    public String getEmail() 
    { 
  
        
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz"; 
  
        int n = 6;
        
        StringBuilder sb = new StringBuilder(n); 
  
        for (int i = 1; i < n; i++) { 
  

            int index 
                = (int)(AlphaNumericString.length() 
                        * Math.random()); 
  

            sb.append(AlphaNumericString .charAt(index)); 
        } 
  
        return sb.toString()+"@gmail.com"; 
    }
    
    
    public String getPassword() 
    { 
  
        
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz"; 
  
        int n = 10;
        
        StringBuilder sb = new StringBuilder(n); 
  
        for (int i = 1; i < n; i++) { 
  

            int index 
                = (int)(AlphaNumericString.length() 
                        * Math.random()); 
  

            sb.append(AlphaNumericString .charAt(index)); 
        } 
  
        return sb.toString(); 
    }

}
