package uk.co.library.cv.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.cv.utility.Utility;

public class ResultPage extends Utility {

    @CacheLookup
    @FindBy(css = "body.site-cvlibrary-uk.header-search-bar-showing:nth-child(2) main.site-main:nth-child(7) div.site-wrapper div.page-wrapper.page-wrapper--faceted.container-1200:nth-child(2) div.page-main:nth-child(4) div.search-header:nth-child(1) div.search-header__left > h1.search-header__title")
    WebElement verifyResult;

    public String verifyTheResult() {
        return getTextFromElement(verifyResult);
    }

}

