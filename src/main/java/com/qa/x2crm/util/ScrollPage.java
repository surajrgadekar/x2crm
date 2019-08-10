package com.qa.x2crm.util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.qa.x2crm.testbase.TestBase;

public class ScrollPage extends TestBase {
public static void scrollingBottomPage() {
	 ((JavascriptExecutor) driver)
     .executeScript("window.scrollTo(0, document.body.scrollHeight)");
}

public void scrollingToElementofPage() {
	WebElement element = driver.findElement(By.linkText("Import/Export"));
	((JavascriptExecutor) driver).executeScript(
			"arguments[0].scrollIntoView();", element);
}

public void scrollingByCoordinatesofPage() {
	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
}
}

