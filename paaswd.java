import java.util.Scanner;

class paaswd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your password: ");
        int inputPass = sc.nextInt();

        paaswd1 obj = new paaswd1();   // create object

        if (obj.getPassword() == inputPass) {
            System.out.println("Login successful");
        } else {
            System.out.println("Wrong password");
        }
    }
}

class paaswd1 {
    private int changepasswd = 12345;

    int getPassword() {
        return changepasswd;
    }
}