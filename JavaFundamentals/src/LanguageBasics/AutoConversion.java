class AutoConversion{
    static public void main(String []args){
        byte a=0;
        short b=1;
        int i=12;
        long g=2;
        float f= 12.3f;
        double d= 1234.567;
        char ar='d';
        boolean bool=false;

        i= (int)d;
        int i1= (int)f;
        a= (byte)i;
        b= (short)i;
        System.out.println("int "+i);
        System.out.println("int i1 "+i1);
        System.out.println("byte s "+a);
        System.out.println("short "+b);
    }
}