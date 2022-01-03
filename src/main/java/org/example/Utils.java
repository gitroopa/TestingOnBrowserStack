package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Utils extends BrowserFactory{
    public void dropDownSelectDate() throws InterruptedException{

        Select date = new Select(driver.findElement(By.name("DateOfBirthDay")));
        date.selectByIndex(1);
        Thread.sleep(20);
        Select month1 = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        month1.selectByIndex(1);
        Thread.sleep(20);

        Select year = new Select(driver.findElement(By.name("DateOfBirthYear")));
        year.selectByIndex(1);



    }

    public void navigate(){

        driver.get("https://demo.nopcommerce.com/");
        String name= driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).getText();
        System.out.println("Hello from utilsPage ");
    }

    public void closeBrowser(){

        driver.close();
    }
}
