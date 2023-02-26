@github
Feature: Github

  Scenario: add_multiple_collaboration
    Given user goes to "https://www.github.com/"
    And  user login github
    And  user goes to "Deneme001" repositorie
    And user goes to collaborators

  Scenario Outline: add_"<email>"_as_collaboration
    And user adds "<email>" to repositorie
    Examples:
      | email |
      | abc1@gmail.com |
      | abc2@gmail.com |
      | abc3@gmail.com |
      | abc4@gmail.com |
      | abc5@gmail.com |




