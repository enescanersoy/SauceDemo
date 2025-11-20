@SauceDemo
  Feature: SauceDemo Check Test Cases

    @AllEmpty
    Scenario Outline: Empty Username & Empty Password
      Given User at login page
      When  Click login button
      Then  Check "<error>" message about username
      Examples:
      |error               |
      |Username is required|

    @EmptyPassword
    Scenario Outline: Empty Password
      Given User at login page
      When Entered "<username>" for username field
      When Click login button
      Then Check "<error>" message about password
      Examples:
      |username|error|
      |abcdef |Password is required|

      @EmptyUsername
      Scenario Outline: Empty Username
        Given User at login page
        When Entered "<password>" for password field
        When Click login button
        Then Check "<error>" message about username
        Examples:
        |password |error               |
        |123123   |Username is required|

        @FalseLoginPw
        Scenario Outline: Correct Username and Wrong Password
          Given User at login page
          When write Correct "<username>" for username field
          When write Wrong "<password>" for password field
          When Click login button
          Then Check "<error>" message about pw don't match
          Examples:
          |username     |password   |error                                                      |
          |standard_user|123123     |Username and password do not match any user in this service|

          @FalseLoginUsername
          Scenario Outline: Correct Password and Wrong Username
            Given User at login page
            When write Wrong "<username>" for username field
            When write Correct "<password>" for password field
            When Click login button
            Then Check "<error>" message about username don't match
            Examples:
            |username            |password            |error                                                           |
            |enescanersoy        |secret_sauce        |Username and password do not match any user in this service     |

    @CorrectLogin
    Scenario Outline: Correct Password and Correct Username
      Given User at login page
      When write Correct "<username>" for username field
      When write Correct "<password>" for password field
      When Click login button
      Then Go to Product Page
      Examples:
        |username            |password
        |standard_user       |secret_sauce
