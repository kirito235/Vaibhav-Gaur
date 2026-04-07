package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class login {

    WebDriver driver = new ChromeDriver();



    @Given("Test Page Invoke")
    public void test_page_invoke() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }
    @When("Enter details and submit")
    public void enter_details_and_submit() {
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();
    }
    @Then("Login Successful")
    public void login_successful() {
        Assert.assertEquals(driver.findElement(By.xpath("//h1[text()='Logged In Successfully']")).toString(),"Login Successful");
    }

}
