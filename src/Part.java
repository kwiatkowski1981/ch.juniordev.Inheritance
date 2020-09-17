public class Part {

  private   int idNumber;
  private   String producer;
  private   String type;
  private   String serialNumber;


    public Part(int idNumber, String producer, String type, String serialNumber) {
        this.idNumber = idNumber;
        this.producer = producer;
        this.type = type;
        this.serialNumber = serialNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void printInfo() {
        System.out.println(getIdNumber() + " " + getProducer() + " " + getType() + " " + getSerialNumber());
    }
}
