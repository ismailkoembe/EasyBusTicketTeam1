package com.easybusticket.tests;

import com.easybusticket.utilities.ANSIColors;
import com.easybusticket.utilities.Driver;
import com.easybusticket.utilities.Environments;
import com.easybusticket.utilities.PropManager;
import com.google.common.base.Throwables;
import io.qameta.allure.Attachment;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;
import java.util.Random;

@Slf4j
public class BaseTest {
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
        Driver.get(env).get(PropManager.getProperties(env,"url"));
        Driver.get(env).manage().window().maximize();
        log.info("Navigating {} environment {}", PropManager.getProperties(env,"url"), env);
    }


    @AfterMethod (alwaysRun = true)
    public void afterTest(ITestResult result){
        switch (result.getStatus()) {
            case ITestResult.SUCCESS:
                log.info(ANSIColors.ANSI_GREEN);
                log.info("----------------TEST PASSED----------------");
                log.info("-------------------------------------------" + ANSIColors.ANSI_RESET);
                break;
            case ITestResult.FAILURE:
                log.info(ANSIColors.ANSI_RED);
                log.info("----------------TEST FAILED----------------");
                log.info("-------------------------------------------");
                log.info("--------------Test fail cause--------------");
                log.info("-------------------------------------------");
                log.error(Throwables.getStackTraceAsString(result.getThrowable()));
                log.info("-------------------------------------------" + ANSIColors.ANSI_RESET);

                getBrowserLogs();
                makeScreenshotOnFailure();
                break;
            case ITestResult.SKIP:
                log.info(ANSIColors.ANSI_YELLOW);
                log.info("----------------TEST SKIPPED---------------");
                log.info("-------------------------------------------");
                log.info("--------------Test skip cause--------------");
                if (result.getThrowable() != null) {
                    log.error(Throwables.getStackTraceAsString(result.getThrowable()));
                }
                log.info("-------------------------------------------" + ANSIColors.ANSI_RESET);
                break;
            default:
                log.info("--------------Test has not result---------------");
        }
        tearDownSession();
        log.info(String.format("\n----------------Test %s finished--------------\n", result.getMethod().getMethodName()));
    }

    private void getBrowserLogs() {
        log.info(ANSIColors.ANSI_PURPLE);
        log.info("----------------BROWSER LOGS---------------");
        List<LogEntry> logEntries;
        try {
            logEntries = Driver.get(env).manage().logs().get(LogType.BROWSER).getAll();
            for (LogEntry logEnt : logEntries) {
                log.info("[" + logEnt.getLevel() + "] " + logEnt.getMessage());
            }
        } catch (Exception ignored) {
            log.info("Couldn't get any browser logs");
        }

        log.info("-------------------------------------------" + ANSIColors.ANSI_RESET);
    }


    private void tearDownSession() {
        Driver.closeDriver();
    }

    @Attachment("Screenshot on failure")
    public byte[] makeScreenshotOnFailure() {
        return ((TakesScreenshot) Driver.get(env)).getScreenshotAs(OutputType.BYTES);
    }


}
