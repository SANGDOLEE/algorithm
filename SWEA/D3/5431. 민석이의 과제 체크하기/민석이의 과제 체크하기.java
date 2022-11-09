/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;                            
// double b = 1.0;               
// char g = 'b';
// String var = "ABCDEFG";
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Arrays;
/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	public static void main(String args[]) throws Exception
	{
		  Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();

        for (int test_case = 1; test_case <= t; test_case++) {
            int a=kb.nextInt(); // 총 학생수
            int b=kb.nextInt(); // 제출 한 학생 수

            // 제출 한 사람의 배열
            int[] arr=new int[a];
            for(int i=0; i<b; i++){
                int n=kb.nextInt();
                arr[n-1]=1; // 제출했으면 해당 학생번호(index) = 1;
            }

            // 미제출자 배열
            int[] answer=new int[a-b];
            int n=0;
            for(int i=0; i<a; i++){ // a만큼 반복
                if(arr[i]==0) {
                    answer[n] = i + 1; // 제출안한사람 index를 저장
                    n++;
                }
            }
            Arrays.sort(answer);
            System.out.print("#"+test_case+" ");
            for(int i=0; i<answer.length; i++){
                System.out.print(answer[i]+" ");
            }
            System.out.println();
        }
    }
}