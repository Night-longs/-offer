public class Solution{
        public double Power(double base, int exponent) {
            double temp=1;
            double txp=1;
            if (exponent==0){
                return 1;
            }else if (exponent>0){
                for (int i = 1; i <=exponent ; i++) {
                    temp*=base;
                }
            }else{
                for (int i = 1; i <=(-exponent) ; i++) {
                    txp*=base;
                }
            }
            return exponent>0? temp:(1/txp);  
        }
}
