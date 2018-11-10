public class Date{
    // month 1 -12
    private int[] today = new int[2];
    private int[] date = new int[12];
    
    public Date(int m, int d){
        today[0] = m;
        today[1] = d;
        initializeDate();
    }
 
    private void initializeDate(){
        for(int m = 0; m < date.length; m++){
            if(m == 1){
                date[m] = 28;
            }
            else if((m % 2 == 0 && m < 7) || (m % 2 != 0 && m > 6)){
                date[m] = 31;
            }
            else{
                date[m] = 30;
            }
        }
    }
    

    public int daysInMonth(){
        return date[today[0] - 1];
    }

    
    public int getDay(){
        return today[1];
    }
    
    public int getMonth(){
        return today[0];
    }
    
    public void nextDay(){
        if(today[1]<date[today[0] - 1]){
            today[1]++;
        }
        else{
            if(today[0] == 12){
                today[0] = 1;
                today[1] = 1;
            }
            else{
                today[0]++;
                today[1] = 1;
            }
        }
    }
    private String format(int num){
        String label = "";
        if(num<10){
            label = "0";
        }
        return label;
    }
    
    
    public String toString(){
        return format(today[0]) + today[0] + "/" + format(today[1]) + today[1];
    }
    
}
