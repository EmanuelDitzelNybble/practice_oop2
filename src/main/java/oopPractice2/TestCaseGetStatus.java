package oopPractice2;

import java.util.HashMap;

public class TestCaseGetStatus extends TestCase {

    @Override
    public void pushTest(HashMap<String, Boolean> testResults, String nameOfTest) {

    }

    @Override
    public boolean getTestStatus(HashMap<String, Boolean> testResults, String nameOfTest) {
        if (testResults.get(nameOfTest)) {
            System.out.println("This test status is: OK");
        } else {
            System.out.println("This test status is: NOT OK");
        }
            return false;
    }
}

