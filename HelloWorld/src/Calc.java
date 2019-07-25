/**
 * 运算符
 */
public class Calc {
    public static void main(String[] args) {
        //字符的加法运算
        int a = 10;
        char b = 'b';
        char c = 'c';
        System.out.println(a+b);
        System.out.println(c+b);
        System.out.println("hello"+"world");
        System.out.println("hello"+10);
        System.out.println("hello"+10+20);
        System.out.println(10+20+"hello");

        int  aa = 10;
        int bb;
        a++;
        System.out.println(a);
        short s = 1;
       // s = s + 1; 报错
        s += 1; //相当于  s = (short)(s + 1) 包含了隐式转换

        System.out.println(s);
    }
}