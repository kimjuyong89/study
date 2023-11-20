package tw.problem0104;

import java.util.*;
import java.io.*;

public class Main {
    /*
        4. 단어 뒤집기

            설명
            N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.

            입력
            첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
            두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.

            출력
            N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.

            예시 입력 1
            3
            good
            Time
            Big

            예시 출력 1
            doog
            emiT
            giB
     */

    public void solution(String[] str){

        for (String s : str) {
            System.out.println(new StringBuilder(s).reverse());
        }

    }


    public static void main(String[] args) throws IOException {
        Main main = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        String[] strArr = new String[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            strArr[i] = st.nextToken();
        }

        main.solution(strArr);
    }
}
