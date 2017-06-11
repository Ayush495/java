import java.util.ArrayList;

public class absolute_diff {
    public int maxArr(ArrayList<Integer> A) {
        int max=0;
        int [] a= new int[A.size()] ;
        for (int i=0;i<A.size();i++){
            a[i]=A.get(i);
        }
        //Arrays.sort(a);
        int find_max=0;
        for(int k=0;k<a.length;k++){
            for (int j=k+1;j<a.length;j++){
                find_max=Math.abs(a[k]-a[j])+Math.abs(k - j);
                if(find_max>max)
                max=find_max;
            }
        }
        return max;
    }
}
