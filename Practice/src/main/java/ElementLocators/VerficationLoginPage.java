package ElementLocators;

public class VerficationLoginPage extends LoginPages {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
           LoginPages d=new LoginPages();
           d.Drivers();
           
           Thread.sleep(5000);
           
               String Url = driver.getCurrentUrl();
               String Url1 = "https://www.naukri.com/";
               
              // System.out.println(driver.getCurrentUrl());
           
           
           if(Url==Url1)
           {
 
        	 String Title = driver.getTitle();
        	   
           System.out.println(Title+" If");   
	       }
           else
           {
        	   String Title1 = driver.getTitle();
        	   System.out.println(Title1+" Else");
           }
           
           Thread.sleep(5000);
           
           driver.close();
	}
	
}
