import java.util.Stack;

public class BalancedBracketsNew {
    public static void main(String[] args) {
        Stack<Character> store =  new Stack<>();
        String str = "({[(a+b)+(b+c)]})";
        boolean flag = false;
        for(char ch : str.toCharArray()){
            if(ch == ')' || ch == '}' || ch  == ']'){
                if(!store.isEmpty()){
                    if(ch == ')'){
                        if(store.peek() != '(')
                        {
                            flag = true;
                                break;
                        }else{
                            store.pop();
                        }
                    }else if(ch == '}'){
                        if(store.peek() != '{')
                        {
                            flag = true;
                                break;
                        }else{
                            store.pop();
                        }
                    }else{
                        if(store.peek() != '[')
                        {
                            flag = true;
                                break;
                        }else{
                            store.pop();
                        }
                    }
                }
                else{
                    flag = true;
                    break;
                }
            }else if(ch == '(' || ch == '{' || ch == '['){
                store.push(ch);
            }
        }
        if(flag || !store.isEmpty()){
            System.out.println("Brackets not balanced");
        }else{
            System.out.println("Brackets balanced");
        }
    }
}
