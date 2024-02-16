package testngannotations;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class AnnotationsExamples {
	
	@Test//(description ="This is sample test")
	public void test1() {
		System.out.println("this is under test1");
		
	}
	@Test(dependsOnMethods = {"test1", "test3"})
	@Parameters({"apple","bat"})

	public void test2(@Optional ("apple1")String a, @Optional("bat1")String b) {
		System.out.println("This is under test2");
		System.out.println(a+ " "+b);
		
	}
	
	
	@Test
	public void test3() {
		System.out.println("This is under test3");
		
	}
}
