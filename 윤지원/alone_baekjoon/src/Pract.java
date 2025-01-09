public class Pract {  // 클래스 이름은 파일 이름과 일치해야 합니다.
    public static void main(String[] args) {
        int x=100;
        double y= 123.4;
        boolean b=false;
        System.out.println(b);  // 출력: abcghidef
    }
}

public class Test{
    public static void main(String[] args) {
        int[] array=new int[10];
        int i= array[10]; // try,catch 블록을 활용하여 예외를 처리해라
    }
}
try{
    int n= Integer.parseInt("abc");
    System.out.println("try");
}catch(NumberFormatException e ){
    System.out.println("숫자 형식 오류")
}
finally{
    System.out.println("finally")
        }