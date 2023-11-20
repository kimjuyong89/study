package tw.problem0106;

import java.util.*;
import java.io.*;

public class Main {

    /*
        6. 중복문자제거

            설명
            소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
            중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.

            입력
            첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.

            출력
            첫 줄에 중복문자가 제거된 문자열을 출력합니다.

            예시 입력 1
            ksekkset

            예시 출력 1
            kset
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Main main = new Main();
        System.out.println(main.solution(st.nextToken()));

    }

    private String solution(String str) {
        String result = "";

        int count = 0;
        for (char c : str.toCharArray()) {
            if (count == 0) result += c;

            for (int i = 0; i < count; i++){
                if (c == str.charAt(i)) {
                    break;
                }
                if (i == count-1) result += c;

            }
            count++;

        }

        return result;
    }

}
