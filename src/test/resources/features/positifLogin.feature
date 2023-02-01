
#1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Verify that home page is visible successfully
#4. Click on 'Signup / Login' button
#5. Verify 'Login to your account' is visible
#6. Enter correct email address and password
#7. Click 'login' button
#8. Verify that 'Logged in as username' is visible
#9. Click 'Delete Account' button
#10. Verify that 'ACCOUNT DELETED!' is visible



  #  #6. Enter name and email address
  #  #7. Click 'Signup' button
  #  #8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
  #  #9. Fill details: Title, Name, Email, Password, Date of birth
  #  #10. Select checkbox 'Sign up for our newsletter!'
  #  #11. Select checkbox 'Receive special offers from our partners!'
  #  #12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
  #  #13. Click 'Create Account button'
  #  #14. Verify that 'ACCOUNT CREATED!' is visible
  #  #15. Click 'Continue' button
  #  #16. Verify that 'Logged in as username' is visible
  #  #17. Click 'Delete Account' button
  #  #18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button

  Feature: Login User with correct email and password Test

    @positifTest
    Scenario: The User should login with valid credentials
      Given The user should launch browser and navigate to url "https://automationexercise.com/"
      When Verify that home page is visible successfully
      And The user should click on Signup_Login button
      And Verify "Login to your account" is visible
      And The user should enter correct email address and password
