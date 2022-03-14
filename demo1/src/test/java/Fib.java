public class Fib {
    static int temp;
    public static int Fib(int x,int y,int t){
        if (t==1 || t==2) return 1;
        for (int i = 0; i <= (t-2); i++) {
            int a=x;
            int b=y;
            temp=y;
            x=b;
            y=a+b;
        }
        return temp;
    }

    public static void main(String[] args) {
        int a[]=new int[20];
        int fib=0;
        for (int i = 0; i < 20; i++) {
            fib = Fib(1, 1, i+1);
            a[i]=fib;
        }
        for (int e:a) {
            System.out.println(e);
        }
    }
}
