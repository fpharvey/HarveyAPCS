import java.util.Scanner;

public class loancalculator{
    public static int mode = -1;
    public static double loanAmt = -1;
    public static int loanTerm = -1;
    public static double interestRate = -1;
    public static double interest = 0;
    public static double ttlAmountpaid =-1;
    public static int monthsremaining =-1;
    public static void main(String[] args) {
        //Read in the loan calculation mode
        Scanner scan;
        while(true) { //Loop the mode selection menu until a valid input is provided
            scan = new Scanner(System.in);
            printModeStatement(); //Call a function to print our mode selection statement
            if(scan.hasNextInt()) { //Check if input provided is a valid integer
                mode = scan.nextInt();
                if(0 < mode && mode < 4) { //Check if input provided is 1, 2, or 3
                    break; //Valid input has been provided. Break out of the while loop
                }
            }
            //If it reaches here, the input was invalid. Loop again.
        }
        System.out.println("You selected mode " + mode);

        if(mode == 1) {
            flatInterest();
        }
        else if(mode == 2){
            compoundinterestwithoutpayments(); //Replace this with calls to your appropriate functions            
        }
        else
        compoundinterestwithpayments();
    }

    public static void flatInterest() {
        //System.out.println("Still a stub function. Not yet implemented"); //Delete this once you implement the function
        //Calculate flat interest and print it out here
        while(true){
        System.out.print( "enter a valid loan amount: ");
        Scanner scan;
        scan = new Scanner(System.in);
        if(scan.hasNextDouble()){
            loanAmt = scan.nextDouble();
            if(loanAmt >= 0) { 
                break;}
    }
    }           while(true){          
                    System.out.print( "enter a valid loan term in years: ");
                    Scanner scan;
                    scan = new Scanner(System.in);
                    if(scan.hasNextInt()){
                        loanTerm = scan.nextInt();
                        if(loanTerm >= 0){
                            break;
                        }
                    }
    }
                            while(true){
                                System.out.print( "enter a valid interest rate: ");
                                Scanner scan; 
                                scan = new Scanner(System.in);
                                if(scan.hasNextDouble()){
                                    interestRate = scan.nextDouble();
                                    if(interestRate>= 0){
                                        break;
                                    }
                                }
                            }
                                        interest = (loanAmt*loanTerm*interestRate)/100;
                                        ttlAmountpaid = interest +loanAmt;
                                        System.out.println("original loan amount: " + loanAmt + "$");
                                        System.out.println("interest rate: "+ interestRate +"%");
                                        System.out.println("loan term: " + loanTerm + " year(s)");
                                        System.out.println("total Ammount paid over loan: " +ttlAmountpaid + "$");
                                        System.out.println("total interest paid: " +interest + "$");
    }
    public static void printModeStatement() {
        System.out.print(
            "Select an interest calculation mode:\n"
            + "(1) Flat Interest\n"
            + "(2) Compounding Interest Without Monthly Payments\n"
            + "(3) Compounding Interest With Monthly Payments\n"
        );
    }
    public static void compoundinterestwithoutpayments() {
         while(true){
        System.out.print( "enter a valid loan amount: ");
        Scanner scan;
        scan = new Scanner(System.in);
        if(scan.hasNextDouble()){
            loanAmt = scan.nextDouble();
            if(loanAmt >= 0) { 
                break;}
    }
    }           while(true){          
                    System.out.print( "enter a valid loan term in years: ");
                    Scanner scan;
                    scan = new Scanner(System.in);
                    if(scan.hasNextInt()){
                        loanTerm = scan.nextInt();
                        if(loanTerm >= 0){
                            break;
                        }
                    }
    }
                            while(true){
                                System.out.print( "enter a valid interest rate: ");
                                Scanner scan; 
                                scan = new Scanner(System.in);
                                if(scan.hasNextDouble()){
                                    interestRate = scan.nextDouble();
                                    if(interestRate>= 0){
                                        break;
    }
}
                            }
                                        monthsremaining = loanTerm*12;
                                        while(monthsremaining >0){
                                        interest = interest+ (loanAmt+interest)*(interestRate/1200);
                                        monthsremaining -= 1;
                                         } 
                                        ttlAmountpaid = interest +loanAmt;
                                        System.out.println("original loan amount: "+loanAmt +" $");
                                        System.out.println("interest rate: "+interestRate + "%");
                                        System.out.println("loan term: " + loanTerm + " year(s)");
                                        System.out.println("total Ammount paid over loan: " +ttlAmountpaid + "$");
                                        System.out.println("total interest paid: " +interest + "$");
    }
    public static void compoundinterestwithpayments() {
          while(true){
        System.out.print( "enter a valid loan amount: ");
        Scanner scan;
        scan = new Scanner(System.in);
        if(scan.hasNextDouble()){
            loanAmt = scan.nextDouble();
            if(loanAmt >= 0) { 
                break;}
    }
    }           while(true){          
                    System.out.print( "enter a valid loan term in years: ");
                    Scanner scan;
                    scan = new Scanner(System.in);
                    if(scan.hasNextInt()){
                        loanTerm = scan.nextInt();
                        if(loanTerm >= 0){
                            break;
                        }
                    }
    }
                            while(true){
                                System.out.print( "enter a valid interest rate: ");
                                Scanner scan; 
                                scan = new Scanner(System.in);
                                if(scan.hasNextDouble()){
                                    interestRate = scan.nextDouble();
                                    if(interestRate>= 0){
                                        break;
    }
}
                            }
    
    }
}    

