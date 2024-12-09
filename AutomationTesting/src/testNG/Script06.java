package testNG;

import org.apache.logging.log4j.core.util.Assert;
import org.testng.annotations.Test;

public class Script06 {
    @Test
    public void  search()
    {
    	System.out.println("Search is passed");
    }
    @Test(dependsOnMethods = "search")
    public void cart()
    {
    	System.out.println("cart is passed");
    }
     
    @Test(dependsOnMethods = "cart")
    public void wishlist()
    {
    	org.testng.Assert.fail();
    	System.out.println("wishlist is passed");
    }
    
}
