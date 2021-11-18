class NonDecreasingArray {
    
    public boolean checkPossibility(int[] nums) {
        
        int count = 0;
        for(int i=0;i<n-1;i++){

            if(i > (i+1)){
            	count++;
            }
            if(count > 1) return false;
        }
        return true;
    }
}

// [4,2,3] - true - [1,2,3]
// [4,2,1] - false
// [3,4,2,3] - false
// [5,7,1,8] - true - [5,7,7,8]
// [5,7,1,2,8] - false
// [5,7,1,8,9] - false
