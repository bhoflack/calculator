Feature: calculator

    Scenario: Sum of 2 numbers
      Given a calculator
      When i sum the number 5 and 4
      Then the result is 9

    Scenario Outline: Multiply two numbers
      Given a calculator
      When i multiply the number <number1> and <number2>
      Then the result is <result>

      Examples:
      | number1 | number2 | result |
      | 1       | 1       | 1      |
      | 1       | 20      | 20     |
      | -10     | 100     | -1000  |
      | 100     | 10      | 1000   |
