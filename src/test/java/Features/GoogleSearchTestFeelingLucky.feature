Feature: Lucky Google Search
  1. in order to find different Hompages via I'm Feeeling Locky google search
  2. as
  3. I want to

  Scenario Outline: I'm Feeling Lucky Google Search
    Given I opened Google Search Page
    When I type <searchstring> in the Search String textfield
    And click on the I'm feeling Lucky-Button
    Then my URL should be <goal>

    Examples:
      | searchstring | goal               |
      | HEC          | www.hec.de         |
      | neusta       | www.team-neusta.de |