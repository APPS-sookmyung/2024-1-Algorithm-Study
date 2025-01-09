/*문제:
    이 문제는 검색 결과가 먼저 주어졌을 때, 패턴으로 뭘 쳐야 그 결과가 나오는지를 출력하는 문제이다. 패턴에는 알파벳과 "." 그리고 "?"만 넣을 수 있다. 가능하면 ?을 적게 써야 한다. 그 디렉토리에는 검색 결과에 나온 파일만 있다고 가정하고, 파일 이름의 길이는 모두 같다.

입력
첫째 줄에 파일 이름의 개수 N이 주어진다. 둘째 줄부터 N개의 줄에는 파일 이름이 주어진다. N은 50보다 작거나 같은 자연수이고 파일 이름의 길이는 모두 같고 길이는 최대 50이다. 파일이름은 알파벳 소문자와 '.' 로만 이루어져 있다.

처리
들어온 문자열들끼리 0번 위치부터 문자열의 길이까지  비교한다. 문자가 달라지는 부분부터 확인해서 그 위치를 파악한다. 그 다음 자리를 비교하고, 문자열들끼리 하나라도 달라도 표시한다.
문자열의 한 위치에서 전부 다 같은 문자이면 넘어간다.
체크한 부분에 ? 자리를 넣은 채 출력한다.
만약 N 이 1이면 입력된 문자열을 그대로 출력하면 된다.

출력
첫째 줄에 패턴을 출력하면 된다.

 */
import java.util.Scanner;
public class prompt {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int N= sc.nextInt();
        sc.nextLine();

        String[] files= new String[N];
        // 파일명들 입력 받기
        for (int i = 0; i < N; i++) {
            files[i] = sc.nextLine();
        }
        // N이 1인 경우 입력된 문자열 그대로 출력
        if (N == 1) {
            System.out.println(files[0]);
            return;
        }
        // 첫 번째 파일명의 길이 (모든 파일명의 길이가 같음)
        int length = files[0].length();

        // 결과 패턴을 저장할 StringBuilder
        StringBuilder pattern = new StringBuilder();

        // 각 위치별로 문자들을 비교
        for (int pos = 0; pos < length; pos++) {
            char currentChar = files[0].charAt(pos);
            boolean isDifferent = false;

            // 모든 파일명의 현재 위치 문자를 비교
            for (int i = 1; i < N; i++) {
                if (files[i].charAt(pos) != currentChar) {
                    isDifferent = true;
                    break;
                }
            }

            // 차이가 있으면 '?', 없으면 해당 문자 추가
            if (isDifferent) {
                pattern.append('?');
            } else {
                pattern.append(currentChar);
            }
        }

        // 결과 출력
        System.out.println(pattern.toString());

        sc.close();
    }
}






