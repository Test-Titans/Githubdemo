package LsitenerDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class liste implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println(result.getName()+"Test Started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println(result.getName()+"Test passed");

    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println(result.getName()+"Test failed");

    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
