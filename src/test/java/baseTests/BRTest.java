package baseTests;

import config.envTarget;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BRTest extends envTarget {
    @Test
    public void BM_TC01() {
        System.setProperty("chromedriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl); // URL website borobudurmarathon
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='nav-bar nav--absolute nav--transparent']"))
        );
        driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();  // Klik menu "The Home"
        driver.findElement(By.xpath("//a[normalize-space()='The Race']")).click(); //  Klik menu "The Race"
        driver.findElement(By.xpath("//a[normalize-space()='Guide']")).click(); // Klik menu "Guide"
        driver.findElement(By.xpath("//a[normalize-space()='Media']")).click(); //  Klik menu "Media"
        driver.findElement(By.xpath("//a[normalize-space()='Contact']")).click(); //  Klik menu "Contact"
        driver.findElement(By.xpath("//a[normalize-space()='Apps']")).click(); //  Klik menu "Apps"

        driver.close();
        // Expected Result: Menu navigasi utama berfungsi setiap diklik dan sub-menu sesuai dengan konten yang relevan
    }
    @Test
    public void BM_TC02() throws InterruptedException {
        System.setProperty("chromedriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        Duration duration = Duration.ofSeconds(30);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='The Race']"))
        );
        driver.findElement(By.xpath("//a[normalize-space()='The Race']")).click(); // Klik menu "The Race"
        driver.findElement(By.xpath("//a[normalize-space()='Race Category']")).click(); // Klik sub-menu "Race Category"

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='The Race']"))
        );
        driver.findElement(By.xpath("//a[normalize-space()='The Race']")).click(); // Klik menu "The Race"
        driver.findElement(By.xpath("//a[normalize-space()='FAQ']")).click();  // Klik sub-menu "FAQ"
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/faq-borobudur-marathon']"))
        );

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='The Race']"))
        );
        driver.findElement(By.xpath("//a[normalize-space()='The Race']")).click(); // Klik menu "The Race"
        driver.findElement(By.xpath("//a[normalize-space()='Rules & Regulations']")).click(); // Klik sub-menu "Rules & Regulations"

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='The Race']"))
        );
        driver.findElement(By.xpath("//a[normalize-space()='The Race']")).click(); // Klik menu "The Race"
        driver.findElement(By.xpath("//a[normalize-space()='Race Results']")).click(); // Klik sub-menu "Race Results"

        driver.close();
    }

    @Test
    public void BM_TC03() {
        System.setProperty("chromedriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        Duration duration = Duration.ofSeconds(30);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Guide']"))
        );
        driver.findElement(By.xpath("//a[normalize-space()='Guide']")).click(); // Klik menu "Guide"
        driver.findElement(By.xpath("//a[normalize-space()='Accomodation']")).click(); // Klik sub-menu "Accomodation"

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Guide']"))
        );
        driver.findElement(By.xpath("//a[normalize-space()='Guide']")).click(); // Klik menu "Guide"
        driver.findElement(By.xpath("//a[normalize-space()='Transportation']")).click();  // Klik sub-menu "Transportation"

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Guide']"))
        );
        driver.findElement(By.xpath("//a[normalize-space()='Guide']")).click(); // Klik menu "Guide"
        driver.findElement(By.xpath("//a[normalize-space()='Magelang City Guide']")).click(); // Klik sub-menu "Magelang City Guide"
        driver.close();
    }

    @Test
    public void BM_TC04() {
        System.setProperty("chromedriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        Duration duration = Duration.ofSeconds(30);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Media']"))
        );
        driver.findElement(By.xpath("//a[normalize-space()='Media']")).click(); // Klik menu "Media"
        driver.findElement(By.xpath("//a[normalize-space()='Gallery']")).click(); // Klik sub-menu "Gallery"
        driver.close();
    }

    @Test
    public void BM_TC05() {
        System.setProperty("chromedriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        Duration duration = Duration.ofSeconds(30);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Contact']"))
        );
        driver.findElement(By.xpath("//a[normalize-space()='Contact']")).click(); // Klik menu "Contact"
        driver.findElement(By.xpath("//a[normalize-space()='Sponsors']")).click(); // Klik sub-menu "Sponsors"

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Contact']"))
        );
        driver.findElement(By.xpath("//a[normalize-space()='Contact']")).click(); // Klik menu "Contact"
        driver.findElement(By.xpath("//a[normalize-space()='Feedback']")).click(); // Klik sub-menu "Feedback"

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Contact']"))
        );
        driver.findElement(By.xpath("//a[normalize-space()='Contact']")).click(); // Klik menu "Contact"
        driver.findElement(By.xpath("//a[normalize-space()='Contact Us']")).click(); // Klik sub-menu "Contact Us"
        driver.close();
    }

    @Test
    public void BM_TC06() {
        System.setProperty("chromedriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        Duration duration = Duration.ofSeconds(30);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/apps/']"))
        );
        driver.findElement(By.xpath("//a[@href='/apps/']")).click();  // Klik menu "Apps"
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[normalize-space()='Mobile Applications']"))
        ); // Sub-menu pada "Apps" sesuai dengan konten yang relevan
        driver.close();
    }

    @Test
    public void BM_TC07() {
        System.setProperty("chromedriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        Duration duration = Duration.ofSeconds(30);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Bahasa Indonesia']"))
        );
        driver.findElement(By.xpath("//img[@alt='Bahasa Indonesia']")).click(); // Klik bendera "Indonesia" pada menu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[normalize-space()='STRIDE TO GLORY']"))
        ); // Bendera "Indonesia" yang diklik berhasil merubah teks bahasa "Inggris" ke bahasa "Indonesia"
        driver.close();
    }

    @Test
    public void BM_TC08() {
        System.setProperty("chromedriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        Duration duration = Duration.ofSeconds(30);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='English']"))
        );
        driver.findElement(By.xpath("//img[@alt='English']")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[normalize-space()='STRIDE TO GLORY']"))
        );
        driver.close();
    }

    @Test
    public void BM_TC09() {
        System.setProperty("chromedriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        Duration duration = Duration.ofSeconds(30);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='English']"))
        );
        driver.findElement(By.xpath("//img[@alt='English']")).click(); // Klik bendera "Inggris" pada menu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[normalize-space()='STRIDE TO GLORY']"))
        ); // Bendera "Inggris" yang diklik berhasil merubah teks bahasa "Indonesia" ke bahasa "Inggris"
        driver.close();
    }

    @Test
    public void BM_TC010() {
        System.setProperty("chromedriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        Duration duration = Duration.ofSeconds(30);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='https://my.borobudurmarathon.com/']//img"))
        );
        driver.findElement(By.xpath("//a[@href='https://my.borobudurmarathon.com/']//img")).click(); // Klik icon "Person" pada menu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("Signin"))
        );
    }
}
