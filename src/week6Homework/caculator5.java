package week6Homework;
/*a program for a calculator with addition, subtraction, multiplication
* and division methods all with parameters and use string concatenation
  * methods.(Note: Two static and Two instance methods.)
 */
public class caculator5 {



    public static void main(String[] args) {
        caculator5 obj1 = new caculator5();
        obj1.addition(10,20);
        obj1.subtraction(10,20);
        muliplication(30,40);
        division(40,4);

    }
        public void addition( int a , int b){
        int ans = a+b;
            System.out.println(ans);
        }

        public void subtraction(int a , int b){
        int  s1 = b-a;

            System .out.println(s1);

        }
        public static void muliplication( int c , int d){
        int m = c*d;

            System.out.println(m);

        }

        public static void division(int d , int c){
        int d1 = d/c;
        System.out.println(d1);
    }

}
