public class Code_test {
    public static void main(String[] args) {

       String str;
       int num1;
       double num2;

       str = "1234";
       num1 = Integer.parseInt(str);
       System.out.println("문자열 ==> 정수 :" +num1);

       str = "3.14";
       num2 = Double.parseDouble(str);
       System.out.println("문자열 ==> 실수 :" +num2);
    }
}
