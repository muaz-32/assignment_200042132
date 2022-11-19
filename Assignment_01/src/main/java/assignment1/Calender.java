package assignment1;

public class Calender {
    public String nextDay(int day, int month, int year){
        int days = getDaysInMonth(month, year);
        if(day == days){
            day = 1;
            if(month == 12){
                month = 1;
                year++;
            }
            else{
                month++;
            }
        }
        else{
            day++;
        }
        return day + "/" + month + "/" + year;
    }
    int getDaysInMonth(int month, int year){
        if(month == 2){
            if(isLeapYear(year)) return 29;
            else return 28;
        }
        else if(month <= 7){
            if(month % 2 == 1) return 31;
            else return 30;
        }
        else{
            if(month % 2 == 0) return 31;
            else return 30;
        }
    }
    boolean isLeapYear(int year){
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) return true;
        else return false;
    }
}
