public class RewardValue {
    
    private double cashValue;  // Stores the value in cash
    private double milesValue; // Stores the value in miles
    private final double MILES_TO_CASH_RATE = 0.0035; // Conversion rate from miles to cash

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_RATE;
    }

    // Constructor that accepts a value in miles
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_RATE;
    }

    // Method to get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the value in miles
    public double getMilesValue() {
        return milesValue;
    }

    public static void main(String[] args) {
        RewardValue cashReward = new RewardValue(10.00); // $10 reward
        System.out.println("Cash reward of $10 is worth: " + cashReward.getMilesValue() + " miles.");

        RewardValue milesReward = new RewardValue(5000); // 5000 miles reward
        System.out.println("Miles reward of 5000 miles is worth: $" + milesReward.getCashValue());
    }
}
