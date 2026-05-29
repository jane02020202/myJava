    class Rabbit2 {
        String shape;
        int xPos;
        int yPos;

        void move(int x, int y) {
            this.xPos = x;
            this.yPos = y;
        }
    }

    class HouseRabbit extends Rabbit {
        String mountain;
        void eatWildglass() {
            System.out.println("산토끼가 풀을 먹습니다.");
        }
    }

    public class Code08_02 {
        public static void main(String[] args) {

        }
}