import java.util.Scanner;
class task{
    public static void main(String[] args){
        System.out.println("Enter your task: ");
        Scanner s=new Scanner(System.in);
        String n = s.nextLine();
        task2 a= new task2();
        a.msg(n);

    }
}
class task2{
    void msg(String a){
        if(a.isBlank()){
        System.out.println("Empty msg");
        }
        else
    {
        System.out.println("your task: "+a);
        System.out.println("Thank you for task");
    }
}
}