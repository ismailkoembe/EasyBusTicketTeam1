package com.easybusticket.tests;

import com.easybusticket.utilities.Driver;
import com.easybusticket.utilities.Environments;
import com.easybusticket.utilities.PropManager;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Method;
import java.util.Objects;

/**
 * @author Reyhan
 */
@Slf4j
public class BaseTestAdmin {
    public String env = Environments.STAGE.name;
    public final Integer timeout = Integer.valueOf(Objects.requireNonNull(PropManager.getProperties(env, "timeout")));
    public final SoftAssert softAssert=new SoftAssert();
    public Actions actions=new Actions(Driver.get(env));

    @BeforeMethod(enabled = false)
    public void setupUserContext(Method method) {
        /**
         * BaseTest class is essential part of the framework.
         * In order to switch environment, BaseTest class holds central point.
         */
        log.info("Running tests on: " + env);
    }


    @Parameters({"masterPlan", "planToRun", "username", "apiKey"})
    @AfterSuite(enabled = false)
    public void init(@Optional("masterPlan") String masterPlan,
                     @Optional("planToRun") String planToRun,
                     @Optional("planToRun") String username,
                     @Optional("planToRun") String apiKey) {
        /**
         * Not implemented just for demo purpose for interview
         * When the Jenkins triggers framework or QA person run via terminal or xml file
         * those injected parameters will be initialized.
         * enabled = false because it is not implemented
         * */

    }


    @Parameters({"masterPlan", "planToRun"})
    @AfterSuite(enabled = false)
    public void reportToTestRail(@Optional("masterPlan") String masterPlan,
                                 @Optional("planToRun") String planToRun) {
        /**
         * Not implemented just for demo purpose for interview
         * When all automation is done, the framework can report results in TestRail or
         * some other platform
         * enabled = false because it is not implemented
         * */

    }

    @BeforeMethod
    public void setup(){
        Driver.get(env).get(PropManager.getProperties(env,"AdminUrl"));
        Driver.get(env).manage().window().maximize();
        log.info("Navigating {} environment {}", PropManager.getProperties(env,"AdminUrl"), env);
    }


    @AfterMethod
    public void teardown(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Driver.closeDriver();

    }

}

