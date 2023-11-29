package tw.problem0301;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    /*
        1. 두 배열 합치기

            설명
            오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.

            입력
            첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
            두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
            세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
            네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
            각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.

            출력
            오름차순으로 정렬된 배열을 출력합니다.

            예시 입력 1
            3
            1 3 5
            5
            2 3 6 7 9

            예시 출력 1
            1 2 3 3 5 6 7 9
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] arr1 = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] arr2 = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        for (int i : (solution(N, arr1, M, arr2))) {
            System.out.print(i + " ");
        }

    }

    private static List<Integer> solution(int N, int[] arr1, int M, int[] arr2) {
        List<Integer> answer = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;

        while (p1 < N && p2 < M) {
            if (arr1[p1] < arr2[p2]) answer.add(arr1[p1++]);
            else answer.add(arr2[p2++]);
        }
        while (p1 < N) {
            answer.add(arr1[p1++]);
        }
        while (p2 < M) {
            answer.add(arr2[p2++]);
        }

        return answer;
    }
}
