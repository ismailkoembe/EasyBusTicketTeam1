package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import com.easybusticket.pages.AllRequestsPage;
import org.testng.annotations.Test;


public class SupportRequests_US28 extends BaseTestAdmin {

    @Test
    public void SupportRequests() {

        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        adminDashboardPage.supportRequests();
    }

    @Test
    public void allRequests() {
        SupportRequests();

        AllRequestsPage allRequestsPage = new AllRequestsPage();
        allRequestsPage.allRequests();
    }

   /* @Test
    public void deleteReplyTest() {

        SupportRequests();
        AllRequestsPage allRequestsPage = new AllRequestsPage();
        allRequestsPage.deleteReply();
    }*/


    @Test

    public void replyRequests() {

        SupportRequests();
        AllRequestsPage allRequestsPage = new AllRequestsPage();
        allRequestsPage.replyRequests();

    }
}