import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> myStack = new Stack();
        ////System.out.println("Enter String");
        char charAtHand;
        while (sc.hasNext()) {
            boolean falseSet = false;



            String input=sc.next();
            if(input == null || "".equals(input)) {
                System.out.println("Null input... true");
                continue;
            }
            //Complete the code


            for(int i=0; i<input.length(); i++) {

                ////System.out.println("Element read : " + elements[i]);
                char element = input.charAt(i);
                switch (element) {
                    case '{':
                    case '[':
                    case '(':
                        //System.out.println("Pushing " + elements[i]);
                        myStack.push(element);
                        break;
                    case ']':
                        if(myStack.isEmpty()) {
                            System.out.println("false");
                            falseSet = true;
                            break;
                        } else {
                            if(myStack.pop() != '[') {
                                System.out.println("false");
                                falseSet = true;
                                break;
                            }
                        }
                        break;
                    case '}':
                        if(myStack.isEmpty()) {
                            System.out.println("false");
                            falseSet = true;
                            break;
                        } else {
                            if(myStack.pop() != '{') {
                                System.out.println("false");
                                falseSet = true;
                                break;
                            }
                        }
                        break;
                    case ')':
                        if(myStack.isEmpty()) {
                            System.out.println("false");
                            falseSet = true;
                            break;
                        } else {
                            if(myStack.pop() != '(') {
                                System.out.println("false");
                                falseSet = true;
                                break;
                            }
                        }
                        break;
                        default: break;
                }

                if(falseSet) {
                    break;
                }
            }


            if(!falseSet) {
                if(myStack.isEmpty()) {
                    //System.out.println("Stack is empty");
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            }





            myStack.clear();
        }
    }
}
