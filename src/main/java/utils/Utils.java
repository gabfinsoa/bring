package utils;

import com.google.gson.Gson;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Utils {
    public WebDriver driver;
    public FluentWait fluentWaitElement;

    public Utils(WebDriver driver) {
        this.driver = driver;
        this.fluentWaitElement = new FluentWait(driver).withTimeout(java.time.Duration.ofSeconds(6))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class, StaleElementReferenceException.class)
                .ignoring(TimeoutException.class);
    }

    public static String getBrand() {
        String brand = "";
        if (System.getProperty("brand") == null){
            System.out.println("Empresa não adicionada: Ex.: -Dcompany=Bring ");
        }else{
            brand = System.getProperty("brand");
        }
        return brand;
    }

    public static String getMode() {
        String mode = "";
        if (System.getProperty("mode") == null) {
            System.out.println("Mode não adicionado: Ex.: -Dmode=Web ");
        } else {
            mode = System.getProperty("mode");
        }
        return mode;
    }

    public static String getEnv() {
        String env = "";
        if (System.getProperty("env") == null){
            System.out.println("Env não adicionada: Ex.: -Denv=hml ");
        }else{
            env = System.getProperty("env");
        }
        return env;
    }

    public static String getBaseUrl() {
        StringBuilder fileName = new StringBuilder();
        fileName.append("src/test/resources/baseUrl.json");
        String jsonBaseUrl = "";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName.toString()))) {
            Gson gson = new Gson();
            Map<String, Object> element = gson.fromJson(bufferedReader, Map.class);
            jsonBaseUrl = ((Map<String, String>)((Map<String, Object>)element.get(getBrand())).get(getEnv())).get("url");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonBaseUrl;
    }

    public static String webdriverLocation() {
        return "src\\driver\\chromedriver.exe";
    }


    public boolean waitElementPolling(WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.pollingEvery(1, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        return true;
    }

    public void waitElement(WebElement element){
        fluentWaitElement.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickElement(WebElement element){
        waitElement(element);
        element.click();
    }

    public void submitElement(WebElement element){
        waitElement(element);
        element.submit();
    }

    public void clearElement(WebElement element){
        waitElement(element);
        element.clear();
    }

    public void sendKeysElement(WebElement element, String texto){
        waitElement(element);
        element.sendKeys(texto);
    }

    public void sleep(WebElement element) throws InterruptedException {
        Thread.sleep(2000);
    }

    public String getText(WebElement element){
        waitElement(element);
        String getTextReturn = element.getText();
        return getTextReturn;
    }

    public String getAttribute(WebElement element, String atributo){
        waitElement(element);
        String getAttributeReturn = element.getAttribute(atributo);
        return getAttributeReturn;
    }
}
