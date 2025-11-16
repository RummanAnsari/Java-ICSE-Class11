// Program to demonstrate how if–else if reduces number of comparisons
class IfElseComparison {
    public static void main(String[] args) {
        int a = 2;   // You can change this value to test different cases

        System.out.println("Using independent if statements:");
        if (a == 0)
            System.out.println("Zero");
        if (a == 1)
            System.out.println("One");
        if (a == 2)
            System.out.println("Two");
        if (a == 3)
            System.out.println("Three");

        System.out.println("\nUsing if–else if ladder:");
        if (a == 0)
            System.out.println("Zero");
        else if (a == 1)
            System.out.println("One");
        else if (a == 2)
            System.out.println("Two");
        else if (a == 3)
            System.out.println("Three");
        else
            System.out.println("Invalid number");

    
         
    }
}
