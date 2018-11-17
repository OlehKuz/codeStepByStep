public HashMap<String, String> teacher(HashMap<String, Integer> roster, HashMap<Integer, String> gradeMap){
    HashMap<String, String> scores = new HashMap<String, String>();
    for(String name:roster.keySet()){
        Integer score = roster.get(name);
        Integer prevGrade = 0;
        int counter = 0;
        for(Integer grade:gradeMap.keySet()){
            counter++;
            if(prevGrade == 0){
                prevGrade = grade;
            }
            if(grade>score){
                if(prevGrade>score){
                    scores.put(name, "F");
                }else{
                    scores.put(name, gradeMap.get(prevGrade));
                }
                break;
            }
            if(gradeMap.size() == counter){
                scores.put(name, gradeMap.get(grade));
            }
            prevGrade = grade;
            
        }
    }
    return scores;
}
