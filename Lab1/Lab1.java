import java.util.Scanner;
public class Lab1 {
    static int ID;
    static String Name;
    static char Gender;
    static String State;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your ID : ");
        Integer.parseInt(sc.nextLine());
        System.out.println("Enter your Name: ");
        sc.nextLine();
        System.out.println("Enter your State");
        State= sc.nextLine();
        System.out.println("Enter 'm' for male or 'f' for female: ");
        Gender = sc.next().charAt(0);
        if (Gender == 'm') {
           System.out.println("Male");
        } else if (Gender == 'f') {
            System.out.println("Female");
        }
        switch(State){
            case "Gujarat":
                System.out.println("Region:West");
                break;
            case "Tamil Nadu":
                System.out.println("Region:South");
                break;
            case "Jammu & Kasmir":
                System.out.println("Region:North");
                break;
            case "Andhra Pradesh":
                System.out.println("Region:South");
                break;
            case "Rajasthan":
                System.out.println("Region:West");
                break;
            case "Bihar":
                System.out.println("Region:East");
                break;
            case "Assam":
                System.out.println("Region:East");
                break;
            default: 
                System.out.println("INVALID STATE");
        }
    }
}



