public class Assignment4 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in); // Using java.util.Scanner to save some memory
        int phonePrice = 1800; // 1800 euros
        int numberOfInstallment;
	    float installmentPerMonth;
        System.out.print("Number of installments? ");
        
        // get number of installments from user
	    numberOfInstallment = input.nextInt();
        
        // calculate  installment amount for per month
	    installmentPerMonth = ((float)phonePrice/numberOfInstallment);

        System.out.println("Monthly installment Amount: "+installmentPerMonth + " euros");

	    input.close();
  }
}