public class Tire extends Part{

   private int size;
   private double width;

    public Tire(int idNumber, String producer, String type, String serialNumber, int size, double width) {
        super(idNumber, producer, type, serialNumber);
        this.size = size;
        this.width = width;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void printInfo(){

        System.out.println(getIdNumber() + " " + getProducer() + " " + getType()
                + " " + getSerialNumber() + " " + getSize() + " " + getWidth());
    }
}
