package uk.co.library.cv.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.cv.utility.Utility;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(id = "keywords")
    WebElement jobTitle1;
    @CacheLookup
    @FindBy(id = "location")
    WebElement location1;
    @CacheLookup
    @FindBy(id = "distance")
    WebElement distance1;
    @CacheLookup
    @FindBy(id = "toggle-hp-search")
    WebElement moreOptions;
    @CacheLookup
    @FindBy(id = "salarymin")
    WebElement salaryMin1;
    @CacheLookup
    @FindBy(id = "salarymax")
    WebElement salaryMax1;
    @CacheLookup
    @FindBy(id = "salarytype")
    WebElement salaryType1;
    @CacheLookup
    @FindBy(id = "tempperm")
    WebElement jobType1;
    @CacheLookup
    @FindBy(id = "hp-search-btn")
    WebElement findJobsButton;
    @CacheLookup
    @FindBy(xpath = "//button[@id='save']/span/div/span")
    WebElement acceptAll;

    public void acceptCookies() {
        driver.switchTo().frame("gdpr-consent-notice");
        log.info("acceptCookies " + acceptAll.toString());
        clickOnElement(acceptAll);
    }   // use switchto().frame()

    public void enterJobTitle(String title) throws InterruptedException {
        Thread.sleep(1000);
        log.info("enterJobTitle " + jobTitle1.toString());
        sendTextToElement(jobTitle1, title);
    }

    public void enterJobLocation(String location) {
        log.info("enterJobLocation " + location1.toString());
        sendTextToElement(location1, location);
    }

    public void enterJobDistance(String distance) {
        //mouseHoverToElementAndClick(distance1);
        log.info("enterJobDistance " + distance1.toString());
        selectByVisibleTextFromDropDown(distance1, distance);
    }

    public void clickOnMoreOptionsLink() {
        if (moreOptions.getText().equalsIgnoreCase("More search options")) {
            log.info("clickOnMoreOptionsLink " + moreOptions.toString());
            clickOnElement(moreOptions);
        }
    }

    public void enterSalaryMin(String salaryMin) {
        log.info("enterSalaryMin " + salaryMin1.toString());
        sendTextToElement(salaryMin1, salaryMin);
    }

    public void enterSalaryMax(String salaryMax) {
        log.info("enterSalaryMax " + salaryMax1.toString());
        sendTextToElement(salaryMax1, salaryMax);
    }

    public void enterSalaryType(String salaryType) {
        log.info("enterSalaryType " + salaryType1.toString());
        selectByVisibleTextFromDropDown(salaryType1, salaryType);
    }

    public void enterJobType(String jobType) {
        log.info("enterJobType " + jobType1.toString());
        selectByVisibleTextFromDropDown(jobType1, jobType);
    }

    public void clickOnFindJobsButton() {
        log.info("clickOnFindJobsButton " + findJobsButton.toString());
        clickOnElement(findJobsButton);
    }
}

