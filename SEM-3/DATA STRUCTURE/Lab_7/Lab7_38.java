import java.util.*;

class Stack{
  int top;
  int size;
  int [] arr;

  Stack(int size){
    top=-1;
    arr = new int[size];
    this.size = size;
  }

  void push(int element){
    if(top>=size-1){
      System.out.println("Stack Overflow.");
      return;
    }

    else{
      top++; 
      arr[top] = element;
    }
  }

  int pop(){
    if(top==-1){
      System.out.println("Stack Underflow.");
      return -1;
    }

    else{
      top--;
      return(arr[top+1]); 
    }
  }

  int peep(){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Location to display : ");
    int a = sc.nextInt();

    if(top-a+1<0){
      System.out.println("Stack Underflow.");
      return -1;
    }
    return arr[top-a+1];
  }

  void display(){
    for(int i=0;i<=top;i++){
      System.out.println(arr[i]);
    }
  }
  
}
public class Lab7_38 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter size of array : ");
    int n = sc.nextInt();
    
    Stack s1 = new Stack(n);

    System.out.println();
    System.out.println("Press 1 to push.");
    System.out.println("Press 2 to pop.");
    System.out.println("Press 3 to peep.");
    System.out.println("Press 4 to change.");
    System.out.println("Press 5 to display.");
    System.out.println("Press -1 to exit.");
    System.out.println();

    while(true){

      System.out.print("Enter Choice : ");
      int choice = sc.nextInt();

      switch (choice) {
        case 1:
          System.out.print("Enter element to push : ");
          int element = sc.nextInt();
          s1.push(element);
          break;
        
        case 2:
          int x = s1.pop();
          if(x>-1){
            System.out.println("Poped element : "+x);
          }
          break;

          case 3:
            System.out.println(s1.peep());
        case 5:
          s1.display();
          break;

        case -1:
          return;

        default:
          break;
      }
    }
  }
}
