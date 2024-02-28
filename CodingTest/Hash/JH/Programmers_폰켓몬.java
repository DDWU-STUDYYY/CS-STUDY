import java.util.*;
class Programmers_폰켓몬 {
    public int solution(int[] nums) {
        int answer = 0;

        Set<Integer> s = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            s.add(nums[i]);
        }

        if(s.size() >= nums.length/2)
            return nums.length/2;
        else
            return s.size();

    }
}

/*
 이렇게 푼 이유는 Set 으로 풀어야 합니다. 왜냐하면 중복되는 것은 하나의 종류로 간주하기 때문이죠 !
 */