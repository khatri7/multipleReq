Feature: verification of various requests on local json server
	
  #Scenario: To check size of the user list
    #Given the baseURI is set to "http://localhost:3000/users"
    #When a GET request is made
    #Then verify the size of users list to be 29
    #When a DELETE request is made on path "8"
    #Then verify the status code is 200 and size is 28
#
    #Scenario: update name of user with id 12
    #	Given the baseURI is set to "http://localhost:3000/users"
  #		And name is set as "jojo"
  #		When a PUT request is made on path "12"
  #		Then verify that status code is 200 and name is "jojo"
  		
  #	Scenario Outline: to create multiple users
  #		Given the baseURI is set to "http://localhost:3000/users"
  #		And id is set as <id> and name is set as "<name>"
  #		When POST request is made
  #		Then verify the number of users
  		
  #		Examples:
  #		|	id	|	name	|
  #		|	32	|	rabbit|
  #		|	33	|	gogo	|
  #		|	34	|	gigi	|
  
  #	Scenario Outline: To add admins
  #		Given the baseURI is set to "http://localhost:3000"
  #		And name is set as "<name>" and age is set as <age>
  #		When POST request is made on "admins"
  #		Then verify status code is 201
  #		
  #		Examples:
  #		|	name	| age |
  #		|	Cristiano	|	35	|
  #		|	 Messi	|	32	|
  
  	Scenario: Display names of all admins
  		Given the baseURI is set to "baseURI"
  		When GET request is made on "adminpath"
  		Then verify status code is 200
  		And print names of all admins