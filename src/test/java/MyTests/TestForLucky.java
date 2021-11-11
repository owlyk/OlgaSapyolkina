package MyTests;

import homework3.Lucky;
import org.testng.annotations.*;

public class TestForLucky {

    public Lucky lucky = new Lucky();

    @Test
    public void test1()
    {
        System.out.println("Test1 is in progress");
    }

    @BeforeMethod
    public void beforetests()
    {
        System.out.println("This is text before each test");
    }

    @AfterMethod
    public void aftertests()
    {
        System.out.println("This is text after each test");
    }

    @Test
    public void test2()
    {
        System.out.println("Test2 is in progress");
    }

    @BeforeTest
    public void beforeTest()

    {
        System.out.println("Tests are started");
    }

    @AfterTest
    public void afterTest()
    {
        System.out.println("Tests are finished");
    }

    @BeforeSuite
    public void beforeAllTests()
    {
        System.out.println("Testing is started");
    }

    @AfterSuite
    public void afterAllTests()
    {
        System.out.println("Testing is finished");
    }


}


