public ArrayList<Integer> intersect(ArrayList list1, ArrayList list2){
    ArrayList<Integer> common = new ArrayList<Integer>();
    int index = 0;
    for(int i = 0; i < list1.size(); i++){       
        int num = (Integer)list1.get(i);
        for(int j = index; j < list2.size(); j++){
            if((Integer)list2.get(j) == num){
                common.add(num);
                index = j;
            }
        }
    }
    return common;
}
