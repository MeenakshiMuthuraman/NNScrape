Background:
 Given the user is on the NumpyNinja page

  Scenario: Extract Blog Titles
    Given the user clicks on blog
    When the user extracted titles
    Then the user writes the title in file