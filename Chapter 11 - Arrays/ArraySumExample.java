public class ArraySumExample {

      public static void main(String[] args) {
            int[] numbers = {10, 20, 30, 40, 50};
            int sum = 0;
    
            // Using a for loop to calculate the sum of array elements
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
    
            System.out.println("The sum of the array elements is: " + sum);

      }
}
