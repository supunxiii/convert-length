import java.util.Scanner;
public class MeterConversion{
  public static void main(String[] args) {
    int length1Meters, length2Meters, length3Meters, length1Centi, length2Centi, length3Centi;
    Scanner userinput = new Scanner(System.in);
    System.out.println("Enter a length in meters: ");
    length1Meters = userinput.nextInt();
    System.out.println("Enter a length in meters: ");
    length2Meters = userinput.nextInt();
    System.out.println("Enter a length in meters: ");
    length3Meters = userinput.nextInt();
    userinput.close();
    length1Centi=length1Meters*100;
    length2Centi=length2Meters*100;
    length3Centi=length3Meters*100;
    System.out.println("The first length you entered in centimeters is "+length1Centi);
    System.out.println("The second length you entered in centimeters is "+length2Centi);
    System.out.println("The third length you entered in centimeters is "+length3Centi);
    
  }
}
