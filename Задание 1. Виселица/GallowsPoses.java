public class GallowsPoses {
    private int poseLevel = 1;

    public GallowsPoses() {}

    public int getPoseLevel() {
        return poseLevel;
    }

    public void increasePoseLevel() {
        poseLevel++;
    }

    public void printPose() {
        switch (poseLevel) {
            case(1):
                pose_1();
                break;
            case(2):
                pose_2();
                break;
            case(3):
                pose_3();
                break;
            case(4):
                pose_4();
                break;
            case(5):
                pose_5();
                break;
            case(6):
                pose_6();
                break;
            case(7):
                pose_7();
                break;
            case(8):
                pose_8();
                break;
            case(9):
                pose_9();
                break;
        }
    }

    private void pose_1() {
        System.out.println();
        System.out.println(" .________ ");
        System.out.println(" |         ");
        System.out.println(" |         ");
        System.out.println(" |         ");
        System.out.println(" |         ");
        System.out.println("_|_        ");
    }

    private void pose_2() {
        System.out.println();
        System.out.println(" .________ ");
        System.out.println(" |/        ");
        System.out.println(" |         ");
        System.out.println(" |         ");
        System.out.println(" |         ");
        System.out.println("_|_        ");
    }

    private void pose_3() {
        System.out.println();
        System.out.println(" .________ ");
        System.out.println(" |/    |   ");
        System.out.println(" |         ");
        System.out.println(" |         ");
        System.out.println(" |         ");
        System.out.println("_|_        ");
    }

    private void pose_4() {
        System.out.println();
        System.out.println(" .________ ");
        System.out.println(" |/    |   ");
        System.out.println(" |     o   ");
        System.out.println(" |         ");
        System.out.println(" |         ");
        System.out.println("_|_        ");
    }

    private void pose_5() {
        System.out.println();
        System.out.println(" .________ ");
        System.out.println(" |/    |   ");
        System.out.println(" |     *   ");
        System.out.println(" |     0   ");
        System.out.println(" |         ");
        System.out.println("_|_        ");
    }

    private void pose_6() {
        System.out.println();
        System.out.println(" .________ ");
        System.out.println(" |/    |   ");
        System.out.println(" |     *   ");
        System.out.println(" |    /0   ");
        System.out.println(" |         ");
        System.out.println("_|_        ");
    }

    private void pose_7() {
        System.out.println();
        System.out.println(" .________ ");
        System.out.println(" |/    |   ");
        System.out.println(" |     *   ");
        System.out.println(" |    /0|  ");
        System.out.println(" |         ");
        System.out.println("_|_        ");
    }

    private void pose_8() {
        System.out.println();
        System.out.println(" .________ ");
        System.out.println(" |/    |   ");
        System.out.println(" |     *   ");
        System.out.println(" |    /0|  ");
        System.out.println(" |     |   ");
        System.out.println("_|_        ");
    }

    private void pose_9() {
        System.out.println();
        System.out.println(" .________ ");
        System.out.println(" |/    |   ");
        System.out.println(" |     *   ");
        System.out.println(" |    /0|  ");
        System.out.println(" |    /|   ");
        System.out.println("_|_        ");
    }
}
