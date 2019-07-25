
public class Variables {
    /**
     * 变量的演示 基本数据类型
     */
    public static void main(String[] args) {
        byte a = 127;
        short b =  32678;
        int c = 12;
        long d = 10000000000L;
        float e = 10.3F;
        double f = 100.0121212;
        char g = 'a';
        boolean h = true;
        boolean h1 = false;

        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(h1);
        System.out.println("-------------------------------------");
        /**
         * 变量未赋值不能使用
         */

         int i;
         i=8;
         System.out.println(i);
         /**********
          * 类型转换
          */
          double ff = 3.14;
          int aa = 7;
          int cc;
          cc = (int)(ff+aa);
          System.out.println(cc);
    }
}