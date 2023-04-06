package usingIAnnotationTransformer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases {
	@Test
	public  void case1() {
		Assert.assertEquals(true, false);
	}
	@Test
	public void case2() {
		Assert.assertEquals(true, true);
	}
	

}
