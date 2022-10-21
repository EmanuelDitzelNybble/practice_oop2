package oopPractice2;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Boolean> testResults = new HashMap<String,Boolean>();
        // <Test Case Name, Test Case Status>
        testResults.put("TC1", true);
        testResults.put("TC2", true);
        testResults.put("TC3", true);
        testResults.put("TC4", false);
        testResults.put("TC5", true);
        testResults.put("TC6", true);
        testResults.put("TC7", false);
        testResults.put("TC8", true);
        testResults.put("TC9", false);
        testResults.put("TC10", true);
        testResults.put("TC11", false);
        testResults.put("TC12", true);

        System.out.println("--------------");
        TestStatus firstTest = new TestStatus();
        firstTest.getTestResultStatus(testResults);
        System.out.println("--------------");
        TestCaseJira secondTest = new TestCaseJira();
        secondTest.pushTest(testResults,"TC5");
        System.out.println("--------------");
        TestCaseGetStatus thirdTest = new TestCaseGetStatus();
        thirdTest.getTestStatus(testResults,"TC3");
    }
}