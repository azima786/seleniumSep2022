package test.java.com.TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

    @Test
public void name() {
    System.out.println("HELLO");
}

@Test
public void name2() {
    System.out.println("HELLO2");
}

@Test
public void name3() {
    System.out.println("HELLO3");
}

@Test(groups={"smoke"})
public void name4() {
    System.out.println("I am smoke");
}
@BeforeMethod
public void prerequest(){
    System.out.println("Before this method!");
}

@AfterTest
public void AfterTest(){
    System.out.println("After all test!");
}

@BeforeSuite
public void afterSuite(){
    System.out.println("I am before all test");
}

@BeforeClass
public void BeforeClass(){
    System.out.println("I am before all class in this test");
}
}
