package testclass1;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class testclass1
{
    WebDriver webDriver;
    WebElement element;
    WebElement element2,element3,element4,element5,element6, element7;
    private static ChromeDriver Webdriver;
    @BeforeClass
    public  static void gittigidiyorgiris()
    {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
        Webdriver = new ChromeDriver();
        Webdriver.manage().window().maximize();
        Webdriver.get("https://www.gittigidiyor.com/");
    }
    @Test
    public void Senaryo_01_UrunArama()
    {

        element= (WebElement) webDriver.findElements(xpath.girisYapPopAc);
        element.click();
        element2= (WebElement) webDriver.findElements(xpath.girisYap);
        element2.click();
element3= (WebElement) webDriver.findElements(xpath.epostaGiris);
        element3.sendKeys("asd@gmail.com");
        element4= (WebElement) webDriver.findElements(xpath.sifreGiris);
        element4.sendKeys("123456");
        element5= (WebElement) webDriver.findElements(xpath.girisYapButton);
        element5.click();
        element6 = (WebElement) webDriver.findElements(xpath.araKutusu);
        element6.click();
        element7= (WebElement) webDriver.findElements(xpath.bulButton);
        element7.click();
   }  }