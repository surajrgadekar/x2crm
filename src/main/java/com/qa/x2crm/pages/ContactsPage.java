package com.qa.x2crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.x2crm.testbase.TestBase;

public class ContactsPage extends TestBase {

	@FindBy(xpath="//input[@id='Contacts_firstName']")
	WebElement firstName;
	
	@FindBy(xpath="	//input[@id='Contacts_lastName']")
	WebElement lastName;
	
	@FindBy(xpath="//select[@id='Contacts_visibility']")
	WebElement visibility;
	
	@FindBy(xpath="//input[@id='Contacts_phone']")
	WebElement phone;
		
	@FindBy(xpath="//input[@id='save-button']")
	WebElement createBtn;
	
	
	
	
	
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	public void verifyContactsLink() {
		
	}
	public void CreateContacts(String firstname,String Lastname,String phone) {
		
	}
	
	
}
