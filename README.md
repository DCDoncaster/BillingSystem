# BillingSystem
Forked from a self built database to create a billing system suitable for a small utility company or similar


## Manipulating User Accounts:
* /user/create - **POST**
  * Provides a new user when provided with the correct details as a JSON Object via POST request
    * email: a string representing the customers email address in full
    * password: a string with a user defined password of up to 45 characters
    * fullname: first and last name of the user 
    * lastreading: Sent as a whole number integer. This will not generate any charges and shoudl be used to generate a base line for any future charges
    * outstandingbalance : Should always be set to 0 unless the customer is being provided an opening credit on their account
    


* /user/read - **GET**
  * Provides a list of all users as a raw database extract - no paramters are required for this request
* /user/read/id - **GET**
  * When provided with the customers unique account number as a whole number integer will provide account information for that customers account only.



* /user/update/id - **PUT**
  * Accepts the below arguments as a PUT request in order to update them in the database. Any arguments not provided will not be adjusted or updated
    * email: a string representing the customers email address in full
    * password: a string with a user defined password of up to 45 characters
    * fullname: first and last name of the user 
    * lastreading: provided as a whole number integer - this will trigger an update of the reading held on the customers file and also update their account balance.
    
    
* /user/delete/id - **DELETE**
  * Accepts customers email as a JSON object and if this matches the one on the file and the customers outstanding balance is equal to or under £5 will delete the customers account permanently.
  * This is non-reversible. 