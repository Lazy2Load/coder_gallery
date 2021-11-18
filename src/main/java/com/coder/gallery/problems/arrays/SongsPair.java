// [30,20,150,100,40]
class SongsPair {
    public int bruteForce(int[] time) {
    	int n = time.length;
    	int count = 0;
    	for(int i=0;i<n-1;i++){
    		for(int j=i+1;j<n;j++){
    			if(time[i][j]%60 == 0){
    				count++;
    			}
    		}
    	}
    }

    public int numPairsDivisibleBy60(int[] time) {
    	int[] modCount = new int[60];
        
        int count = 0;
        for(int i=0;i<time.length;i++){            
            
            if(time[i]%60 == 0) {
                count += modCount[0];
            }else{
                count += modCount[60 - (time[i]%60)];
            }
            modCount[time[i]%60]++;
        }
        return count;
    }
}