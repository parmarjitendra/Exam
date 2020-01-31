public class FabonacciSeries
{
    void FibSeries(int i)
    {
        if(i>=1)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            FibSeries(i-1);
        }

    }
    static int a=0,b=1,c;
    public static  void main(String[] args)
    {
        FabonacciSeries obj = new FabonacciSeries();
        obj.FibSeries(15);
    }
}
