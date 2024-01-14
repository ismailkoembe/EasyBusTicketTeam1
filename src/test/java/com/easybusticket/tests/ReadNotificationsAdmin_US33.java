package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import com.easybusticket.pages.NotificationsPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class ReadNotificationsAdmin_US33 extends BaseTestAdmin{

    @Test
    public void readNotifications(){

        //The admin can manage the admin dashboard page after successful login.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        log.info("Admin logged in admin dashboars");

        //Clicks the notification button in admin,see the notification text
        adminDashboardPage.clickButtonNotification();

        //Clicks the button view all notification in admin,navigate to page Notifications
        adminDashboardPage.clickViewAllNotification();

        //Clicks the button mark all as read in admin,
        //clicks the notification button again and displays the text "No unread notification found"
        NotificationsPage notificationsPage=new NotificationsPage();
        notificationsPage.clickButtonMarkAllAsRead();

    }
}
