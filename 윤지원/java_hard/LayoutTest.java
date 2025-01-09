import javax.swing.*;
import java.awt.*;

public class LayoutTest extends JFrame {
    private JButton[] buttons;

    public LayoutTest() {
        // 여기에 코드를 작성하세요
        // 1. 프레임의 배치관리자를 null로 설정
        // 2. 버튼들을 생성하고 위치와 크기를 직접 지정
        // 3. 프레임에 버튼들을 추가

        setLayout(null); //1. 배치관리자 null 로 설정
        buttons=new JButton[4];
       // 버튼들의 텍스트 설정
        String[] buttonTexts = {"첫 번째", "두 번째", "세 번째", "네 번째"};
        //버튼들의 위치와 크기를 직접 지정
        int[][] positions={
                {10, 10, 100, 30},    // x, y, width, height for 첫 번째
                {120, 10, 100, 30},   // 두 번째
                {10, 50, 100, 30},    // 세 번째
                {120, 50, 100, 30}    // 네 번째
        };
        //2. 버튼 생성 및 위치, 크기 설정
        for (int i=0; i<buttons.length;i++){
            buttons[i]=new JButton(buttonTexts[i]);
            buttons[i].setBounds(positions[i][0],positions[i][1],
                    positions[i][2],positions[i][3]);
            add(buttons[i]); //3. 프레임에 버튼 추가
        }







    }

    public static void main(String[] args) {
        LayoutTest frame = new LayoutTest();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}