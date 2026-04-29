class year {
    public static void main(String[] args) {
        int yr = 2024;

        if (yr % 4 == 0) {
            if (yr % 100 == 0) {
                if (yr % 400 == 0) {
                    System.out.println(yr + " is a Leap Year");
                } else {
                    System.out.println(yr + " is not a Leap Year");
                }
            } else {
                System.out.println(yr + " is a Leap Year");
            }
        } else {
            System.out.println(yr + " is not a Leap Year");
        }
    }
}