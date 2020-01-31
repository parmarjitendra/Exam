public class PositiveNumber
{
        public static int pnumber(int n)
        {
            if (n <= 0) {
                return 0;
            }
            else
            {
                System.out.println(n);
              return (pnumber(n-1)) ;
            }

        }

    public static void main(String[] args) {
        System.out.println(pnumber(6));
    }





}
