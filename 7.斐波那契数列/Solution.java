import java.lang.reflect.Array;

public class Solution {
        public int Fibonacci(int n) {
            int a[]=new int[n+2];
            a[0]=0;
            a[1]=1;
            for (int i = 0; i <=n; i++) {
                if(i!=1&&i!=0){
                    a[i]=a[i-1]+a[i-2];
                }
            }
           return a[n] ;
        }
    }
