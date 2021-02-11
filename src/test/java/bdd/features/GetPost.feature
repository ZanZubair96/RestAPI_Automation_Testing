Feature: Testing the Json Server

  Scenario: Verify the author name of the post
    Given I perform GET operation for "/post"
    When I perform GET from the post number "1"
    Then I should see the author name as "Zan"


  Scenario: Verify the Path parameter of the GET
    Given I perform GET operation for "/post"
    Then I should verify the GET PathParameter instance

  Scenario: Verify the Query parameter of the GET
    Given I perform GET operation for "/post"
    Then I should verify the GET QueryParameter instance