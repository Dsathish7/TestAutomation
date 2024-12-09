package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script04 {
     @Test
     public void Signup()
     {
    	 Reporter.log("signup is pass",true);
     }
     @Test(invocationCount = 2)
     public void Login()
     {
    	 Reporter.log("Login is passed",true);
     }
}
