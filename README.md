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
    * phonenumber: Should be provided as a String


* /user/read - **GET**
  * Provides a list of all users as a raw database extract - no parameters are required for this request
* /user/read/id - **GET**
  * When provided with the customers unique account number as a whole number integer will provide account information for that customers account only.

  
* /user/update/id - **PUT**
  * Accepts the below arguments as a PUT request in order to update them in the database. Any arguments not provided will not be adjusted or updated
    * email: a string representing the customers email address in full
    * password: a string with a user defined password of up to 45 characters
    * fullname: first and last name of the user 
    * phonenumber: provided as a string
    * lastreading: provided as a whole number integer - this will trigger an update of the reading held on the customers file and also update their account balance.The customer will also receive a text message if we hold a number on file for them to confirm their up to date balance
      * If a reading is provided this will also updated into the readings table with todays date and the customers account number
      * When a new balance is calculated the customer will also be sent a notification of their new balance by SMS Text Message provided that a valid mobile number exists in their account.
    
    
* /user/delete/id - **DELETE**
  * Accepts customers email as a JSON object and if this matches the one on the file and the customers outstanding balance is equal to or under £5 will delete the customers account permanently.
  * This is non-reversible.




* ## Manipulating User Accounts:
* /readings/submit - **POST**
  * Now Depreceated and not to be used as this functionality is provided through the /user/put method instead.
  * Left in place in case of need to manually add a reading between two other readings, this should be used with extreme of caution as will not generate any billing information.


* /readings/checkusage/{accountnumber} - **GET**
  * This will search for a user by their account number and locate all readings that they have provided including the date of the reading and it's value.


* /readings/checkusageondate/{date} - **GET**
  * Usable to search by date (dates to be provided in YYYY-MM-DD format) - This will retrieve any readings submitted by any user ont hat date.
  