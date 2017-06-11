//Finding the equilibrium index of array
class practice_codility {
    public int solution(int[] A) {
        // write your code in Java SE 8
        long totalSum = sum(A);
    long lowSum = 0L;
    for (int i = 0; i < A.length; i++) {
        totalSum -= A[i];
        if (lowSum == totalSum) {
            return i;
        }
        lowSum += A[i];
    }
    return -1;
    }
    
  public int  sum(int[] array) {
      int x=0;
    for(int j=0;j<array.length;j++){
        x+=array[j];
    }  
    return x;
}
}