import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        voteAge();
        oddOrEven();
        getMaxAndMin();
        nameFormatter();

    }

    public static void voteAge() { // method opg 1
        Scanner s = new Scanner(System.in);
        System.out.println("enter age");
        int age = s.nextInt();
        if (age < 18) {
            System.out.println("you are not eligible to vote");
        } else {
            System.out.println("happy voting");
        }
    }

    public static void getMaxAndMin() { // method opg 2
        Scanner s = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.println("give me a number");
        numbers.add(s.nextInt());
        System.out.println("give me a second number");
        numbers.add(s.nextInt());
        System.out.println("give me a third number");
        numbers.add(s.nextInt());
        System.out.println(Collections.max(numbers) + " is the biggest number"); // finds the biggest number
        System.out.println(Collections.min(numbers) + " is the smallest number"); // finds the smallest number
    }

    public static void oddOrEven() { // method opg 3
        Scanner s = new Scanner(System.in);
        System.out.println("put in a number");
        int number = s.nextInt();
        if (number % 2 == 0) { // hvis der ikke er noget resterende efter at dividere tallet med 2 er det lige
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }

    public static void nameFormatter() { // method opg 4 //
        Scanner s = new Scanner(System.in);
        System.out.println("write your full name");
        String input = s.nextLine();
        String[] splitStr = input.split("\\s+"); // splitter input string mellem spaces og putter i array
        for (int i = 0; i < splitStr.length -1; i++) { // for loop kører igennem splittet array og stopper før sidste element
            System.out.print(splitStr[i].toUpperCase().charAt(0) + ". ");
        }
        System.out.print(splitStr[splitStr.length -1]); // tilføjer sidste element i array, første bogstav ikke kapitaliseret automatisk
    }

}

