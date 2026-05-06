import java.util.Scanner;
class exp_track {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        expenser_track x = new expenser_track();
        x.expenser(sc);
    }
}
class expenser_track {
    void expenser(Scanner sc) {
        String[] category = new String[100];
        int[] amount = new int[100];
        int i = 0;
        int total = 0;
        int foodTotal = 0;
        String c;
        do {
            System.out.print("Enter category (Food/Travel/Shopping) or Stop: ");
            c = sc.next();

            if (!c.equals("Stop")) {
                System.out.print("Enter amount: ");
                int a = sc.nextInt();

                category[i] = c;
                amount[i] = a;
                i++;

                total = total + a;

                if (c.equals("Food")) {
                    foodTotal = foodTotal + a;
                }
            }

        } while (!c.equals("Stop"));
        System.out.println("Total Expenses: " + total);
        System.out.println("Food Expenses: " + foodTotal);
        System.out.println("All Expenses:");
        for (int j = 0; j < i; j++) {
            System.out.println(category[j] + " : " + amount[j]);
        }
    }
}