package Basic;
public class LeapYearCheck{

    public static Boolean isLeap(int year){

        //Rule 1 Divisible by 100 LeapYear
        if(year % 400 == 0){
            return true;
        }
        //Rule 2 Divisilbe by 100 not a leap year
        if(year % 100 == 0){
            return false;
        }
        //Rule 3 Divisible by 4 LeapYear
        if(year % 4 == 0){
            return true;
        }

        //one line logic
        //return (year % 400 == 0 || (year % 4 == 0 && year % 100 !=0));

        return false;
    }

    public static void main (String[] args){
        int year = 2000;

        if(isLeap(year)){
            System.out.println("THe Given Year is Leap");
        }else{
            System.out.println("The year is not Leap");
        }
    }
}