package com.masteringselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverThread {
    private WebDriver webDriver;
    private final String operatingSystem = System.getProperty("os.name").toUpperCase();
    private final String systemArchitecture = System.getProperty("os.arch");

    public WebDriver getDriver() throws Exception {
        if (null == webDriver) {
            System.out.println(" ");
            System.out.println("Current Operating System: " + operatingSystem);
            System.out.println("Current Architecture: " + systemArchitecture);
            System.out.println("Current Browser Selection: " + "Chrome");
            System.out.println(" ");
            webDriver = new ChromeDriver(DesiredCapabilities.chrome());
        }

        return webDriver;
    }

    public void quitDriver(){
        if (null != webDriver) {
            webDriver.quit();
            webDriver = null;
        }
    }
}
