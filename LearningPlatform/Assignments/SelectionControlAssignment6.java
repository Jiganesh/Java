// You have x number of $5 notes and y number of $1 notes. You want to purchase an item for amount z. 
//The shopkeeper wants you to provide exact change. You want to pay using a minimum number of notes. 
//How many $5 notes and $1 notes will you use?
// Implement a program to find out how many $5 notes and $1 notes will be used. If an exact change is not possible, then display -1



public class SelectionControlAssignment6 {
    public static void main(String[] args) {

        int numberof1 = 2;
        int numberof5 = 4;
        int amountreq = 21;

        int req5 = amountreq / 5;
        int req1 = amountreq % 5;

        if (req5 <= numberof5 && req1 <= numberof1) {
            System.out.println("1$ notes needed " + req1);
            System.out.println("5$ notes needed " + req5);

        } else {
            System.out.println(-1);
        }
    }
}
