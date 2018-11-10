public int countInRange(ArrayList in, int min, int max){
    int number = 0;
    for(int i = 0; i < in.size(); i++){
        if((Integer)in.get(i)>=min&&(Integer)in.get(i)<=max){
            number++;
        }
    }
    return number;
}
