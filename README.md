# EasyBusTicketTeam1


# Run single test from terminal
mvn clean test -Dtest=com.easybusticket.tests.<TestName>
Example: mvn clean test -Dtest=com.easybusticket.tests.US05_AboutPageTest

# Run single test suit
mvn clean test -DsuiteXmlFile=<name.xml>
Example:mvn clean test -DsuiteXmlFile=sanityTest.xml



# Allure Reports
https://docs.qameta.io/allure/
[MAC OS]brew install allure
[Linux]sudo apt-add-repository ppa:qameta/allure
sudo apt-get update
sudo apt-get install allure
[Windows]scoop install allure
allure serve [PATH]/allure-results

# Produce Allure Report
mvn allure:report
mvn allure:serve






