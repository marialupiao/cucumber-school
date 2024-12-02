Feature: Hear shout
  Scenario: Listener is within range
    Given Lucy is 15 meters from Sean
    When Sean shouts "free bagels at Sean's"
    Then Lucy hears Sean's message

  Scenario: Listener hears a different mesage
    Given Lucy is 15 meters from Sean
    When Sean shouts "Free coffee!"
    Then Lucy hears Sean's message
