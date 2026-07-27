// 프로그래머스 - 완주하지 못한 선수

package programmers.hash;

import java.util.HashMap;
import java.util.Map;

public class DontCompletionPlayer {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};


        System.out.println(solution(participant, completion));

    }

    public static String solution(String[] participant, String[] completion) {
        Map<String,Integer> player = new HashMap<String,Integer>();

        for(String person: participant) {
            player.put(person, player.getOrDefault(person, 0) + 1);
        }

        for(String completePerson: completion) {
            player.put(completePerson, player.get(completePerson) - 1);
            if(player.get(completePerson) == 0) player.remove(completePerson);
        }

        return player.keySet().stream().findFirst().get();
    }
}