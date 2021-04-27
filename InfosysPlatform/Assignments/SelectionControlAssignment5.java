package Assignments;

public class SelectionControlAssignment5 {
    public static void main(String[] args) {
        String accountnumber = "1001";
        //int salary = 40000;
        int accountbalance = 250000;
        String loantype="Car";
        int loanAmountExpected =300000;
        int emisexpected = 30;

        
        int loansalary=0;
        int eligibleloan=0;
        int emi=0;
        

 
        if (loantype == "Car"){
            loansalary=25000;
            eligibleloan=500000;
            emi =36;
        }else if (loantype == "House"){
            loansalary=50000;
            eligibleloan=6000000;
            emi =60;
        }else if (loantype == "Business"){
            loansalary=75000;
            eligibleloan=7500000;
            emi =84;
        }

        if (accountnumber.length()==4 && accountnumber.charAt(0)=='1'&& accountbalance>1000){
            if(loanAmountExpected <= eligibleloan && emisexpected<=emi){
                System.out.println(loansalary);
                System.out.println("eligible loan amount :"+eligibleloan);
                System.out.println("eligible emi :"+emi);

            }else{
                System.out.println("loan not approved");
            }
        }else{
            System.out.println("Validation Failed");
        }

        
    }
}
