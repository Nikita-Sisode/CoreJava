import java.util.Scanner;
class Hello{
    public static void main(String[] args) {
        int n;
        System.out.println("Enter no:");
        Scanner r=new Scanner (System.in);
        n=r.nextInt();
        if (n>=45){
            System.out.println("pass");
    
        }
        if(n>=75){
            System.out.println("Distinction");

        }
        else{
            System.out.println("Fail");
        }
        
    }
}
