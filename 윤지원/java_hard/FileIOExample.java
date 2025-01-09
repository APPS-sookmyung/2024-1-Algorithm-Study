import java.io.*;

public class FileIOExample {
    public static void main(String[] args) {
        // 바이너리 데이터 쓰기 및 읽기
        //try 블록 내에서 파일 스트림을 선언
        try (FileOutputStream fos = new FileOutputStream("binaryData.dat");
             FileInputStream fis = new FileInputStream("binaryData.dat")) {

            // 바이너리 데이터 쓰기
            byte[] binaryData = {10, 20, 30, 40, 50};
            fos.write(binaryData);
            System.out.println("바이너리 데이터가 파일에 저장되었습니다.");

            // 바이너리 데이터 읽기
            int byteRead;
            System.out.print("파일에서 읽은 바이너리 데이터: ");
            while ((byteRead = fis.read()) != -1) {
                System.out.print(byteRead + " ");
            }
            System.out.println();
        } catch (IOException e) { //IOException을 처리
            e.printStackTrace();
        }

        // 문자 데이터 쓰기 및 읽기 :FileWriter, FileReader
        try (FileWriter writer = new FileWriter("textData.txt");
             FileReader reader = new FileReader("textData.txt")) {

            // 문자 데이터 쓰기
            String text = "Hello, Java File IO!";
            writer.write(text);
            System.out.println("문자 데이터가 파일에 저장되었습니다.");

            // 문자 데이터 읽기
            int charRead;
            System.out.print("파일에서 읽은 문자 데이터: ");
            while ((charRead = reader.read()) != -1) {
                System.out.print((char) charRead);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
