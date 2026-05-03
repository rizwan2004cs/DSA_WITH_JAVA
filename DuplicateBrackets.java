import java.util.Stack;

public class DuplicateBrackets {
    public static void main(String[] args) {
        Stack<Character> store =  new Stack<>();
        String str = "(a+b)+(b+c))";
        boolean flag  = false;
        for(char ch : str.toCharArray()){
            if(!store.isEmpty() && ch == ')'){
                if(store.peek() == '('){
                    flag = true;
                    System.out.println(store); 
                    break;
                }else{
                    while(!store.isEmpty()&&store.peek() != '(')
                        store.pop();
                    System.out.println(store); 
                }
            }else store.push(ch);
                    System.out.println(store); 

        }
        if(flag){
            System.out.println("Duplicate brackets found");
        }else System.out.println("Duplicate brackets not found");
        if(store.peek() == '('){
            System.out.println("and paranthesis is not balanced");
        }

        }
}
