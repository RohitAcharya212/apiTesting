@ci @dev
Feature: This feature covers the happy path scenarios for the Bitcoin rates validation

  Scenario Outline: A Valid GET request: is sent to the coinbase API - status code 200 returned - non null rates returned in GBP, USD and EUR
    Given a GET request is made to the coinbase api
    Then a HTTP status code 200 is returned
    And the response content type should be "application/json"
    And the currency should be Bitcoin
    And the rates for currency "<Currency>" are not null

    Examples:
      | Currency |
      | GBP      |
      | USD      |
      | EUR      |
