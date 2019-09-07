import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Title t = new Title();
    System.out.println(t.title);

    Question1 q1 = new Question1();
    System.out.println(q1.question1);

    Scanner scan = new Scanner(System.in);
    
    int i1 = scan.nextInt();
  }
}
