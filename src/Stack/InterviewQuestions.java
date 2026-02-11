package Stack;

public class InterviewQuestions {
    /* Interview Based Question */

//    Question 1 - Reverse String with Stack with ArrayList Type
    public static String reverseString(String word){
        Stack normal = new Stack();
        for(int i=0;i<word.length();i++){
            normal.push(word.charAt(i));
        }
        String reverse="";
        for(int i=0; i<word.length();i++){
            reverse+=normal.pop();
        }
        return reverse;

    }


    //Question 2 - Balanced Paranthesis

    public static boolean isBalancedParentheses(String input){
        java.util.Stack<Character> stringStack = new java.util.Stack<>();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='('){
                stringStack.push(input.charAt(i));
            } else if(input.charAt(i)==')'){
                if(stringStack.isEmpty() || stringStack.pop() !='('){
                    return false;
                }
            }
        }



        return stringStack.isEmpty();

    }
}
