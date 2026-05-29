public class Exam02 {
    // Exam02라는 이름의 클래스 정의

    public static void main(String[] args) {
        // 프로그램의 시작점인 메서드 선언, JVM은 이 메서드부터 실행

        String log = "127.0.0.1 - frank [10/Oct/2000:13:55:36 -0700] \"GET /apache_pb.gif HTTP/1.0\" 200";
        // 로그 변수 선언

        int start = log.indexOf( "/", log.indexOf("\""));
        // 경로 시작점인 /의 위치 찾음.
        // log.indexOf("\"") - 문자열에서 첫 번째 큰따옴표(")가 나오는 인덱스 번호 찾음
        // log.indexOf("/")- 앞에서 찾은 큰 따옴표 위치부터 검색을 시작하여, 그 뒤에 나오는 첫 번째 슬래시의 위치를 찾아 start 변수에 저장
        // 여기서 start는 /apache_pb.gif의 / 인덱스가 됨.

        int end = log.indexOf(" ", start + 1);
        // 경로의 끝 지점을 찾음
        // Start + 1의 위치(즉, 슬래시 바로 다음 문자)부터 검색을 시작하여, 경로 뒤에 나오는 첫 번째 공백(" ") 문자의 위치를 찾아 end 변수에 저장
        // 공백은 HTTP/1.0 앞에 있는 공백을 의미

        String res = log.substring(start, end);
        // 메서드를 사용하여 문자열을 자름
        // Start 위치부터 end 위치 직전까지의 문자열을 추출 즉, /apache_pb.gif 부분이 추출되어 res 변수에 담김.

        System.out.println(res);
        // 추출한 경로 출력
    }
}
