import java.util.HashMap;

public class test {
    
    public static void main(String[] args) {
        
        // 문자열 입력
        String s = "banana";
        HashMap<Character, Integer> map = new HashMap<>();

        // 결과
        int answer[] = new int[s.length()];

        // 중복을 제거하고 저장하는 자료구조 --> Set
        // Set.add() -- 중복 : false, 중복x : true
        // HashMap
        // put() : key 중복되지 않고 마지막 값으로 지정
        
        // 문자열을 한글자씩 접근
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);  // 한글자씩

            //조건 : 중복 여부
            if( map.containsKey(ch) ) {
                //?중복된 위치 - T: 현재 위치
                int last = map.get(ch); // ? : 마지막 중복된 문자의 위치
                answer[i] = i - last;   // i - ? : 가장 가까운 문자 위치
            }else {
                answer[i] = -1;
            }

            map.put(ch, i);        // 마지막 나온 문자의 위치 갱신
        }

        // 결과 출력
        for (int item : answer) {
            System.out.println(item + " ");
        }
    }
}
