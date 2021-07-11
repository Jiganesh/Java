/*
class User {
    // Implement your code here
    private int id;
    private String userName;
    private String emailId;
    private double walletBalance;

    public User(int id, String userName, String emailId, double walletBalance) {
        this.id = id;
        this.userName = userName;
        this.emailId = emailId;
        this.walletBalance = walletBalance;
    }

    public boolean makePayment(double billAmount) {
        if (walletBalance >= billAmount) {
            walletBalance -= billAmount;
            return true;
        }
        return false;
    }

    // Getter and Setter methods for Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter methods for userName
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    // Getter and Setter methods for emailId
    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    // Getter and Setter methods for walletBalance
    public double getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(double walletBalance) {
        this.walletBalance = walletBalance;
    }

}

class PremiumUser extends User {
    // Implement your code here
    private int rewardPoints;

    public PremiumUser(int id, String userName, String emailId, double walletBalance) {
        super(id, userName, emailId, walletBalance);
        this.rewardPoints = 0;
    }

    @Override
    public boolean makePayment(double billAmount) {
        if (getWalletBalance() >= billAmount) {
            setWalletBalance(getWalletBalance() - billAmount);
            this.rewardPoints += billAmount / 10;
            return true;
        }
        return false;
    }

    // Getter and Setter methods for rewardPoints
    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }
}

class Tester {

    public static void main(String[] args) {

        User user = new User(101, "Joe", "joe@abc.com", 100);

        PremiumUser premiumUser = new PremiumUser(201, "Jill", "jill@abc.com", 300);

        processPayment(user, 70);

        processPayment(premiumUser, 150);

        processPayment(premiumUser, 80);

        processPayment(premiumUser, 120);

    }

    public static void processPayment(User user, double billAmount) {
        if (user.makePayment(billAmount)) {
            System.out.println(
                    "Congratulations " + user.getUserName() + ", payment of $" + billAmount + " was successful!");
        } else {
            System.out.println("Sorry " + user.getUserName() + ", you do not have enough balance to pay the bill!");
        }
        System.out.println("Your wallet balance is $" + user.getWalletBalance());

        if (user instanceof PremiumUser) {
            PremiumUser premiumUser = (PremiumUser) user;
            System.out.println("You have " + premiumUser.getRewardPoints() + " points!");
        }
        System.out.println();
    }
}
*/