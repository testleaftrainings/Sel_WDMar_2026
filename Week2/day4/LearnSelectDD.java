package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectDD {
public static void main(String[] args) {
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://leafground.com/select.xhtml");
    // way 1 : we can consider the dropdown value as normal webelement --> <ul><li> .click()
    // way 2 : if we see the <select> tag --> selectByIndex(int index),selectByValue(String value),selectByVisibleText(String text)
    WebElement selectDD = driver.findElement(By.className("ui-selectonemenu"));
    Select selectObj = new Select(selectDD);
    selectObj.selectByVisibleText("Selenium");
    driver.close();
}
}
