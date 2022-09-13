package test.java.com.TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//Itest Listener
public class listeners implements ITestListener{
    
/**
 * 
 */


@Override
protected Object clone() throws CloneNotSupportedException {
    // TODO Auto-generated method stub
    return super.clone();
}

@Override
public boolean equals(Object o) {
    // TODO Auto-generated method stub
    return super.equals(o);
}

@Override
protected void finalize() throws Throwable {
    // TODO Auto-generated method stub
    super.finalize();
}

@Override
public int hashCode() {
    // TODO Auto-generated method stub
    return super.hashCode();
}

@Override
public String toString() {
    // TODO Auto-generated method stub
    return super.toString();
}

@Override
public void onFinish(ITestContext context) {
    // TODO Auto-generated method stub
    ITestListener.super.onFinish(context);
}

@Override
public void onStart(ITestContext context) {
    // TODO Auto-generated method stub
    ITestListener.super.onStart(context);
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    // TODO Auto-generated method stub
    ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
}

@Override
public void onTestFailedWithTimeout(ITestResult result) {
    // TODO Auto-generated method stub
    ITestListener.super.onTestFailedWithTimeout(result);
}

@Override
public void onTestFailure(ITestResult result) {
   System.out.println("Test failed");
    ITestListener.super.onTestFailure(result);
}

@Override
public void onTestSkipped(ITestResult result) {
   System.out.println(result.getName());
    ITestListener.super.onTestSkipped(result);
}

@Override
public void onTestStart(ITestResult result) {
   System.out.println("Test started "+result.getName());
    ITestListener.super.onTestStart(result);
}


}
