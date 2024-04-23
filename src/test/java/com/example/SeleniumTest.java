package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.example.com");

        // Perform browser interactions
        // For example, find elements, click buttons, input text, etc.

        // Print the title of the webpage
        System.out.println("Page title is: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}
