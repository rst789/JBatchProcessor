/*  CMS250
 *  Assignment1
 *  Mingrui Yuan
 *  Nicole Ponce
 */

import java.io.*;
import java.util.*;
public class BatchProcessor {

    // Two static data members to share the data
    private static Account[] acctArray;
    private static Scanner scanner;

    public static void main(String[] args) {
        // Using try & catch to avoid errors
        try{
            // File reader
            File f = new File("transactions.txt");
            scanner = new Scanner(f);

            // Scan the first line of the text file, and convert it to int
            String line = scanner.nextLine();
            int accNum = Integer.parseInt(line);

            // accNum is the number of transactions scanned in the first line
            // Call the makeAcctArray function with accNum to declare its size
            makeAcctArray(accNum);

            String line2 = scanner.nextLine();
            int accTrans = Integer.parseInt(line2);

            // accTrans is the number of transactions scanned after the account balances
            // Call the processTransactions function with accTrans to declare its size
            processTransactions(accTrans);

            printAcctData();

        } catch(FileNotFoundException e) {
            System.out.println("Could not open the file requested.");
        }
    }

    // Where the program reads the file and store the elements in the array
    public static void makeAcctArray(int numAccts) {
        acctArray = new Account[numAccts + 1];

        for(int i = 0; i< numAccts; i++) {
            // Read the file and separate each element with space
            // Then store them to the tempArray
            String line = scanner.nextLine();
            String[] tempArray = line.split(" ");

            // parseInt and parseFloat to convert elements read to float and int accordingly
            int accountNumber = Integer.parseInt(tempArray[0]);
            float accountBalance = Float.parseFloat(tempArray[1]);

            Account account = new Account(accountNumber, accountBalance);

            // Store the elements into the array
            acctArray[Integer.parseInt(tempArray[0])] = account;
        }
    }

    public static void processTransactions(int numTrans) {

        for(int i = 0; i < numTrans; i++) {
            String line = scanner.nextLine();
            String[] tempArray = line.split(" ");

            int accountNumber = Integer.parseInt(tempArray[0]);
            char charWOrD = tempArray[1].charAt(0);
            float transactionAmt = Float.parseFloat(tempArray[2]);

            char charW = 87;
            char charD = 68;

            if(charWOrD == (charW)) {
                acctArray[accountNumber].withdraw(transactionAmt);
            } else if(charWOrD == (charD)) {
                acctArray[accountNumber].deposit(transactionAmt);
            } else {
                System.out.println("Error, cannot process transaction.");
            }
        }
    }

    // Print elements in the array
    public static void printAcctData() {
        for(int i = 1; i < acctArray.length; i++) {
            acctArray[i].print();
        }
    }

}
