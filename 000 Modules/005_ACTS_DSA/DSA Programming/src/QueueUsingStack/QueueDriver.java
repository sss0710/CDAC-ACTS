import java.util.*;

public class QueueDriver {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter queue size : ");
        int size = sc.nextInt();
        int var;
        StackUsingArray Obj1 = new StackUsingArray(size);
        StackUsingArray Obj2 = new StackUsingArray(size);
        System.out.print("Enter elements in Queue : ");
        for(int i=0;i<size;i++){
            var=sc.nextInt();
            Obj1.Push(var);
        }
        for(int i=0;i<size;i++){
            var=Obj1.Pop();
            Obj2.Push(var);
        }
        System.out.print("Elements in Queue : ");
        for(int i=0;i<size;i++){
            var=Obj2.Pop();
            System.out.print(var+" ");
        }
        sc.close();
    }
}
