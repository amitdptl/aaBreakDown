package aaBreakDown;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 25/04/2017.
 */
public class MyStepdefs
{
    WebDriver driver;
    @Given("^The user is on home page$")
    public void theUserIsOnHomePage() {
        driver =new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.theaa.com/");

    }

    @When("^The user click on Buy breakdown cover button at middle of the page$")
    public void The_user_click_on_Buy_breakdown_cover_button_at_middle_of_the_page() {
        driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div/figure/figcaption/div/a[1]")).click();

    }

    @Then("^The user should nevigate to breakdown page successfully$")
    public void the_user_should_nevigate_to_breakdown_page_successfully(){
        Assert.assertTrue("User is not on breakdown page",driver.getCurrentUrl().contains("breakdown-cover"));

        driver.quit();
    }
     @Given("^The user is on breakdow cover page$")
        public void The_user_is_on_breakdow_cover_page() {

        driver = new FirefoxDriver();
        driver.get("https://www.theaa.com/breakdown-cover/");

     }

        @When("^The user click on join now for £(\\d+)/month membership$")
        public void The_user_click_on_join_now_for_£_month_membership(int arg1) {

        driver.findElement(By.xpath("//article/div/div[2]/div/div[2]/a[contains(text(),'Join now')]")).click();
        }

        @Then("^The user should nevigate to Customise your UK breakdown cover page successfully$")
        public void The_user_should_nevigate_to_Customise_your_UK_breakdown_cover_page_successfully() {

        driver.quit();

        }


    }

