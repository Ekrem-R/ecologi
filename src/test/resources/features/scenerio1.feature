@next
Feature: Testing next.js_blog_starter
  Scenario: Images should be visible and clickable on the home page
    Then image1 should be visible and clickable
    Then image2 should be visible and clickable
    Then image3 should be visible and clickable

  Scenario: Asserting the Blog text and link's texts
    Then assert Blog. texts
    Then assert Dynamic links' text visible and clickable
    Then assert LearnHowToPrerender links' text visible and clickable
    Then assert PreviewMode link's text visible and clcikable

  Scenario: Assertion of Github link
    Then github link should be clickable
    Then user should be able to navigate to github link on home page