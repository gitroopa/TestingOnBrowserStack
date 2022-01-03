package org.example;

import org.testng.annotations.Test;

import java.net.MalformedURLException;

import static org.example.BrowserFactory.createDriverInstance;

public class ToExecuteOnBrowserStack {
    Utils utils = new Utils();
    RegistrationPage registerPage = new RegistrationPage();
    @Test
    public void registerFromBrowserStack() throws MalformedURLException, InterruptedException {
        createDriverInstance();
        utils.navigate();
        registerPage.registration();
        System.out.println("Hey GOt this Browser stack");
        System.out.println("Hey GOt this for Browser stack");
    }
}