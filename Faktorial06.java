public class Faktorial06 {

    int FaktorialBF(int n) {
        int fakto = 1;
        int i = 1;
        while (i <= n) {
            fakto *= i;
            i++;
        }
        return fakto;
    }
    int FaktorialDC(int n) {
        if (n==1) {
            return 1;
        }else{
            int fakto = n * FaktorialDC(n-1);
            return fakto;
        }
    }
}