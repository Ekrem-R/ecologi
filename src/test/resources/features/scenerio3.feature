@helloworld
  Feature:
    Scenario: HelloWorld page testing
      Given user on the "hello-world" page
      Then  assertion the page title
      Then  check the image is visible on the page
      Then  assert there is a date,author's name and picture are visible on the page
      Then  assert "Statically Generated with Next.js." text on the page
      Then  check the read documention link is clickable on the page