#Feature: Header test
#
#  @logo
#  Scenario: Checking page logo
#    When I navigate to the main page
#    Then the page logo should be visible
#
#  @navbar
#  Scenario Outline: Shop navbar menu item validation
#    When I navigate to the main page
#    Then  Shop navbar menu item "<url>" url should point to the right page
#    Examples:
#      | url                          |
#      | https://shop.coolthings.com/ |
#
#  @navbar
#  Scenario Outline: Gadgets navbar menu item validation
#    When I navigate to the main page
#    Then Gadgets navbar menu item "<url>" url should point to the right page
#    Examples:
#      | url                                 |
#      | https://www.coolthings.com/gadgets/ |
#
#  @navbar
#  Scenario Outline: Gifts navbar menu item validation
#    When I navigate to the main page
#    Then Gifts navbar menu item "<url>" url should point to the right page
#    Examples:
#      | url                                        |
#      | https://www.coolthings.com/tag/cool-gifts/ |
#
#  @navbar
#  Scenario Outline: Gear navbar menu item validation
#    When I navigate to the main page
#    Then Gear navbar menu item "<url>" url should point to the right page
#    Examples:
#      | url                              |
#      | https://www.coolthings.com/gear/ |
#
#  @navbar
#  Scenario Outline: Toys navbar menu item validation
#    When I navigate to the main page
#    Then Toys navbar menu item "<url>" url should point to the right page
#    Examples:
#      | url                                       |
#      | https://www.coolthings.com/tag/cool-toys/ |
#
#  @navbar
#  Scenario Outline: Inventions navbar menu item validation
#    When I navigate to the main page
#    Then Inventions navbar menu item "<url>" url should point to the right page
#    Examples:
#      | url                                             |
#      | https://www.coolthings.com/tag/cool-inventions/ |
#
#  @navbar
#  Scenario Outline: Style navbar menu item validation
#    When I navigate to the main page
#    Then Style navbar menu item "<url>" url should point to the right page
#    Examples:
#      | url                               |
#      | https://www.coolthings.com/style/ |
#
#  @navbar
#  Scenario Outline: House navbar menu item validation
#    When I navigate to the main page
#    Then House navbar menu item "<url>" url should point to the right page
#    Examples:
#      | url                               |
#      | https://www.coolthings.com/house/ |
#
#  @navbar
#  Scenario Outline:  Rides navbar menu item validation
#    When I navigate to the main page
#    Then Rides navbar menu item "<url>" url should point to the right page
#    Examples:
#      | url                                  |
#      | https://www.coolthings.com/vehicles/ |
#
#  @navbar
#  Scenario Outline: Clad navbar menu item validation
#    When I navigate to the main page
#    Then Clad navbar menu item "<url>" url should point to the right page
#    Examples:
#      | url                   |
#      | https://www.clad.com/ |
#
#  @social
#  Scenario: Social section validation
#    When I navigate to the main page
#    Then the social section should be displayed as expected
#
#  @search
#  Scenario: Search button validation
#    When I navigate to the main page
#    Then Search button should be displayed
