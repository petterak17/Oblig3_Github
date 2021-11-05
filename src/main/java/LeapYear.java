public class LeapYear {
    public static boolean CheckLeapYear(int year) {
        if ((year % 4 ==0) != (year % 100 == 0)) {
            System.out.println("leap year!!: " + year);
        } else {
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("leap year!!: " + year);
                return true;
            }  else {
                System.out.println(year + " is not a leap year!!");

            }


        }
        return false;
    }
}
