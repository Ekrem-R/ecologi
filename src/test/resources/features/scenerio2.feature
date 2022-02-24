@dynamic
Feature:
  Scenario: Dynamic-routing page testing
    Given user on the dyamic-routine page
    Then  assertion the title
    Then  check the image is visible
    Then  assert there is a date,author's name and picture are visible
    Then  assert "Statically Generated with Next.js." text
    Then  check the read documention link is clickable




