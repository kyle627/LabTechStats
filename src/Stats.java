import java.util.*;

/**
 * Kyle Evangelisto
 * 09/02/2020 ~4pm - 430pm
 * LAB-TECH
 * Prof Levy
 * Online code repo: https://github.com/kyle627/LabtechStats
 */

public class Stats {

    public static void main(String[] args){
        List<Double> numbers = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        Double newNumber;
        for (int index = 0; index <= numbers.size(); index++){
            System.out.println("Enter in a number! Enter '0' to receive stats.");
            newNumber = scan.nextDouble();
            if (newNumber == 0){
                displayOutput(numbers); //generate stats
            }else{
                numbers.add(newNumber);
            }
        }
    }

    //This method will output required statistics
    public static void displayOutput(List<Double> numbers){
        System.out.println("------STATS-----");
        //output number of numbers in the list:
        System.out.println("Number of items: " + numbers.size());
        //output sum of all numbers entered
        System.out.println("Sum of the given values inputted: " + sumNums(numbers));
        //output max number in the list:
        System.out.println("Max Value: " + returnMax(numbers));
        //output min number in the list
        System.out.println("Min value: " + returnMin(numbers));
        //output average value of the list:
        System.out.println("Mean: " + returnMean(numbers));
    }

    //this method will sum up all numbers in a given list and return that number
    public static double sumNums(List<Double> numbers){
        double sumOfNumbers = 0;
        for (Double currentIndex: numbers){
            sumOfNumbers += currentIndex;
        }
        return sumOfNumbers;
    }

    //this method will return the max (largest) number in a given list
    public static double returnMax(List<Double> numbers){
        Collections.sort(numbers); //list is sorted and the largest value will be at the end
        return numbers.get(numbers.size() -1);
    }

    //this method will return the min (smallest) number in a given list
    public static double returnMin(List<Double> numbers){
        double min = Collections.min(numbers);
        return min;
    }

    //this method will return the mean (average) in a given list
    public static double returnMean(List<Double> numbers){
        //utilize sum-nums method and divide by number of numbers for average
        double average = sumNums(numbers) / numbers.size();
        return average;
    }

}
