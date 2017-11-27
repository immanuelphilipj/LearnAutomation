package com.rism.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.rism.runner.Hooks;

public class Common {

	public static WebDriver getDriver(String browser) {
		WebDriver driver = null;
		if (browser.equalsIgnoreCase("Firefox")) {

			// TBD include Gecko driver code for FireFox driver

		} else if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", Hooks.driverPath);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}

		return driver;
	}

	public static Properties readConfig(String filename) {

		try {
			System.out.println(new File(filename).getAbsolutePath());
			FileReader reader = new FileReader(filename);
			Properties p = new Properties();
			p.load(reader);
			return p;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void selectDropdown(WebDriver driver, String dropdownId, String optionText) {
		List<WebElement> dropdown;
		dropdown = driver.findElements(By.xpath(dropdownId));
		for (WebElement option : dropdown) {
			String text = option.getText();
			if (optionText.equals(text)) {
				String id = option.getAttribute("id");
				WebElement dropdownValue = driver.findElement(By.xpath("//*[@id='" + id + "']"));
				dropdownValue.click();
				break;
			}
		}
	}

	public static void selectAjaxDropdown(WebDriver driver, String dropdownContainerId, String optionText) {
		List<WebElement> dropdown;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		int index = 0;
		dropdown = driver.findElements(By.xpath("//*[@id='" + dropdownContainerId + "']/select/option"));
		for (WebElement option : dropdown) {
			String text = option.getText();
			index++;
			if (optionText.equals(text)) {
				break;
			}
		}

		js.executeScript("return $('#productType select')[0].selectedIndex = " + index + ";");
		js.executeScript("return $('#productType input').val('" + optionText + "')");
		// js.executeScript("return $('#productType select').sbCustomSelect()");
	}
}
