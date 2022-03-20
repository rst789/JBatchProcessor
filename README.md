# BatchProcessor Requirement
Problem:
-------

You are required to write a program that will simulate a batch processing system for a bank. When run, 
your program should read and process account transaction data from a text file called transactions.txt. 


Your text file will be formatted in the following way:
- The first line of the file is an integer (say n) indicating how many accounts will be involved
- Each of the next n lines will contain:
  - An integer (from 0 – n-1) which is the account number
  - A float indicating the current balance in the account
- The next line will contain an integer (say t) indicating how many transactions are listed in the file
- Each of the next t lines will contain:
  - An integer which is the account number for the transaction
  - A character indicating the type of transaction (this may be a D for deposit, W for withdrawal)
  - A float indicating the amount involved in the transaction


Note that there is always a single space between each bit of data on a line
