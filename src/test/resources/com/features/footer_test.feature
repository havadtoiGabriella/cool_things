Feature: Footer test

  @footer
  Scenario Outline: Disclaimer footer menu item validation
    When I navigate to the main page
    Then Disclaimer footer menu item "<url>" url should point to the right page
    Examples:
      | url                                    |
      | https://www.coolthings.com/disclaimer/ |

  @footer
  Scenario Outline: Advertise footer menu item validation
    When I navigate to the main page
    Then Advertise footer menu item "<url>" url should point to the right page
    Examples:
      | url                                   |
      | https://www.coolthings.com/advertise/ |

  @footer
  Scenario Outline: Disclosure footer menu item validation
    When I navigate to the main page
    Then Disclosure footer menu item "<url>" url should point to the right page
    Examples:
      | url                                    |
      | https://www.coolthings.com/disclosure/ |

  @footer
  Scenario Outline: Privacy Policy footer menu item validation
    When I navigate to the main page
    Then Privacy Policy footer menu item "<url>" url should point to the right page
    Examples:
      | url                                        |
      | https://www.coolthings.com/privacy-policy/ |

  @footer
  Scenario Outline: Contact footer menu item validation
    When I navigate to the main page
    Then Contact footer menu item "<url>" url should point to the right page
    Examples:
      | url                                 |
      | https://www.coolthings.com/contact/ |

  @footer
  Scenario Outline: About footer menu item validation
    When I navigate to the main page
    Then About footer menu item "<url>" url should point to the right page
    Examples:
      | url                               |
      | https://www.coolthings.com/about/ |

  @footer
  Scenario Outline: To top arrow footer menu item validation
    When I navigate to the main page
    Then the footer menu item 'To top arrow' "<url>" url should point to the main page
    Examples:
      | url                          |
      | https://www.coolthings.com/# |