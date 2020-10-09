public class GraphicTabletPen {
    private String name;
    private int sensitivity;
    private boolean tiltAngleRecognition;
    private int readingHeight;

    GraphicTabletPen() {};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSensitivity() {
        return sensitivity;
    }

    public void setSensitivity(int sensitivity) {
        this.sensitivity = sensitivity;
    }

    public boolean isTiltAngleRecognition() {
        return tiltAngleRecognition;
    }

    public void setTiltAngleRecognition(boolean tiltAngleRecognition) {
        this.tiltAngleRecognition = tiltAngleRecognition;
    }

    public double getReadingHeight() {
        return readingHeight;
    }

    public void setReadingHeight(int readingHeight) {
        this.readingHeight = readingHeight;
    }

    @Override
    public String toString() {
        return  "Pen name: " + name + "\n" +
                "Pen sensivity: " + sensitivity + "\n" +
                "Pen tilt angle recognition: " + tiltAngleRecognition + "\n" +
                "Pen reading height: " + readingHeight + " mm" + "\n";
    }
}
