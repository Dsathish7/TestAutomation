package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script07 {
	@Test
	public void sslc() {
		Reporter.log("passss sslc");
	}
	@Test(dependsOnMethods = "sslc")
    public void diploma()
    {
		Reporter.log("passs diploma");
    }
    @Test(dependsOnMethods = "diploma")
    public void btech()
    {
    	Reporter.log("passs btech");
    }
}
