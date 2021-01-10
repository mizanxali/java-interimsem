//MIZANALI PANJWANI - 19BCG10070
//PROGRAMMIN IN JAVA - ASSIGNMENT - JAN 09

import java.time.LocalTime;
import java.util.Scanner;

public class Jan09Assignment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first time in hh:mm format");
        String time1String = sc.next();
        LocalTime time1 =LocalTime.parse(time1String);

        System.out.println("Enter second time in hh:mm format");
        String time2String = sc.next();
        LocalTime time2 =LocalTime.parse(time2String);

        TimeSpan timeSpan = new TimeSpan(time1.getHour() - time2.getHour(), time1.getMinute() - time2.getMinute());
        
        //perform operations on the timeStamp object
    }
}

class TimeSpan {
    int hours;
    int minutes;

    public TimeSpan(int hours, int minutes) {
        this.hours = hours;
        if(minutes<60)
            this.minutes = minutes;
        else {
            int carriedHours = minutes/60;
            int remainingMinutes = minutes%60;
            this.hours += carriedHours;
            this.minutes = remainingMinutes;
        }
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void add(int hours, int minutes) {
        this.hours += hours;
        this.minutes += minutes;
    }

    public void add(TimeSpan timeSpan) {
        this.hours += timeSpan.hours;
        this.minutes += timeSpan.minutes;
    }

    public double getTotalHours() {
        return this.hours + ((double)this.minutes/60);
    }

    public String toString() {
        return this.hours + "h" + this.minutes + "m";
    }
}
