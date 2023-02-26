import java.util.Scanner;

public class Week6 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            userAnswer();
            System.out.println("Success");
        } catch (Exception e) {
            System.out.println("Failure something went wrong");
        }

    }

    public static String userAnswer(){
        Scanner scan = new Scanner(System.in);
        String itemOne, itemTwo, itemThree, result;


       if(true){
        System.out.println("Please enter your favorite food ");
        itemOne = scan.nextLine();
        if(itemOne == null || itemOne.isBlank()){
            throw new IllegalArgumentException("the format cannot bull null or blank");
        }
        System.out.println("Please enter your favorite drink ");
        itemTwo = scan.nextLine();
        if(itemTwo == null || itemTwo.isBlank()){
            throw new IllegalArgumentException("the format cannot bull null or blank");
        }
        System.out.println("Please enter your favorite song ");
        itemThree = scan.nextLine();
        if(itemThree == null || itemThree.isBlank()){
            throw new IllegalArgumentException("the format cannot bull null or blank");
        }
        System.out.println();
        System.out.println("Your night out will consist of: ");
        System.out.println("Favorite Song " + itemThree);
        System.out.println("Favorite Food " + itemOne);
        System.out.println("Favorite Drink " + itemTwo);
        result = "Success";
       }
        return result;

    }
}
