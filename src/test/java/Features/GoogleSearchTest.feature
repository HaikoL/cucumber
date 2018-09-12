@cucumber @search

Feature: Google Search
  1. in order to find hec-Hompage via google search
  2. as
  3. I want to type the string hec and click on search

  Scenario: Search "HEC" via Google Search
    Given I opened Google Search Page
    When I type "HEC" in the Search String textfield
    And click on the Submit-Button
    Then I should see "HEC | IT-Engineering | - Bremen" as the first entry

