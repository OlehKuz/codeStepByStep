// bug somewhere
public void advance(int min){
    int minutes = min % 60;
    int hours = min / 60;
    checkIfINeedToSwap(min);
    hour=(hour + hours % 12) % 12;
    if(hour == 0){
        hour = 12;
    }
    if((minute + minutes)/60>=1){
        hour++;
    }
    minute = (minute + minutes)%60;
}
private void checkIfINeedToSwap(int min){
    int timeToSwap = (12*60)-getHour()*60 - getMinute();
    if(min >= timeToSwap){
        int leftover = min - timeToSwap;
        changeAM();
        int halfCircles = leftover/60/12;
        if(halfCircles % 2 != 0){
            changeAM();
        }
            
    }
}


private void changeAM(){
    if(getAmPm().equals("PM")){
        amPm = "AM";
    }
    else{
        amPm = "PM";
    }
}



