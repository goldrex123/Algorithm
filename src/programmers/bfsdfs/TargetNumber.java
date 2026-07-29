package programmers.bfsdfs;

public class TargetNumber {
    static int[] numbers = {4,1,2,1};
    static int target = 4;
    static int answer = 0;

    public static void main(String[] args) {
        System.out.println(solution(numbers,target));
    }

    public static int solution(int[] numbers, int target) {
        dfs(0, 0);

        return answer;
    }

    private static void dfs(int index, int sum) {
        if(index == numbers.length) {
            if(sum == target) answer++;
            return ;
        }



        dfs(index+1, sum + numbers[index]);
        dfs(index+1, sum - numbers[index]);
    }
}
