@preview
Feature:
  Scenario: Preview page testing
    Given user on the "preview" page url
    Then  assertion the preview page title
    Then  check the image is visible on the  preview page
    Then  assert there is a date,author's name and picture are visible on the preview page
    Then  assert "Statically Generated with Next.js." text on the preview page
    Then  check the read documentation link is clickable on the preview page