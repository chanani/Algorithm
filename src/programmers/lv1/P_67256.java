package programmers.lv1;

import java.util.Arrays;

public class P_67256 {

    // 문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/67256
    // 내가 작성한 코드

    public String solution(int[] numbers, String hand) {
        String answer = "";
        String before = "";
        // 필요한 데이터 : 오른손, 왼손의 마지막 위치
        // 거리 : 마지막 위치와 비교할 수 거리를 저장하는 collection
        int[] L = {0, 0}; // 왼손 위치 초기값
        int[] R = {2, 0}; // 오른손 위치 초기값

        for(int number : numbers){
            int[] pointer = cal(number); // number의 위치
            int LP = Math.abs(L[0]- pointer[0])
                    + Math.abs(L[1] - pointer[1]); // 거리 비교를 위해 버튼 위치와 마지막 왼손 위치의 절대값
            int RP = Math.abs(R[0] - pointer[0])
                    + Math.abs(R[1] - pointer[1]); // 거리 비교를 위해 버튼 위치와 마지막 오른손 위치의 절대값

            if(number == 1 || number == 4 || number == 7){ // 왼손만 움직임
                answer += "L";
            } else if (number == 3 || number == 6 || number == 9){  // 오른손만
                answer += "R";
            } else if (number == 2 || number == 5 || number == 8 || number == 0){ // 가운데줄 번호
                if (before.equals("") && hand.equals("left")){ // 최초 입력 : 왼손일 경우 왼손
                    answer += "L";
                } else if(before.equals("") && hand.equals("right")){ // 최초 입력 : 오른손일 경우 오른손
                    answer += "R";
                } else { // 최초 입력이 아닐 경우

                    if(LP > RP) { // 왼손의 거리가 오른손의 거리보다 멀 때 오른손 입력
                        answer += "R";
                    } else if (LP < RP) { // 오른손의 거리가 왼손의 거리보다 멀 때 왼손 입력
                        answer += "L";
                    } else if (LP == RP && hand.equals("right")) { // 두 손의 위치가 같을 때 오른손 입력
                        answer += "R";
                    } else if (LP == RP && hand.equals("left")) { // 두 손의 위치가 같을 때 왼손 입력
                        answer += "L";
                    }
                }
            }

            before = answer.substring(answer.length() - 1); // 마지막으로 등록된 손
            if (before.equals("R")){ // 오른손일 경우 오른 손의 좌표 입력
                R = cal(number);
            } else if (before.equals("L")){ // 왼손일 경우 왼손 좌표 입력
                L = cal(number);
            }
        }


        return answer;
    }

    public static int[] cal(int number){ // 좌표 계산 메서드
        int[] answer = new int[2];

        switch (number){
            case 1 :
                answer[0] = 0;
                answer[1] = 3;
                break;
            case 2 :
                answer[0] = 1;
                answer[1] = 3;
                break;
            case 3 :
                answer[0] = 2;
                answer[1] = 3;
                break;
            case 4 :
                answer[0] = 0;
                answer[1] = 2;
                break;
            case 5 :
                answer[0] = 1;
                answer[1] = 2;
                break;
            case 6 :
                answer[0] = 2;
                answer[1] = 2;
                break;
            case 7 :
                answer[0] = 0;
                answer[1] = 1;
                break;
            case 8 :
                answer[0] = 1;
                answer[1] = 1;
                break;
            case 9 :
                answer[0] = 2;
                answer[1] = 1;
                break;
            case 0 :
                answer[0] = 1;
                answer[1] = 0;
                break;
        }

        return answer;
    }

    public static void main(String[] args) {
        P_67256 p = new P_67256();
        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand = "left";
        System.out.println(p.solution(numbers, hand));
    }
}
