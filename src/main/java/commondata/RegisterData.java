package commondata;

public class RegisterData {
	
    public String getRandomName() 
    { 
  
        
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz"; 
  
        int n = (int) (20*Math.random());
        
        StringBuilder sb = new StringBuilder(n); 
  
        for (int i = 0; i < n; i++) { 
  

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
  
        for (int i = 0; i < n; i++) { 
  

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
  
        int n = 6;
        
        StringBuilder sb = new StringBuilder(n); 
  
        for (int i = 0; i < n; i++) { 
  

            int index 
                = (int)(AlphaNumericString.length() 
                        * Math.random()); 
  

            sb.append(AlphaNumericString .charAt(index)); 
        } 
  
        return sb.toString(); 
    }

}
