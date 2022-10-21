package oopPractice2;

import java.util.HashMap;

public abstract class TestCase {


    public abstract void pushTest(HashMap<String, Boolean> testResults, String nameOfTest);

    public boolean getTestStatus(HashMap<String, Boolean> testResults, String nameOfTest){
        if(testResults.containsKey(nameOfTest)){
            return testResults.get(nameOfTest);
        } else {
         System.out.println("Invalid data, test does not exist");
         return false;
        }
    }
}
