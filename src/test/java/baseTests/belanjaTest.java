package baseTests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class belanjaTest {

    @Test
    public void splitPayment() {
        System.setProperty("chromedriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" "); //untuk Menuju halaman website atau URL yang di inginkan
        Duration duration = Duration.ofSeconds(10); //Waktu untuk melakukan Test Automation
        WebDriverWait wait = new WebDriverWait(driver, duration);
        // Kasir menginformasikan total tagihan kepada pelanggan
        wait.until(ExpectedConditions.elementToBeClickable(By.name("splitPaymentCheckbox"))
        );
        double totalAmount = 300000;
        System.out.println("Total Pembayaran" + totalAmount);

        // Pelanggan meminta split payment 40% tunai dan 60%
        WebElement splitPaymentButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("splitPayment"))
        );
        splitPaymentButton.click();
        System.out.println("Fungsi split payment aktif");

        double cashAmount = totalAmount * 0.40;
        double qrisAmount = totalAmount * 0.60;

        //  Kasir memproses pembayaran 40% secara tunai
        WebElement cashInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("cashAmountInput"))
        );
        cashInput.clear();
        cashInput.sendKeys(String.valueOf(cashAmount));
        System.out.println("Nominal tunai (40%) diisi: Rp " + cashAmount);

        // Lalu kasir memproses pembayaran 60% secara QRIS Pelanggan memindai QRIS dan menyelesaikan pembayaran
        WebElement qrisInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("qrisAmountInput")));
        qrisInput.clear();
        qrisInput.sendKeys(String.valueOf(qrisAmount));
        //  Sistem pembayaran memproses kedua pembayaran tersebut dan berhasil
        WebElement displayedTotal = driver.findElement(By.id("finalTotalAmount"));
        String displayedText = displayedTotal.getText().replaceAll("[^0-9.]", "");
        double finalTotal = Double.parseDouble(displayedText);

        // Sistem mencetak struk dengan rincian pembayaran.
        if (finalTotal == totalAmount) {
            System.out.println("Verifikasi berhasil: Jumlah total pembayaran sudah benar.");
        } else {
            System.out.println("Verifikasi Gagal: Jumlah total tidak sesuai. Harusnya " + totalAmount + ", tapi tertera " + finalTotal);
        }

        WebElement completePaymentButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("completePaymentButton")));
        completePaymentButton.click();
        System.out.println("Tombol 'Selesaikan Pembayaran' diklik.");

        driver.quit();
    }

    @Test
    public void diskonBelanja() {
        System.setProperty("chromedriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" "); //untuk Menuju halaman website atau URL yang di inginkan
        Duration duration = Duration.ofSeconds(10); //Waktu untuk melakukan Test Automation
        WebDriverWait wait = new WebDriverWait(driver, duration);

        double hargaProduk1 = 80000.0;
        double hargaProduk2 = 60000.0;
        double diskonPersen = 10.0; // Diskon 10%

        WebElement produk1Button = wait.until(ExpectedConditions.elementToBeClickable(By.id("produk1_add_to_cart")));
        produk1Button.click();
        System.out.println("Produk 1 (Rp " + hargaProduk1 + ") ditambahkan ke keranjang.");

        WebElement produk2Button = wait.until(ExpectedConditions.elementToBeClickable(By.id("produk2_add_to_cart")));
        produk2Button.click();
        System.out.println("Produk 2 (Rp " + hargaProduk2 + ") ditambahkan ke keranjang.");


        WebElement cartIcon = wait.until(ExpectedConditions.elementToBeClickable(By.id("cart_icon")));
        cartIcon.click();
        System.out.println("Navigasi ke halaman keranjang belanja.");

        wait.until(ExpectedConditions.urlContains("/cart"));


        double subtotal = hargaProduk1 + hargaProduk2;
        System.out.println("Subtotal (sebelum diskon): Rp " + subtotal);


        double diskonNominal = (subtotal * diskonPersen) / 100;
        double totalSetelahDiskonDiharapkan = subtotal - diskonNominal;

        WebElement diskonElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("diskon_nominal")));
        String diskonTeks = diskonElement.getText().replaceAll("[^0-9.]", "");
        double diskonYangTampil = Double.parseDouble(diskonTeks);

        if (Math.abs(diskonYangTampil - diskonNominal) < 0.01) {
            System.out.println("Verifikasi Berhasil: Diskon yang diterapkan sudah benar (" + diskonNominal + ").");
        } else {
            System.out.println("Verifikasi Gagal: Diskon yang ditampilkan tidak sesuai. Harusnya " + diskonNominal + ", tapi tertera " + diskonYangTampil);
        }

        WebElement totalHargaElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("total_setelah_diskon")));
        String totalHargaTeks = totalHargaElement.getText().replaceAll("[^0-9.]", "");
        double totalHargaYangTampil = Double.parseDouble(totalHargaTeks);

        if (Math.abs(totalHargaYangTampil - totalSetelahDiskonDiharapkan) < 0.01) {
            System.out.println("Verifikasi Berhasil: Total harga setelah diskon sudah benar (" + totalSetelahDiskonDiharapkan + ").");
        } else {
            System.out.println("Verifikasi Gagal: Total harga yang ditampilkan tidak sesuai. Harusnya " + totalSetelahDiskonDiharapkan + ", tapi tertera " + totalHargaYangTampil);
        }


        WebElement checkoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("checkout_button")));
        checkoutButton.click();
        System.out.println("Lanjut ke proses checkout.");

    }
}

