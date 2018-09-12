package tests;


import org.testng.annotations.Test;

public class TestMainPage extends BaseTest{
    @Test(description = "C49")
    void testSearch() {
        mainPageSteps.search("Cool dress!!!");

    }


}