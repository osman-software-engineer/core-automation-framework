package org.osmanacademy.listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class WebInvokedMethodListener implements IInvokedMethodListener {
	@Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("before invocation of " + method.getTestMethod().getMethodName());
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("after invocation " + method.getTestMethod().getMethodName());
    }

}
