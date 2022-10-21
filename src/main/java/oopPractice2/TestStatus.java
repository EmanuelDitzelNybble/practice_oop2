package oopPractice2;

import java.util.HashMap;
import java.util.Map;

public class TestStatus {
    public TestStatus() {
    }

    public void getTestResultStatus(HashMap<String, Boolean> testResult)
    {
        for (Map.Entry<String,Boolean> data: testResult.entrySet()) {
            if (data.getValue() == false){
                System.out.println("Test fail! :"+data.getKey());
            } else if (data.getValue() == true) {
                System.out.println("Test OK, no problem :"+data.getKey());
            }
        }
    }
}
