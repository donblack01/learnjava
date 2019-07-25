import java.util.Scanner;

public class Selection {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // int x = sc.nextInt();
    // System.out.println("请输入第一个整数：");
    // int x = sc.nextInt();
    // System.out.println("请输入第二个整数：");
    // int y = sc.nextInt();
    // System.out.println("请输入第三个整数：");
    // int z = sc.nextInt();
    sc.close();
    // System.out.println("和为：");
    // System.out.println(x+y);
    // String sd = "sadfasdf";
    // System.out.println(sd);
    // int a = 10, b = 20;
    // if (a == b) {
    // System.out.println("相等");
    // } else if (a > b) {
    // System.out.println("a大于b");
    // } else {
    // System.out.println("a小于bb");
    // }1

    // int max = ((x > y) ? x : y) >z ? ((x > y) ? x : y) :z ;
    // System.out.println(max);

    // switch (x) {
    // default:
    // System.out.println("error");
    // break;
    // case 1:
    // System.out.println(1);
    // break;
    // case 2:
    // System.out.println(2);
    // break;

    // }
    /**
     * 金字塔
     */
    int a = 5;
    for (int i = 1; i <= a; i++) {
      for (int k = 1; k <= a-i;k++){
        System.out.print(" ");
      }
      for (int j = 1; j <= 2*i -1 ; j++) {
        System.out.print("*");
      }
      System.out.println();
    }



    System.out.println();
    System.out.println();
    System.out.println();

    
// /**
//  * 倒金字塔
//  */

for (int i = a; i >= 1; i--) {
    for (int j = a; j>i; j--){
      System.out.print(" ");
    }
    for (int k =1; k <=i*2 -1; k++){
      System.out.print("*");
    }
    System.out.println();
}



System.out.println();
System.out.println();
System.out.println();
/**
 * 空心金字塔
 */

  for (int i = 1; i <= a; i++) {
      for (int j = 1;j <= a -i; j++){
        System.out.print(" ");
      }
      for (int k =1; k <= i*2 -1; k++){

        if (k ==1 || k == i*2 -1 ){
          System.out.print("*");

        }else{
          System.out.print(" ");
        }
      }
      System.out.println();

  }

  System.out.println();
  System.out.println();
  System.out.println();
  /**
   * 倒立空心金字塔
   */


  for (int i = a; i >= 1; i--) {
    for (int j = a;j >i; j--){
      System.out.print(" ");
    }
    for (int k =1; k <= i*2 -1; k++){

      if (k ==1 || k == i*2 -1 ){
        System.out.print("*");

      }else{
        System.out.print(" ");
      }
    }
    System.out.println();

}






System.out.println();
System.out.println();
System.out.println();

/**
 * 空心菱形
 */
for (int i = 1; i <= a; i++) {
  for (int j = 1;j <= a -i; j++){
    System.out.print(" ");
  }
  for (int k =1; k <= i*2 -1; k++){

    if (k ==1 || k == i*2 -1 ){
      System.out.print("*");

    }else{
      System.out.print(" ");
    }
  }
  System.out.println();

}
for (int i = a-1; i >= 1; i--) {
  for (int j = 1;j <=a-i; j++){
    System.out.print(" ");
  }
  for (int k =1; k <= i*2 -1; k++){

    if (k ==1 || k == i*2 -1 ){
      System.out.print("*");

    }else{
      System.out.print(" ");
    }
  }
  System.out.println();

}






System.out.println();
System.out.println();
System.out.println();

for (int i = 1; i <= a; i++) {
  for (int k = 1; k <= a-i;k++){
    System.out.print(" ");
  }
  for (int j = 1; j <= 2*i -1 ; j++) {
    System.out.print("*");
  }
  System.out.println();
}

for (int i = a-1; i >= 1; i--) {
  for (int j = 1; j<=a-i; j++){
    System.out.print(" ");
  }
  for (int k =1; k <=i*2 -1; k++){
    System.out.print("*");
  }
  System.out.println();
}
}
}