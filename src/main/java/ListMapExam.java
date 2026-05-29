import java.util.*;

public class ListMapExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Map<String, String>> list = new ArrayList<>();

        Map<String, String> map = null;

        for (int i = 0 ; i < 3 ; i++) {
            System.out.print("이름 : ");
            String name = scanner.next();

            System.out.print("이메일 : ");
            String email = scanner.next();

            System.out.print("부서 : ");
            String dept = scanner.next();

            map = new HashMap<>();

            map.put("name", name);
            map.put("email", email);
            map.put("dept", dept);

            list.add(map);

            map = null;
        }

        int listSize = list.size();

        System.out.println("저장된 데이터 수 : " + listSize);

        System.out.println("1세대 반복문");

        for (int i = 0 ; i < listSize ; i++) {
            Map<String, String> rMap = list.get(i);

            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("dept : " +rMap.get("dept"));

            rMap = null;

            System.out.println("2세대 반복문");

            for (Map<String, String> rMap2 : list) {
                System.out.println("name : " + rMap.get("name"));
                System.out.println("email : " + rMap.get("email"));
                System.out.println("dept : " +rMap.get("dept"));

                System.out.println("3세대 반복문");

                list.forEach(rMap3 -> {
                    System.out.println("name : " + rMap3.get("name"));
                    System.out.println("email : " + rMap3.get("email"));
                    System.out.println("dept : " + rMap3.get("dept"));

                });

                System.out.println("4세대 반복문");

                list.parallelStream().forEach(rMap4 -> {
                    System.out.println("name : " + rMap4.get("name"));
                    System.out.println("email : " + rMap4.get("email"));
                    System.out.println("dept : " + rMap4.get("dept"));
                });

                System.out.println("1.5세대 반복문");

                Iterator<Map<String, String>> it = list.iterator();

                while (it.hasNext()) {
                    Map<String, String> rMap5 = it.next();

                    System.out.println("name : " + rMap5.get("name"));
                    System.out.println("email : " + rMap5.get("email"));
                    System.out.println("dept : " + rMap5.get("dept"));

                    rMap = null;
                }
            }
        }
    }
}
