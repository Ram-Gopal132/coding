class Hcf1{
    public static void main(String[] args) {
        int a=95;
        int b=60;
        int hcf=0;
        for (int i=1;i<=a || i<=b;i++)
        {
            if(a%i==0 || b%i==0)
            {
                hcf=i;
            }
            
        }
        System.out.print(hcf);
    }
}