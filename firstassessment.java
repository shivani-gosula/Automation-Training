import org.openqa.selenium.By;
import java.util.*; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstassessment {
	public static void main(String args[]) {
	
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Sgossulaeh\\Desktop\\chromedriver.exe");
    WebDriver Driver= new ChromeDriver();
    Driver.get("https://www.toolsqa.com/automation-practice-table/");
 List<WebElement> yearlist=Driver.findElements(( By.xpath(".//tbody/tr/td[4]")));
 List<WebElement> Structure=Driver.findElements(( By.xpath(".//tbody/tr/th")));  
    Map<Integer,String> Monuments=new TreeMap<Integer,String>();{
        List<Integer> years = new ArrayList<Integer>();
	    List<String> names = new ArrayList<String>(); 
	 
    for (WebElement webElement : yearlist) 
	  {
	       years.add( Integer.parseInt(webElement.getText()));
	      
	  }
	for (WebElement webElement1 : Structure) 
	   {
	       names.add ((webElement1.getText()));

	    }   
	 Iterator<Integer> i1 = years.iterator();
	 Iterator<String> i2 = names.iterator();
	 while (i1.hasNext() && i2.hasNext()) {
	    Monuments.put(i1.next(), i2.next());
	  }
	
    System.out.print(Monuments);          
	        }
	     
	}
   
   
	
}

