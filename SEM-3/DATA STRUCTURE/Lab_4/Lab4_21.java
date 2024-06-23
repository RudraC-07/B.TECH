import java.util.*;

public class Lab4_21{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter position to insert element : ");
    int pos = sc.nextInt();

    System.out.print("Enter element to insert : ");
    int ele = sc.nextInt();

     
    int [] a = {12,23,44,3,22,46};
    int [] temp = new int[a.length+1];

    for(int i=0;i<temp.length;i++){

      if(pos==i){
        temp[i] = ele;
      }

      else if(pos>i){
        temp[i] = a[i];
      }

      else if(pos<i){
        temp[i] = a[i-1];
      }
    }

    for(int i=0;i<temp.length;i++){
      System.out.println("Element ["+i+"] = " +temp[i]);
    }
  }
}