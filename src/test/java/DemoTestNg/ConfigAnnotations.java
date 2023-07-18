package DemoTestNg;

import org.testng.annotations.*;

@Test(groups = "regression")
public class ConfigAnnotations {
    @Test(groups = "smoke")
    public void test1_BootstrapDatePicker(){
        System.out.println("(5) Test Method 1: Bootstrap Date Picker");
    }

    @Test(groups = { "regression", "e2e"} )
    public void test2_JQueryDatePicker(){
        System.out.println("(5) Test Method 2: JQuery Date Picker");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println(" (4) Execute before each test method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println(" (4) Execute after each test method");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println(" (3) Execute before class: Date Picker");
    }

    @AfterClass
    public void afterClass(){
        System.out.println(" (3) Execute after class: Date Picker");
    }

    @BeforeGroups(groups = {"regression", "smoke"})
    public void beforeGroups(){
        System.out.println("Execute Before Groups");
    }

    @AfterGroups(groups = {"regression", "smoke"})
    public void afterGroups(){
        System.out.println("Execute after Groups");
    }
}
