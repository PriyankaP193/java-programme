class charac {
    public static void main(String[] args) {
        char m = 'a';

        if (m == 'a' || m == 'e' || m == 'i' || m == 'o' || m == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}

// task2
class charac1 {
    public static void main(String[] args) {
        int num = -6;

        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}

// task3
class charac2 {
    public static void main(String[] args) {
        int marks = 65;

        if (marks >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}

// task4
 class charac3 {
    public static void main(String[] args) {
        int m = 10;
        int n = 20;

        if (m > n) {
            System.out.println(m);
        } else if (n > m) {
            System.out.println(n);
        } else {
            System.out.println("Equal");
        }
    }
}

// task5
class charac4{
    public static void main(String[] args) {
        int age = 20;

        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible");
        }
    }
}
