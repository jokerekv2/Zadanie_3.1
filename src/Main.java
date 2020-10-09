public class Main {
    public static void main(String[] args) {
        GraphicTabletPen[] pen = new GraphicTabletPen[2];
        pen[0] = new GraphicTabletPen();
        pen[0].setName("Wacom Pen");
        pen[0].setTiltAngleRecognition(true);
        pen[0].setReadingHeight(5);
        pen[0].setSensitivity(4096);

        pen[1] = new GraphicTabletPen();
        pen[1].setName("X-Pen");
        pen[1].setTiltAngleRecognition(false);
        pen[1].setReadingHeight(6);
        pen[1].setSensitivity(8192);

        System.out.println("Pen's specification:");
        for (GraphicTabletPen graphicTabletPen : pen) {
            System.out.println(graphicTabletPen.toString());
        }


    }
}
