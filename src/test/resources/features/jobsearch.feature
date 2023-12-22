@author_SP @regression
Feature: Job search results functionality
  As a user, I should be able to use job search functionality
  @author_SP @regression
  Scenario Outline: VerifyJobSearchResultUsingDifferentDataSet
    Given I am on Home Page
    When  I enter job title "<jobTitle>"
    And   I enter location "<location>"
    And   I select distance "<distance>"
    Then  I click on moreSearchOptions Link
    And   I enter salaryMin "<salaryMin>"
    And   I enter salaryMax "<salaryMax>"
    And   I select salaryType "<salaryType>"
    And   I select jobType "<jobType>"
    Then  I click on Find Jobs button
    And   I verify the result "<result>"
    Examples:
      | jobTitle            | location        |   distance  | salaryMin | salaryMax | salaryType  | jobType   | result                                      |
      | Tester              | Canary Wharf    |   10 miles  | 30000     | 500000    | Per annum   | Permanent | Permanent Tester jobs in Canary Wharf       |
      | Teacher             | Watford         |   5 miles   | 15000     | 35000     | Per annum   | Temporary | Temporary Teacher jobs in Watford           |
      | Software Tester     | London          |   7 miles   | 35000     | 800000    | Per annum   | Contract  | Contract Software Tester jobs in London     |