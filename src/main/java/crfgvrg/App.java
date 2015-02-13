package crfgvrg;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static float getFloat()
    {
        return 5;
    }

    public static int getInt()
    {
        return 9;
    }

    public static Object getObjectId()
    {
        App myApp= new App();
        return myApp;
    }

    public static  Object getObjectEq()
    {
        App myApp2= new App();
        return myApp2;
    }

    public static boolean getTrue()
    {
        return true;
    }

    public static boolean getFalse()
    {
        return false;
    }

    public static Object getNull()
    {
        App myObj= new App();
        return myObj;
    }

    public static Object getNonNull()
    {
        App myObj= null;
        return myObj;
    }

    public static int[] getArrays()
    {
        int[] myIntArray;
        myIntArray = new int[] {1,2,3,4,5};

        return myIntArray;
    }

    public static int divisionWithException(int a, int b)
    {
        if(b==0)
        {
            throw  new ArithmeticException();
        }

        return a/b;
    }



}
