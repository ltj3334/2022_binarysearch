import java.util.Arrays; 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


/* 
입력 예시
3  // 입력 개수 n 
1 2 3 4 5 // 첫번째 입력 배열
1 2 // 첫번쨰 입력 배열에서 찾아야할 숫자 배열, 각 숫자를 BinarySearch로 입력배열에서 찾은 후 입력배열의 인덱스를 출력 // 이하 동일 순서
10 9 8 7 5 4 3 1
3 4 5 
3 2 3 101 10 1010 101 19 13 40 
4 5 6 7 8 10

출력 예시
0 1 // 첫번째 케이스 출력, 1은 입력 배열에서 0번, 2는 1번
6 5 4 // 두번째 케이스 출력, 3은 입력 배열에서 6번, 4는 5번, 5는 4번
-1 -1 -1 -1 -1 4 // 세번쨰 케이스 출력, 4 ~ 8 은 입력 배열에서 존재하지 않아 -1 출력, 10은 입력 배열에서 4번 
*/

public class BinarySearch {
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // test case

        while(n-- > 0) {
            String[] readInputString = br.readLine().split(" ");
            int intArr[] = new int[readInputString.length]; // input list
            String[] targetString = br.readLine().split(" ");
            int targetArr[] = new int[targetString.length]; // target list

            for (int i = 0; i < readInputString.length; i++) {
			    intArr[i] = Integer.parseInt(readInputString[i]);
            } 
            Integer[] integerArr = Arrays.stream(intArr).boxed().toArray(Integer[]::new);

            for (int i = 0; i < targetString.length; i++) {
                targetArr[i] = Integer.parseInt(targetString[i]);

                System.out.print(Arrays.asList(integerArr).indexOf(targetArr[i])+" "); 
            } 
            System.out.println();
        }
    } 
    public static int myBinarySearch(int arr[], int key) {
        int mid;
        int left = 0;
        int right = arr.length - 1;
 
        while (left <= right) {
            /* 코드 입력*/
        }
        /* 코드 입력*/
    }
}