Feature: Register in the Celsia Movilidad app
  As a Celsia Movilidad user I want to register as a new user

  Scenario Outline: Register a new user
    Given the user is in the registration module
    When the user complete the register
      | name   | lastName   | id   | phoneNumber   | city   | adress   | email   | password   | confirmPassword   |
      | <name> | <lastName> | <id> | <phoneNumber> | <city> | <adress> | <email> | <password> | <confirmPassword> |
    Then the user see the message: Bienvenido a la App Celsia Movilidad sostenible

    Examples:
      | name   | lastName  | id         | phoneNumber   | city   | adress        | email           | password | confirmPassword |
      | Stiven | Atehortua | 1020470514 | 3105401234567 | Bogota | calle92 30-12 | stiven7@mail.com | 1234     | 1234            |
