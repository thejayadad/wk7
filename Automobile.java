import java.util.Scanner;

public class Automobile {

    private String autoMake;
    private String autoModel;
    private String autoColor;
    private int autoYear;

    public Automobile(String autoMake, String autoModel, String autoColor, int autoYear){
        this.autoMake = autoMake;
        this.autoModel = autoModel;
        this.autoColor = autoColor;
        this.autoYear = autoYear;
    }



    public String RemoveVehicle(String custMake, String custModel, String custColor, int custYear){
        Scanner scan = new Scanner(System.in);
        String result;
        System.out.println("Auto Make ");
        custMake = scan.nextLine();
        System.out.println("Auto Model ");
        custModel = scan.nextLine();
        System.out.println("Auto Color ");
        custColor = scan.nextLine();
        System.out.println("Auto Year");
        custYear = scan.nextInt();
        if(custMake.equals(autoMake) && custModel.equals(autoModel) && custColor.equals(autoColor) && custYear == autoYear){
            System.out.println("Vehicle Removed");
            result = "Vehicle Removed";
        } else{
            System.out.println("Mismatch Entry");
            result = "Mismatch Entry";
        }
        return result;

    }
}
