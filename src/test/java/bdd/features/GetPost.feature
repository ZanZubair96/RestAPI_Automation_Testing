Feature: Verify different GET operations using REST-assured

  Scenario: Verify one author of the post
    Given I perform GET operation for "/post"
    When I perform GET from the post number "2"
    Then I should see the author name as "Zan"

  Scenario: Verify collection of authors of the post
    Given I perform GET operation for "/post"
    Then I should see the author names

  Scenario: Verify PathParameter of the GET
    Given I perform GET operation for "/post"
    Then I should verify the GET PathParameter instance

  Scenario: Verify QueryParameter of the GET
    Given I perform GET operation for "/post"
    Then I should verify the GET QueryParameter instance