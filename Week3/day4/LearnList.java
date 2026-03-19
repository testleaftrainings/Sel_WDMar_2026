package week3.day4;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearnList {
    // findElement() --> WebElement
    // findElements() --> List<WebElement>
    public static void main(String[] args) {
        FirefoxDriver driver = new FirefoxDriver();
        driver.navigate().to("http://leaftaps.com/opentaps/control/login");
        List<WebElement> labelList = driver.findElements(By.tagName("label"));
        int sizeOfList = labelList.size(); //2
        // Requirement : to print the visible text present inside the label tag
         // seg1 : initialized ; seg2 : conditionCheck ; seg3 : incremental/decremental operation 
       for (int i = 0; i < sizeOfList; i++) {
          String extractedText= labelList.get(i).getText();
          if(extractedText.equals("Password"))
          System.out.println("Visible Text ("+i+") is "+extractedText);
       }
       driver.close();
    }
}
