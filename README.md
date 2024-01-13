# Assignment 6 - Inheritance
In this assignment, you will write a program to manage bank accounts. There are three types of accounts: savings accounts, checking accounts, and an investment account.

Each account has the following properties in common:
 - Account Number
 - Account Holder Name
 - Account Balance

In addition to these properties, each account type has its own unique characteristics:
 - Savings Accounts: have a minimum balance requirement and an interest rate
 - Checking Accounts: have a minimum balance requirement and a monthly maintenance fee
 - Investment Accounts: have a minimum investment amount and a rate of return

An application class has been provided for you which instantiates one of each account type then iterates over them printing an account summary.  Your job is to implement all the supporting classes to make it work.

## Assignment Submission
You will submit your assignment using GitHub Classroom.  When you are finished and want to make your final submission, use the checkin comment "FINAL SUBMISSION":

        git add .
        git commit -m "FINAL SUBMISSION"
        git push origin main

Any submission not having this comment will be assumed to be a work-in-progress and therefore will be ignored.  This implies that you must make your final push with this commit comment before the deadline.


## Implementation Details
 - Create an `Account` class with the Account Number, Account Holder Name and Account Balance properties. The Account class will also be responsible for printing the portion of the account summary containing those values (the `displayAccountDetails()` method).
      - All these classes must live in a package called `account`
 - Create three subclasses of `Account`: `SavingsAccount`, `CheckingAccount`, and `InvestmentAccount`. These subclasses should inherit the properties of the `Account` class and also have their own unique properties.
 - Override the `displayAccountDetails()` in each child class to display the properties of the account.  This method should print the specific portion of the account summary and should call the overridden parent class's method to print the general portion of the account summary.
 - The `AccountManager` class must be completed.  I provides a set of methods that instantiate each account type and return them as `Account` object references.

## Input
None.  All input for this program is hardcoded in the Application class.

## Output
Your program must require the user to enter a valid account number before continuing.  The valid accounts are those that are loaded into the `ArrayList` in `main()`.  If an invalid account number is provided, the program can exit without printing an error message.

Note: Your output should match the scenarios below exactly to receive full credit.  You should use the `String.format()` function to accomplish the correct spacing.

	>$ java Main
	You must provide an account number

	>$ java Main 10001
	Savings Account Details
	================================
	Account Number:            10001
	Account Holder:         John Doe
	Account Balance:       $7,500.00
	Minimum Balance:          $10.00
	Interest Rate:              4.5%

	>$ java Main 10002
	Checking Account Details
	================================
	Account Number:            10002
	Account Holder:         Jane Doe
	Account Balance:      $10,000.00
	Minimum Balance:          $10.00
	Monthly Maintenance Fee:   $0.00

	>$ java Main 10003
	Investment Account Details
	================================
	Account Number:            10003
	Account Holder:          Jim Doe
	Account Balance:     $230,000.00
	Min Investment:        $5,000.00
	Investment Duration:       5 yrs
	Interest Rate:              7.5%

	>$ java Main 10004
	Checking Account Details
	================================
	Account Number:            10004
	Account Holder:        James Doe
	Account Balance:       $1,700.00
	Minimum Balance:          $10.00
	Monthly Maintenance Fee:  $25.00
