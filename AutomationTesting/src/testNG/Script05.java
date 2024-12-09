package testNG;

import org.testng.annotations.Test;

public class Script05 {
   @Test(priority = 0)
   public void signup()
   {
	   System.out.println("su is passed");
   }
   @Test(priority = 1)
   public void Login() {
	   System.out.println("login is passed");
   }
   @Test(priority = 2)
   public void HP()
   {
	   System.out.println("hp is passed");
   }
}
