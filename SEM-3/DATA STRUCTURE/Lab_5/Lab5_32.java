import java.util.*;

public class Lab5_32 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter size of array : ");
    int n = sc.nextInt();
    String [] a = new String[n];

    for(int i=0;i<n;i++){
      System.out.print("Enter elements at ["+i+"] : ");
      a[i] = sc.next();
    }

    int number = (int)(Math.random()*(n));

    System.out.println("Word = "+a[number]);

    System.out.print("Enter a Word : ");
    String word = sc.next();
    int x = 0;

    for(int i=0;i<a[number].length();i++){
      for(int j=0;j<a[number].length();j++){
        if(word.charAt(0)==a[number].charAt(0)){
          x++;
        }
      }
    }

    if(x==1){
      System.out.println("Anagram");
    }
    else{
      System.out.println("not");
    }
  }
}
