package za.co.wethinkcode.fizzbuzz;
import java.util.Arrays;

public class FizzBuzz {
    public String checkNumber(int number) {

        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;

        if (divisibleBy5 && divisibleBy3)
        {
            return "FizzBuzz";
        }

        else if (divisibleBy3)
        {
            return "Fizz";
        }

        else if (divisibleBy5)
        {
            return "Buzz";
        }

        return String.valueOf(number);
    }

    public String countTo(int number) {

        String[] arrayNumbers;
        arrayNumbers = new String[number];
        for (int i = 0; i < number;i++) {
            arrayNumbers[i] = checkNumber(i+1) ;
        }
        return Arrays.toString(arrayNumbers);
    }

}