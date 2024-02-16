package testngannotations;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups = {"Regression"})
	
	public void test1() {
		System.out.println("This is Regression test under Test1");
		
	}
	
	@Test(groups = {"Sanity"})
	public void test2() {
		System.out.println("This is Sanity test under Test2");
		
	}
	
	@Test(groups = {"Regression"})
	public void test3() {
		System.out.println("This is Regression test under Test3");
		
	}

}
