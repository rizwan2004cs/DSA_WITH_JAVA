import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        Stack<Character> store =  new Stack<>();
        String str = "({[(a+b)+(b+c)]}) ";
        boolean flag = false;
        for(char ch : str.toCharArray()){
            if(ch == ')' || ch == '}' || ch  == ']'){
                if(!store.isEmpty()){
                    if(ch == ')'){
                        while(!store.isEmpty() && store.peek() != '(')
                            store.pop();
                    }else if(!store.isEmpty() && ch == '}'){
                        while(!store.isEmpty() && store.peek() != '{')
                            store.pop();
                    }else{
                        while(!store.isEmpty() && store.peek() != '[')
                            store.pop();
                    }if(store.isEmpty()){
                                flag = true;
                                break;
                    }else
                        store.pop();
                        System.out.println(store);
                }
                else{
                    flag = true;
                    break;
                }
            }else{
                store.push(ch);
                System.out.println(store);
            }
        }
        if(flag || !store.isEmpty()){
            System.out.println("Brackets not balanced");
        }else{
            System.out.println("Brackets balanced");
        }
    }
}
