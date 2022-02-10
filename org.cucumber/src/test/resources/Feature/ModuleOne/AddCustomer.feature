@addcustomer
Feature: AddCustomer
 
 Background:
 Given the user is in telecome home page 
   And the user clicks on Add Customer

  @tag1
  Scenario Outline: Registration page to Add Customer Page
   
 
   When the user should enter all required details < >, < >, < >  
   And the user clicks submit button
   And the user able to see the displaced customerid
   
   Examples: |FirstName|LastName|email|Address|Comments|
    				|Manivannan|Thamilselvan|t/manier@gmail.com|chennai|add custmer|	
    				|adfad|asdfas|t/manier@gmail.com|chennai|add custmer|	
    				|asdf|asdfasdf|t/manier@gmail.com|chennai|add custmer|	
    				|asdfasd|asdfasd|t/manier@gmail.com|chennai|add custmer|	