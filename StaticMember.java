//Static memeber inside non static contex
 class Anup
 {
     int a= 10;

    public void sheela()
    {
        int a=25;
        System.out.println("directly"+a);
        System.out.println("this"+this.a);
    }
    public static void main (String[]args)
    {
        Anup ref=new Anup ();
        ref.sheela();
    }
    
}
