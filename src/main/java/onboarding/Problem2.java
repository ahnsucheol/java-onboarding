package onboarding;

import java.util.Stack;

public class Problem2 {
    public static String solution(String cryptogram) {
        String answer = "answer";
        String[] cryptoArr = cryptogram.split("");

        Stack<String> stack = new Stack<String>();

        stack.push(cryptoArr[0]);

        for(int i=1; i < cryptoArr.length; i++) {
            System.out.println(stack);
            if(!cryptoArr[i].equals(stack.peek())){
                stack.push(cryptoArr[i]);
            } else {
                stack.pop();
            }
        }
        System.out.println(stack);

        answer = String.join("",stack);
        return answer;
    }
}
