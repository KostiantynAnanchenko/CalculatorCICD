package Tasks;

public class Calculator {

    public int sum (int n){
        if (n <= 0) {
            throw new IllegalArgumentException("n should be a higher than zero");
        }
        int result =0;
        for(int i=0;i<=n;i++) {
            result+=i;
        }
        System.out.println("New feature");
        return result;
    }

}