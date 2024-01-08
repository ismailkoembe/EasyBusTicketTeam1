package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import com.easybusticket.utilities.Environments;
import com.easybusticket.utilities.PropManager;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

/**
 * @author Ismail Koembe
 */
public abstract class BasePage {

    public static final String env = Environments.PRODUCTION.name();
    public static final WebDriver driver = Driver.get(env);
    public static final Wait<WebDriver> wait = new FluentWait<>(driver)
            .withTimeout(Duration.ofMillis(Long.parseLong(PropManager.getProperties(env,"duration"))))
            .pollingEvery(Duration.ofMillis(1000))
            .ignoring(NoSuchElementException.class);
}
