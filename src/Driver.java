import java.util.*;

/**
 * Kyle Evangelisto
 * 09/02/2020 ~4pm - 430pm
 * LAB-TECH
 * Prof Levy
 * Online code repo: https://github.com/kyle627/LabtechStats
 */

public class Driver {

    public static void main(String[] args){
        List<Double> numbers = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        double newNumber;
        do {
            System.out.println("Enter in a number! Enter '0' to receive stats.");
            newNumber = scan.nextDouble();
            if (newNumber != 0){
                numbers.add(newNumber);
            }
        }while (newNumber != 0);
        scan.close();
        System.out.println(returnStatistics(numbers));
    }

    //Returns a string of statistics and requires a list of numbers
    public static String returnStatistics(List<Double> numbers){
        String output = "";
        double sumOfNumbers = 0 , average = 0 , max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        //one loop to be efficient as possible
        for (double currentIndex: numbers){
            sumOfNumbers += currentIndex; //sum numbers

            //check max
            if (currentIndex > max){
                max = currentIndex;
            }

            //check min
            if (currentIndex < min){
                min = currentIndex;
            }

            //compute average
            if (sumOfNumbers > 0){
                average = sumOfNumbers / numbers.size();
            }
        }

        //returns formatted statistics
        if (numbers.size() > 0){
             output = "-----STATS-----\n" +
                      "Number of items: " + numbers.size() + "\n" +
                      "Sum of numbers: " + sumOfNumbers + "\n" +
                      "Max value: " + max + "\n" +
                      "Min value: " + min + "\n" +
                      "Mean: " + average + "\n";
        }

        return output;
    }
}
