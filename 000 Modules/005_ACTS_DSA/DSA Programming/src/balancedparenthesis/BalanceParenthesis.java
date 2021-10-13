package balancedparenthesis;

//Check for balanced paranthesis
import java.util.Scanner;
public class BalanceParenthesis {

    boolean IsBalanced(String str){
        StackUsingArray stackObj = new StackUsingArray(str.length());
        char character;
        char var;
        for(int i=0;i<str.length();i++){
            character=str.charAt(i);
            if(character =='{' || character =='(' || character =='['){
                stackObj.Push(str.charAt(i));
            }
            if(character =='}'||character ==')'||character ==']'){
                if(!stackObj.IsEmpty()) {
            	var=stackObj.Pop();
                if(var=='(' && character==')'){
                    continue;
                }
                else if(var=='{' && character=='}'){
                    continue;
                }
                else if(var=='[' && character==']'){
                    continue;
                }
                else
                    return false;
                }   
            }
            else
            {
            	return false;
            }
            
        }
        return true;
        }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Parenthesis String to check : ");
        String str=sc.next();
        BalanceParenthesis myObj = new BalanceParenthesis();
        if(myObj.IsBalanced(str))
		    System.out.println("Parenthesis are balanced");
        else
            System.out.println("Paranthesis are not balanced");
        sc.close();
    }
}
