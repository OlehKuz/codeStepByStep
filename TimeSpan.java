// we can have two methods w the same name that take different parameters

public class TimeSpan{
    private int hours;
    private int minutes;
    
    public TimeSpan(int h, int m){
        hours = h;
        minutes = m;
    }
    
    public int getHours(){
        return hours;
    }
    
    public int getMinutes(){
        return minutes;
    }
    
    public void add(int h, int m){
        minutes = m + minutes;
        if (minutes>=60){
            hours++;
            minutes = minutes - 60;
        }
        hours += h;
    } 
    
    public void add(TimeSpan span){
        hours += span.getHours();
        minutes += span.getMinutes();
        if (minutes>=60){
            hours++;
            minutes -= 60;
        }
    }
    
    public double getTotalHours(){
        return (double)minutes/60 + hours;
    }
    
    public String toString(){
        return hours +"h"+ minutes+"m";
    }
}
