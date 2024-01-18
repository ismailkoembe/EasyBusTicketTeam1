package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import com.easybusticket.pages.NotificationsPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class US33_ReadNotificationsAdmin extends BaseTestAdmin{

    @Test
    @Severity(value = SeverityLevel.MINOR)
    @Description("Clicks button notification and button View All Notification.Navigate to page Notification and clicks button Mark All as Read")
    public void readNotifications(){

        //The admin can manage the admin dashboard page after successful login.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        log.info("Admin logged in admin dashboars");

        //Clicks the notification button in admin,see the notification text
        adminDashboardPage.clickButtonNotification();
        log.info("Clicked button notification,I expect title Notification");

        //Clicks the button view all notification in admin,navigate to page Notifications
        adminDashboardPage.clickViewAllNotification();
        log.info("Clicked button View All Notification,navigate to page Notification");

        //Clicks the button mark all as read in admin,
        //clicks the notification button again and displays the text "No unread notification found"
        NotificationsPage notificationsPage=new NotificationsPage();
        notificationsPage.clickButtonMarkAllAsRead();
        log.info("Clicked the button Mark All as Read in admin");

    }
}
