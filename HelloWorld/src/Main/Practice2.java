package Main;


public class Practice2 {
    public static void main(String[] args) {
      String fullName = greetUser("Onyekachi", "Ejemba");
        System.out.println(fullName);
    }
    public static String greetUser(String firstName, String lastName){
        return "Hello " + firstName + " " + lastName;
    }
}






//       FIZZBUZZ CHALLENGE.
//        System.out.print("Pls input a number: ");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        if(number % 5 == 0 && number % 3 == 0)
//            System.out.println("FizzBuzz");
//        else if (number % 5 == 0)
//            System.out.println("Fizz");
//        else if (number % 3 == 0)
//            System.out.println("Buzz");
//        else
//            System.out.println(number);


//        WHILE LOOP, anytime we put a string that is not quit it returns back the input and the loop starts again,
//          but once we input quit it returns back quit and ends the program.
//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        while (!input.equals("quit")){
//        System.out.print("Input: ");
//        input = scanner.next().toLowerCase();
//        System.out.println(input);


//        DO WHILE LOOP,
//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        do {
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//        }while (!input.equals("quit"));


//       Break statement function is to completely terminate the loop statement while the Continue statement
//           starts the loop again from the beginning.
//          Scanner scanner = new Scanner(System.in);
//          String input = "";
//          while (true) {
//              System.out.print("Input: ");
//              input = scanner.next().toLowerCase();
//              if(input.equals("pass"))
//                  continue;
//              if(input.equals("quit"))
//                  break;
//              System.out.println(input);
//           }

//      For Loop prints out the elements in the array...
//        String[] fruits = {"Apple", "Orange", "Mango"};
//        for(int i = 0; i < fruits.length; i++)
//          System.out.println(fruits[i]);

//      For each Loop is another way of printing the array element above...
//        for (String fruit : fruits) System.out.println(fruit);

//        To reverse the element in the above array using a For Loop...
//        for(int i = fruits.length - 1; i >= 0; i--)
//            System.out.println(fruits[i]);







//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        while (true) {
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//            if (input.equals("pass"))
//                continue;
//            if (input.equals("quit"))
//                break;
//            System.out.println(input);






//        System.out.print("Enter a Number:");
//
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//
//
//        if (number % 3 == 0 && number % 5 == 0 ){
//            System.out.println("FizzBuzz");
//        } else if (number%3 == 0) {
//            System.out.println("Buzz");
//        } else if ( number % 5 == 0){
//            System.out.println("Fizz");
//        } else{
//            System.out.println(number);
//        }


        //else
        //System.out.println("number");
        /*Scanner scanner = new Scanner(System.in);
        String Role = scanner.next();

        switch (Role){
            case "Admin":
                System.out.println("You are an Admin!!");
                break;
            case "Moderator":
                System.out.println("You are a Moderator");
                break;
            default:
                System.out.println("You are a guest");
        }
        */

