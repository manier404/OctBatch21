@executeall
Feature: Login page
@testcase1
   #Given i want to launch browser
       #When I enter <username> in user textBox
       #When I enter <username> and <password> in user textBox
       #And I enter <password> in pass textBox
       #Then enter Submit button
       
Scenario: Tc001
      Given i want to launch browser
       When I enter <username> in user textBox
       When I enter <username> and <password> in user textBox
       And I enter <password> in pass textBox
       Then enter Submit button
       
Given broser with username and password

@testcase2
Scenario Outline: 
      Given i want to launch browser
       When I enter <username> in user textBox
       And I enter <password> in pass textBox
       Then enter Submit button
       Then enter Submit button
       
      Examples: |username|password|
      					|Mani|bossdfasd|
      					|boss|bossdfasd|
      					|Mani|bossdfasd|
      					|boss|bossdfasd|
      					|Mani|bossdfasd|
      					|boss|bossdfasd|
      									
      