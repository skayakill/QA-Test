package baseTests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class firstTests {

    public void TC01() {
        System.setProperty("chromedriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" "); //untuk Menuju halaman website atau URL yang di inginkan
        Duration duration = Duration.ofSeconds(10); //Waktu untuk melakukan Test Automation
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("submit"))
        );
        driver.findElement(By.name(" ")).sendKeys("Johnsen");
        driver.findElement(By.name("submit")).click();
    }


    public void TC02() {
        System.setProperty("chromedriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" "); //untuk Menuju halaman website atau URL yang di inginkan
        Duration duration = Duration.ofSeconds(10); //Waktu untuk melakukan Test Automation
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("submit"))
        );
        driver.findElement(By.name(" ")).sendKeys(" ");// First Name Kosong
        driver.findElement(By.name("submit")).click();
    }


    public void TC03() {
        System.setProperty("chromedriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" "); //untuk Menuju halaman website atau URL yang di inginkan
        Duration duration = Duration.ofSeconds(10); //Waktu untuk melakukan Test Automation
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("submit"))
        );
        driver.findElement(By.name(" ")).sendKeys("1234567");
        driver.findElement(By.name("submit")).click();
    }


    public void TC04() {
        System.setProperty("chromedriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" "); //untuk Menuju halaman website atau URL yang di inginkan
        Duration duration = Duration.ofSeconds(10); //Waktu untuk melakukan Test Automation
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("submit"))
        );
        driver.findElement(By.name(" ")).sendKeys("!@#$");
        driver.findElement(By.name("submit")).click();
    }


    public void TC05() {
        System.setProperty("chromedriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" "); //untuk Menuju halaman website atau URL yang di inginkan
        Duration duration = Duration.ofSeconds(10); //Waktu untuk melakukan Test Automation
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("submit"))
        );
        driver.findElement(By.name(" ")).sendKeys(" Johnsen");
        driver.findElement(By.name("submit")).click();
    }


    public void TC06() {
        System.setProperty("chromedriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" "); //untuk Menuju halaman website atau URL yang di inginkan
        Duration duration = Duration.ofSeconds(10); //Waktu untuk melakukan Test Automation
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("submit"))
        );
        driver.findElement(By.name(" ")).sendKeys("Johnsen ");
        driver.findElement(By.name("submit")).click();
    }


    public void TC07() {
        System.setProperty("chromedriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" "); //untuk Menuju halaman website atau URL yang di inginkan
        Duration duration = Duration.ofSeconds(10); //Waktu untuk melakukan Test Automation
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("submit"))
        );
        driver.findElement(By.name(" ")).sendKeys("@Johnsen");
        driver.findElement(By.name("submit")).click();
    }


    public void TC08() {
        System.setProperty("chromedriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" "); //untuk Menuju halaman website atau URL yang di inginkan
        Duration duration = Duration.ofSeconds(10); //Waktu untuk melakukan Test Automation
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("submit"))
        );
        driver.findElement(By.name(" ")).sendKeys("Johnsen@");
        driver.findElement(By.name("submit")).click();
    }


    public void TC09() {
        System.setProperty("chromedriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" "); //untuk Menuju halaman website atau URL yang di inginkan
        Duration duration = Duration.ofSeconds(10); //Waktu untuk melakukan Test Automation
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("submit"))
        );
        driver.findElement(By.name(" ")).sendKeys("123Johnsen");
        driver.findElement(By.name("submit")).click();
    }


    public void TC10() {
        System.setProperty("chromedriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" "); //untuk Menuju halaman website atau URL yang di inginkan
        Duration duration = Duration.ofSeconds(10); //Waktu untuk melakukan Test Automation
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("submit"))
        );
        driver.findElement(By.name(" ")).sendKeys("Johnsen456");
        driver.findElement(By.name("submit")).click();
    }


    public void TC11() {
        System.setProperty("chromedriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" "); //untuk Menuju halaman website atau URL yang di inginkan
        Duration duration = Duration.ofSeconds(10); //Waktu untuk melakukan Test Automation
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("Submit"))
        );
        driver.findElement(By.name(" ")).sendKeys("qwertyuiopasdfghjklz");
        driver.findElement(By.name("submit")).click();
    }


    public void TC12() {
        System.setProperty("chromedriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" "); //untuk Menuju halaman website atau URL yang di inginkan
        Duration duration = Duration.ofSeconds(10); //Waktu untuk melakukan Test Automation
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("Submit"))
        );
        driver.findElement(By.name(" ")).sendKeys("Johnsen9_");
        driver.findElement(By.name("submit")).click();
    }


    public void TC13() {
        System.setProperty("chromedriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" "); //untuk Menuju halaman website atau URL yang di inginkan
        Duration duration = Duration.ofSeconds(10); //Waktu untuk melakukan Test Automation
        WebDriverWait wait = new WebDriverWait(driver, duration);

        WebElement maleRadioButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='radio' and @name='gender' and @value='male']")));
        if (!maleRadioButton.isSelected()) {
            maleRadioButton.click();
            System.out.println("Tombol radio 'male' berhasil dipilih.");
        }

    }


    public void TC14() {
        System.setProperty("chromedriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" "); //untuk Menuju halaman website atau URL yang di inginkan
        Duration duration = Duration.ofSeconds(10); //Waktu untuk melakukan Test Automation
        WebDriverWait wait = new WebDriverWait(driver, duration);

        WebElement femaleRadioButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='radio' and @name='gender' and @value='female']")));
        if (!femaleRadioButton.isSelected()) {
            femaleRadioButton.click();
            System.out.println("Tombol radio 'female' berhasil dipilih.");
        }

    }


    public void TC15() {
        System.setProperty("chromedriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" "); //untuk Menuju halaman website atau URL yang di inginkan
        Duration duration = Duration.ofSeconds(10); //Waktu untuk melakukan Test Automation
        WebDriverWait wait = new WebDriverWait(driver, duration);

        WebElement dateInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("datePicker"))
        );
        dateInput.sendKeys("05-02-1999");
    }


    public void TC16() {
        System.setProperty("chromedriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" "); //untuk Menuju halaman website atau URL yang di inginkan
        Duration duration = Duration.ofSeconds(10); //Waktu untuk melakukan Test Automation
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("submit"))
        );
        driver.findElement(By.name("Submit")).click();
    }


    public void TC17() {
        System.setProperty("chromedriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" "); //untuk Menuju halaman website atau URL yang di inginkan
        Duration duration = Duration.ofSeconds(10); //Waktu untuk melakukan Test Automation
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("iconleft"))
        );
        driver.findElement(By.id("iconleft")).click();
    }


    public void TC18() {
        System.setProperty("chromedriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" "); //untuk Menuju halaman website atau URL yang di inginkan
        Duration duration = Duration.ofSeconds(10); //Waktu untuk melakukan Test Automation
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("submit"))
        );
        driver.findElement(By.name("firstname")).sendKeys("Johnsen");
        driver.findElement(By.name("firstname")).sendKeys("il");
        driver.findElement(By.name("firstname")).sendKeys("Yudasryo");
        WebElement maleRadioButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='radio' and @name='gender' and @value='male']")));
        if (!maleRadioButton.isSelected()) {
            maleRadioButton.click();
        }
        WebElement dateInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("datePicker"))
        );
        dateInput.sendKeys("05-02-1999");
        driver.findElement(By.name("submit")).click();


    }


}
