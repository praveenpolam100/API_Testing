package testngannotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.java.After;
import io.cucumber.java.BeforeAll;

public class Annotations {

	@Test(priority = 1)
	public void test1() {
		System.out.println("This is test1");

	}

	@Test(priority = 2)
	public void test2() {

		System.out.println("This is test2");
	}

	@BeforeTest
	public void test3() {

		System.out.println("Before Test");

	}

	@AfterTest
	public void test4() {

		System.out.println("After Test");

	}

	@BeforeMethod
	public void test5() {

		System.out.println("Before Method");
	}

	@AfterMethod
	public void test6() {

		System.out.println("After Method");
	}

	@BeforeClass
	public void test7() {

		System.out.println("Before class");

	}

	@AfterClass
	public void test8() {

		System.out.println("After class");

	}

	@BeforeSuite
	public void test9() {

		System.out.println("Before Suite");
	}

	@AfterSuite
	public void test10() {

		System.out.println("After Suite");
	}

	@BeforeAll
	public void test11() {

		System.out.println("This is before all");

	}
}
