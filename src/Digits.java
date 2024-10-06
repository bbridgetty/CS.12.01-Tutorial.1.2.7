import java.util.ArrayList;

public class Digits {

    private ArrayList<Integer> digitList;

    public Digits(int num) {
        digitList = new ArrayList<>();

        if (num < 0) { // Throw an exception for negative numbers
            throw new IllegalArgumentException("The number passed to the constructor (" + num + ") cannot be negative!");
        }

        if (num == 0) { // Check if the number is zero
            digitList.add(0); // Add 0 to the list if the number is zero
        } else {
            while (num > 0) { // Extract digits from the number
                int digit = num % 10; // Get the last digit of the number
                digitList.add(0, digit); // Add the digit to the beginning of the list
                num /= 10; // Remove the last digit from the number
            }
        }
    }

    public ArrayList<Integer> getDigitList() {
        return digitList;
    }

    public boolean isStrictlyIncreasing() {
        for (int i = 1; i < digitList.size(); i++) { //starts from 2nd number
            if (digitList.get(i) <= digitList.get(i - 1)) { // check that the current digit is less than or equal to the previous digit
                return false;
            }
        }
        return true;
    }
}