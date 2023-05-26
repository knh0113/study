import java.util.Scanner;

public class test6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();

    System.out.printf("A+B=%d", A+B);
    System.out.printf("A-B=%d", A-B);
    System.out.printf("AxB=%d", A*B);
    System.out.printf("A%B=%f",(double)A/B);


  }
  
}
