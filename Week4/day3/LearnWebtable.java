package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebtable {
    public static void main(String[] args) throws InterruptedException {
       
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to("https://leafground.com/table.xhtml");
         // requirement : fetch the 1st client name from the table
        String firstClientName =  driver.findElement(By.xpath("//tbody[@class='ui-datatable-data ui-widget-content']/tr[1]/td[1]")).getText();
        System.out.println("first Client Name in the table is "+firstClientName);
        // requirement : fetch the all the client name in the table 
        int totatRowCount = driver.findElements(By.xpath("//tbody[@class='ui-datatable-data ui-widget-content']/tr")).size();
        int totatColumnCount = driver.findElements(By.xpath("//thead[@class='ui-datatable-scrollable-theadclone']//th")).size();
        for(int i = 1 ; i<= totatRowCount; i++){
             String clientName =  driver.findElement(By.xpath("//tbody[@class='ui-datatable-data ui-widget-content']/tr["+i+"]/td[1]")).getText();
             System.out.println("Client Name  is "+clientName);
        }
    Thread.sleep(3000);
        // requirement : fetch the all the information in the table 
        for(int i = 1 ; i<= totatRowCount; i++){// outer for loop ---> each row in the table
           
            for(int j = 1 ; j<=totatColumnCount; j++ ){ // inner for loop ---> each Column/field in the table
                Thread.sleep(200);
                 String fetchData =  driver.findElement(By.xpath("//tbody[@class='ui-datatable-data ui-widget-content']/tr["+i+"]/td["+j+"]")).getText();
                 System.out.print("|"+fetchData);
            }
             System.out.println("|");
        }
        driver.close();
    }
}
