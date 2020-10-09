public class Main {
    public static void main(String[] args) {
        GraphicTabletPen[] pen = new GraphicTabletPen[2];
        pen[0] = new GraphicTabletPen("Wacom Pen", 4096, true, 5);
        pen[1] = new GraphicTabletPen("X-Pen", 8192, false, 6);

        System.out.println("Pen's specification:");
        for (GraphicTabletPen graphicTabletPen : pen) {
            System.out.println(graphicTabletPen.toString());
        }


    }
}
