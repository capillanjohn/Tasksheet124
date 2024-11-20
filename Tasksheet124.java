import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class Tasksheet124 {
    
    public static void main(String[] args) {
        // Step 1: Create a list of integers with both positive and negative numbers
        List<Integer> numbers = Arrays.asList(15, -3, 8, 22, -10, 7, 5, -9, 13, 4);

        // Step 2: Define several Predicate lambda expressions
        // A Predicate to check if a number is positive
        Predicate<Integer> isPositive = n -> n > 0;

        // A Predicate to check if a number is even
        Predicate<Integer> isEven = n -> n % 2 == 0;

        // A Predicate to check if a number is greater than 10
        Predicate<Integer> isGreaterThan10 = n -> n > 10;

        // Step 3: Filter the list using these predicates and display the results

        // Filter for positive numbers
        List<Integer> positiveNumbers = numbers.stream()
                .filter(isPositive)
                .collect(Collectors.toList());
        System.out.println("Positive Numbers: " + positiveNumbers);

        // Filter for even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(isEven)
                .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);

        // Filter for numbers greater than 10
        List<Integer> numbersGreaterThan10 = numbers.stream()
                .filter(isGreaterThan10)
                .collect(Collectors.toList());
        System.out.println("Numbers Greater Than 10: " + numbersGreaterThan10);

        // You can also combine multiple predicates to filter with multiple conditions
        // Example: Numbers that are positive and even
        List<Integer> positiveAndEven = numbers.stream()
                .filter(isPositive.and(isEven))
                .collect(Collectors.toList());
        System.out.println("Positive and Even Numbers: " + positiveAndEven);
    }
}
