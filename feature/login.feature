Feature: login


    Scenario: login details of orangehd
        Given user launch browser
        When user enter url "https://opensource-demo.orangehrmlive.com/"
        And user enter email id "Admin" and  password "admin123"
        And user click on login
        Then user verify login
        And close browser

