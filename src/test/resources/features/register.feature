Feature: Register User Test
  # Launch browser
  #2. Navigate to url 'http://automationexercise.com'
  #3. Verify that home page is visible successfully
  #4. Click on 'Signup / Login' button
  #5. Verify 'New User Signup!' is visible
  #6. Enter name and email address
  #7. Click 'Signup' button
  #8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
  #9. Fill details: Title, Name, Email, Password, Date of birth
  #10. Select checkbox 'Sign up for our newsletter!'
  #11. Select checkbox 'Receive special offers from our partners!'
  #12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
  #13. Click 'Create Account button'
  #14. Verify that 'ACCOUNT CREATED!' is visible
  #15. Click 'Continue' button
  #16. Verify that 'Logged in as username' is visible
  #17. Click 'Delete Account' button
  #18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button

  @wip
  Scenario: Register User and take information
    Given The user should launch browser and navigate to url "https://automationexercise.com/"
    When Verify that home page is visible successfully
    And The user should click on Signup_Login button
    And Verify "New User Signup!" is visible
    And The user should enter name and email address
    And Verify that "ENTER ACCOUNT INFORMATION" is visible
    And The user should fill details: Title, Name, Email, Password, Date of birth
    And The user should select checkboxes
    And The user should fill addres information details
    And The user should click Create Account button
    And The user Verify that "ACCOUNT CREATED!" is visible
    And The user should click Continue button
    And The user should verify that "Apocan" is visible
    And The user should click Delete Account button
    Then Verify that "ACCOUNT DELETED!" is visible and click Continue button


