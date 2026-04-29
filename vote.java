import java.util.Scanner;
class vote{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Getting inp from user : ");
        int age = obj.nextInt();
        if(age >= 18){
            System.out.println("Eligible for voting2k26");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
}