package reporting;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import java.util.HashMap;
import java.util.Map;

public class ExtentTestManager {

    static Map<Integer, com.relevantcodes.extentreports.ExtentTest> extentTestMap = new HashMap<Integer, com.relevantcodes.extentreports.ExtentTest>();
    private static ExtentReports extent = ExtentManager.getInstance();
    private static ExtentReports extentUpdate = ExtentManager.getInstance();
    public static synchronized com.relevantcodes.extentreports.ExtentTest getTest() {
        return extentTestMap.get((int) (long) (Thread.currentThread().getId()));
    }
    public static synchronized void endTest() {
        extent.endTest(extentTestMap.get((int) (long) (Thread.currentThread().getId())));
    }
    public static synchronized ExtentTest startTest(String testName) {
        return startTest(testName, "");
    }
    public static synchronized com.relevantcodes.extentreports.ExtentTest startTestClass(String className, String testName) {
        return startTest(className,testName, "");
    }
    public static synchronized com.relevantcodes.extentreports.ExtentTest startTest(String testName, String desc) {
        com.relevantcodes.extentreports.ExtentTest test = extent.startTest(testName, desc);
        extentTestMap.put((int) (long) (Thread.currentThread().getId()), test);
        return test;
    }
    public static synchronized com.relevantcodes.extentreports.ExtentTest startTest(String className, String testName, String desc) {
        com.relevantcodes.extentreports.ExtentTest test = extentUpdate.startTest(testName, desc);
        extentTestMap.put((int) (long) (Thread.currentThread().getId()), test);
        return test;
    }
}
