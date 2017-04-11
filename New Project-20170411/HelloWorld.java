class HelloWorld
{
    public static void main(String args[])
    {
        int no;
        no=100;
        System.out.println("no="+no);
        no=no+20;
        System.out.println("no="+no);
        no=no*5;
        System.out.println(no);
        
        int no2,no3;
        no2=10;
        no3=20;
        if(no2<no3)System.out.println("no2 is less then no3");
        no2=no2*2;
        if(no2==no3)
        System.out.println("no2 is equal to no3 ");
        
        no2=no2*2;
        if(no2>no3)
        System.out.println("no2 is greater then no3");
    }
}