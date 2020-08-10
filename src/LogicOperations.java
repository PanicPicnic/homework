public class LogicOperations {
    public static void main(String[] args) {
       int x = 5, y = 10, z = 15, var;
       //x += y >> x++ * z;
       System.out.println("First task " + (x += y >> x++ * z)); //y >> x++ = 0 x=x
       //z = ++x & y * 5;
       { z= ++x&y;
       z=z*5;
           System.out.println("Second task " + z);
       }
        //y /= x + 5 | z;
        System.out.println("Third task " + (y /= x + 5 | z)); //10/=20 = 0
        //z = x++ & y * 5;
        System.out.println("Forth task " + (z = x++ & y * 5));//x++&y = 0
        //x = y << x++ ^ z;
        x = y<<x;
        x = x^z;
        System.out.println(x);
    }}


