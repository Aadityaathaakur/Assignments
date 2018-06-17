package TestExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tatoc {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\extra softwares\\chromedriver.exe");

        WebDriver driver = new ChromeDriver(); 
        driver.get("http://10.0.1.86//tatoc"); 
        driver.findElement(By.linkText("Basic Course")).click();
        driver.findElement(By.className("greenbox")).click();
        
             driver.switchTo().frame(0);
        
        String box1 =   driver.findElement(By.id("answer")).getAttribute("class");
        
		
while(true){
            
	driver.findElement(By.cssSelector("a")).click();
	driver.switchTo().frame("child"); 
            
			String box2 = driver.findElement(By.id("answer")).getAttribute("class");
            driver.switchTo().parentFrame();
            
            
            if(box1.equals(box2))
            {
            	driver.findElements(By.cssSelector("a")).get(1).click(); 
                break;
            }
        
            
        }
	   	
			
		
		
	}

}
