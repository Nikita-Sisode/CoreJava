import java.util.Scanner;
class leapyear{
public static void main(String arg[]){
int year;
System.out.println("Enter Year:");
Scanner r=new Scanner(System.in);
year=r.nextInt();
if(year%100==0 && year%400==0 || year%100!=0 && year%4==0){
System.out.println("Leap Year");
}
else{
    System.out.println("No Leap Year");

}


}

}