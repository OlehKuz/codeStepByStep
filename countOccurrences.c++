int countOccurrencesHelp(Vector<int> &v1, Vector<int> &v2, 
                         int index, const int &sizeV1, const int &sizeV2, int i){
    int count = 0;
    if(index == sizeV1 - sizeV2 +1|| sizeV2 > sizeV1){
        return 0;
    }else{
            bool equals = v1[index + i] == v2[i];
            i++;
            if(!equals){
                index++;
                i = 0;
            }
            
            if(i == sizeV2){
                count++;
                index++;
                i = 0;
            }
        
        count += countOccurrencesHelp(v1, v2, index,sizeV1, sizeV2, i);
        return count;
        
    }
}

int countOccurrences(Vector<int> &v1, Vector<int> &v2){
    int sizeV2 = v2.size();
    int sizeV1 = v1.size();
    return countOccurrencesHelp(v1, v2, 0, sizeV1, sizeV2, 0);
}



