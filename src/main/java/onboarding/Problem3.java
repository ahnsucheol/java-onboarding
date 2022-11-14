package onboarding;

public class Problem3 {
    public static int solution(int number) {
        int answer = 0;
        for(int i = 1; i <= number; i++){
            String numStr = new String();
            numStr = Integer.toString(i);
            String[] numArr;
            numArr = numStr.split("");
            for (String el : numArr) {
                if(el.equals("3") || el.equals("6") || el.equals("9")){
                    answer++;
                }
            }
        }
        return answer;
    }
}
