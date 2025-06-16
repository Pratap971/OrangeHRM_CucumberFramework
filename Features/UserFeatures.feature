Feature:UserFeature
@sanity
Scenario: User  details added
  Given User Launch Chrome browser 
	When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" 
	And  User enters Email as "Admin" and Password as "admin123" 
	And  Click on Login 
	When User click on PIM
	And  User click on Add Employee
	And  User click on Save
##	Then User get Employee list"Personal Details"
	And  User click on profile
	And  User click on Logout
	Then close browser
 