
import java.io.*;
import java.util.*;

public class prompt {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] numbers=new int[N];
        // 파일명들 입력 받기
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(numbers);

        for (int data : numbers) {
            sb.append(data+"\n");
        }
        System.out.println(sb);
        br.close();

    }
}

/**
 *시간 초과 방지하는 방법
 * nt[]가 Integer[]보다 메모리를 덜 사용합니다 (객체 오버헤드가 없음)
 * StringBuilder는 문자열을 한 번에 만들어서 출력하므로 BufferedWriter보다 빠릅니다
 * 각각의 숫자마다 write()를 호출하는 대신 한 번의 출력으로 처리합니다
 */






