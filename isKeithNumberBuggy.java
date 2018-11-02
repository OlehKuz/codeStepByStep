	public boolean isKeithNumber(int n){
		ArrayList<Integer> keith = new ArrayList<Integer>();
		// adds separate digits of a passed number to an array list
		 int digitsOfN = n;
		    int count = 0;		    
		    while(digitsOfN>0){
		    	keith.add(0,digitsOfN%10);
		        digitsOfN/=10;
		        count++;
		    }
	    
		    
	    int index = 0;
	    while(true){       
	    	int next = 0;
	        for(int i = index; i < index + count; i++){
	            next+=keith.get(i);
	        }
	        if(next>n) {
	        	break;
	        }
	        keith.add(next);
	        index++;
	    }
	    return (Integer)keith.get(keith.size()-1)==n;
	}
