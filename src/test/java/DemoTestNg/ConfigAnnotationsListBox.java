package DemoTestNg;

import org.testng.annotations.*;

public class ConfigAnnotationsListBox {
    @Test
    public void test1_BootstrapDatePicker(){
        System.out.println("(5) Test Method 1: Bootstrap List Box");
    }

    @Test
    public void test2_JQueryDatePicker(){
        System.out.println("(5) Test Method 2: JQuery List Box");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("(2) Execute before each test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("(2) Execute before each test");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("(1) Execute before the suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("(1) Execute after the suite");
    }
}
