package org.example.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SortSearchActions {
    private WebDriver driver;

    public SortSearchActions(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void enterText(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }
}
