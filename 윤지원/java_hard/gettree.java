import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;

public class gettree {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n + 1];
        //각각 입력 배열의 원래 인덱스와 정렬된 인덱스를 저장
        HashMap<Integer, Integer> B = new HashMap<>(); // 원래 인덱스 저장
        HashMap<Integer, Integer> C = new HashMap<>(); // 정렬된 인덱스 저장

        // 원래 배열 입력 및 인덱스 저장
        for (int i = 1; i <= n; i++) {
            array[i] = Integer.parseInt(br.readLine());
            B.put(array[i], i); // 값과 원래 인덱스를 저장
        }

        // 정렬된 배열 생성 (원본 배열 복사)
        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray); //정렬하기

        // C 해시맵: 정렬된 배열의 인덱스 저장
        for (int i = 1; i <= n; i++) {
            C.put(sortedArray[i], i);
        }

        // 최대 이동 거리 계산
        int max = 0; //이동 거리의 최댓값 저장
        for (int i = 1; i <= n; i++) {
            int originalIndex = B.get(sortedArray[i]);
            int sortedIndex = C.get(sortedArray[i]);
            max = Math.max(max, originalIndex - sortedIndex); // 원래 인덱스(B)- 정렬된 인덱스(C)
            //최대 이동 거리 찾기
            //Math.max() -->이동 거리의 최댓값 갱신
        }

        // 결과 출력
        bw.write(Integer.toString(max + 1));//최악의 이동거리
        //첫 번째 패스에서 가장 오른쪽 위치에 있는 가장 큰 값이 제자리를 찾아가고
        //두 번째 패스에서는 두 번째로 큰 값이 제자리를 찾아가는 식으로 진행
        //최종적으로 max + 1번의 패스가 있어야 모든 요소가 제 위치에 오게 됨
        bw.flush();
        bw.close();
    }
}
