package usingIRetryAnalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IRetryAnaly {

	
	@Test(retryAnalyzer=RetryListner.class)
	public  void case1() {
		Assert.assertEquals(true, false);
	}
	@Test
	public void case2() {
		Assert.assertEquals(true, true);
	}
}
