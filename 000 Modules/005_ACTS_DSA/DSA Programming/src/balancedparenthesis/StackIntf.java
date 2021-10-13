package balancedparenthesis;

public interface StackIntf {
	public void Push(char element);
	public char Pop();
	public boolean IsEmpty();
	public boolean IsFull();
}
