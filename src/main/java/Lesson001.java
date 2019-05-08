import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson001 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\driver\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();   //Chrome浏览器
        String url ="http://www.baidu.com";
        driver.get(url);

        driver.manage().window().maximize();//最大化窗口
        Thread.sleep(2000);

        driver.get(url);
        driver.manage().window().setSize(new Dimension(1366,768));//固定尺寸窗口
        Thread.sleep(2000);

        WebElement search_text = driver.findElement(By.id("kw"));
        WebElement search_button = driver.findElement(By.id("su"));

        search_text.sendKeys("Java");//百度输入框中输入“Java”
        Thread.sleep(2000);
        search_text.clear();//百度输入框中清除文字
        Thread.sleep(2000);
        search_text.sendKeys("Selenium");//输入Selenium
        Thread.sleep(2000);
        search_text.clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"kw\"]")).sendKeys("万益能源");
        search_button.click();//点击按钮
        Thread.sleep(2000);

        driver.quit();
    }
}
