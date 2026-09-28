/* class Solution {
    public boolean prime(int num){
        if(num==0|| num==1) return false;
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0) return false;
        }
        return true;
    }
    public int countPrimes(int n) {
        if(n==0) return 0;
        int count=0;
        
        for(int i=0; i<n; i++){

            if(prime(i)){
                count++;
            }
        }
        return count;
    }
}  */                        //TLE


//Sieve of Eratosthenes
class Solution {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        boolean[] isComposite = new boolean[n];

        int count = 0;

        for (int i = 2; i * i < n; i++) {
            if (!isComposite[i]) {
                for (int j = i * i; j < n; j += i) {
                    isComposite[j] = true;
                }
            }
        }

        for (int i = 2; i < n; i++) {
            if (!isComposite[i]) {
                count++;
            }
        }

        return count;
    }
}
