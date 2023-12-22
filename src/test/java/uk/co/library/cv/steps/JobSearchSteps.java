package uk.co.library.cv.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import uk.co.library.cv.pages.HomePage;
import uk.co.library.cv.pages.ResultPage;

public class JobSearchSteps {
    @Given("I am on Home Page")
    public void iAmOnHomePage() {
        new HomePage().acceptCookies();
    }

    @When("I enter job title {string}")
    public void iEnterJobTitle(String title) throws InterruptedException {
        new HomePage().enterJobTitle(title);
    }

    @And("I enter location {string}")
    public void iEnterLocation(String location) {
        new HomePage().enterJobLocation(location);
    }

    @And("I select distance {string}")
    public void iSelectDistance(String distance) {
        new HomePage().enterJobDistance(distance);
    }

    @Then("I click on moreSearchOptions Link")
    public void iClickOnMoreSearchOptionsLink() {
        new HomePage().clickOnMoreOptionsLink();
    }

    @And("I enter salaryMin {string}")
    public void iEnterSalaryMin(String salaryMin) {
        new HomePage().enterSalaryMin(salaryMin);
    }

    @And("I enter salaryMax {string}")
    public void iEnterSalaryMax(String salaryMax) {
        new HomePage().enterSalaryMax(salaryMax);
    }

    @And("I select salaryType {string}")
    public void iSelectSalaryType(String salaryType) {
        new HomePage().enterSalaryType(salaryType);
    }

    @And("I select jobType {string}")
    public void iSelectJobType(String jobType) {
        new HomePage().enterJobType(jobType);
    }

    @Then("I click on Find Jobs button")
    public void iClickOnFindJobsButton() {
        new HomePage().clickOnFindJobsButton();
    }

    @And("I verify the result {string}")
    public void iVerifyTheResult(String result) {
        Assert.assertEquals(new ResultPage().verifyTheResult(), result, "Error");;
    }
}
