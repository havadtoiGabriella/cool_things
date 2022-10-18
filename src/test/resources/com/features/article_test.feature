Feature: Article test

  @article
  Scenario Outline: Opening <nth> article
    Given I navigate to the main page
    When I click on the <nth> article
    Then I should be redirected to the article's landing page
    Examples:
      | nth |
      | 2   |
      | 5   |
      | 13  |