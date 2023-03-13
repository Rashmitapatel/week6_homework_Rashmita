package week6Homework;


/* Declare one instance and one static variable.
        * Declare one instance method.
        * Declare one static method.
        * Call both instance and static variables into both instance and static methods inside the
        print statement.
        * Declare the Main method.
        *
         Call both instance and static methods into the Main method and run the programme.
 */


public class programme3 {
    int a= 19; //instance variabel
    static int b =23; // static variabel
    public void Mymethod(){
        System.out.println(a);

    }
    public static void myMethod(){
        System.out.println(b);
    }

    public static void main(String [] args){
        programme3 obj =new  programme3();
        obj.Mymethod();
        myMethod();
    }

}
