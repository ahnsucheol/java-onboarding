package onboarding;

import java.util.ArrayList;
import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        // 각 자리수 합계 및 곱, 둘 중 최댓값 
        int sum, mul, max;

        //[포비 최댓값, 크롱 최댓값]
        List<Integer> maxs = new ArrayList<>();

        // 각 자리수를 넣을 리스트 -> [9,7]
        List<Integer> nums;

        // [포비, 크롱] -> [[97,98], [197,198]]
        List<List<Integer>> numList = new ArrayList<>();
        numList.add(pobi);
        numList.add(crong);

        Boolean bol = false;

        for (List<Integer> list : numList) {
            if(list.size() != 2 || list.get(0) < 1 || list.get(1) > 400 
            || list.get(1) - list.get(0) != 1
            || list.get(0) % 2 != 1 || list.get(1) % 2 != 0) {
                bol = true;
                break;
            }

            max = 0;
            for (int num : list) {
                nums = new ArrayList<>();

                while(num != 0){
                    nums.add(num % 10);
                    num /= 10;
                }
                
                sum = 0;
                for (int el : nums) {
                    sum += el;
                }

                if(sum > max){
                    max = sum;
                }

                mul = 1;
                for (int el : nums) {
                    mul *= el;
                }

                if(mul > max){
                    max = mul;
                }
            }
            maxs.add(max);
        }

        if(bol){
            answer = -1;
        } else{
            if(maxs.get(0) > maxs.get(1)){
                answer = 1;
            } else if(maxs.get(0) < maxs.get(1)){
                answer = 2;
            } else {
                answer = 0;
            }
        }
        return answer;
    }
}