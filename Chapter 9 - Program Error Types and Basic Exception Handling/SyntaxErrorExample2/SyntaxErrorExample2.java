package SyntaxErrorExample2;

class SyntaxErrorExample2 {
    public static void main(String[] args) {
        int I = 10;

        // if (I > ))) {  // Extra closing parenthesis
        //     System.out.println("I is greater than something");
        // }

        // Solution
        if (I > 5) {  // Extra closing parenthesis...corrected
            System.out.println("I is greater than something");
        }


    }
}
