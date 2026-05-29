    abstract class Rabbit5 {
        int xPos;
        int yPos;

        void main(int x, int y) {
            this.xPos = x;
            this.yPos = y;
        }

        abstract void sleep();
    }

    class HouseRabbit5 extends Rabbit5 {
        @Override
        void sleep() {
            System.out.println("집토끼가 우리에서 잠자고 있습니다.");
        }
    }

    class MountainRabbit5 extends Rabbit5 {
        @Override
        void sleep() {
            System.out.println("산토끼가 굴속에서 잠자고 있습니다.");
        }
    }

    public class Code08_08 {
        public static void main (String[] args) {
            HouseRabbit5 hRabbit5 = new HouseRabbit5();
            MountainRabbit5 mRabbit5 = new MountainRabbit5();

            hRabbit5.sleep();
            mRabbit5.sleep();
        }
}