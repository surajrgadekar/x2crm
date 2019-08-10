package com.qa.x2crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.x2crm.testbase.TestBase;

public class HomePage extends TestBase {
	
@FindBy(xpath="//a[contains(text(),'Activity')]")
WebElement ActivityLink;
	
@FindBy(xpath="//a[contains(text(),'Contacts')]")
WebElement ContactsLink;

@FindBy(xpath="//a[contains(text(),'Accounts')]")
WebElement AccountsLink;

@FindBy(xpath="//a[contains(text(),'Marketing')]")
WebElement MarketingLink;

	
public HomePage() {
	PageFactory.initElements(driver, this);
}

public String homePageTitle() {
	return driver.getTitle();
}

public ActivityPage clickOnActivityLink() {
	ActivityLink.click();
	return new ActivityPage();
}


public ContactsPage clickOnContactsLink() {
	ActivityLink.click();
	return new ContactsPage();

}
public AccountsPage clickOnAccountsLink() {
	ActivityLink.click();
	return new AccountsPage();

}
public MarketingPage clickOnMarketingsLink() {
	ActivityLink.click();
	return new MarketingPage();

}

}
