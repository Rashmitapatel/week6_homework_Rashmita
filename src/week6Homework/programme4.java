package week6Homework;
/* Declare two instance and two static variables.
        * Declare one instance method.
        * Declare one static method.
        *Call all four instance and static variables into both instance and static methods inside the
        print statement.
        *Declare the Main method.
        * Call both instance and static methods into the Main method and run the programme.

 */
public class programme4 {

    int a = 23; // instance variabel
    String b = "Bday"; //instance variabel

    static int a1 = 5; // static variabel
    static String b1 = "Age"; // static variabel


    // instance method
    public void shambhavi(){
        System.out.println (a);
        System.out.println(b);
        System.out.println(a1);
        System.out.println(b1);

    }
    // static metod
    public static void Mydaughter(){
        System.out.println( a1 );
        System.out.println(b1);
        programme4 instance = new programme4();
        System.out.println(instance.a);
        System.out.println(instance.b);
    }

    public static void main(String[] args) {
        programme4 Daughter  = new programme4();
        Daughter.shambhavi();
        Mydaughter();
    }
}
