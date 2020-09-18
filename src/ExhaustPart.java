public class ExhaustPart extends Part{

   private boolean europeanEmissionStandard;


    public ExhaustPart(int idNumber, String producer, String type, String serialNumber, boolean europeanEmissionStandard) {
        super(idNumber, producer, type, serialNumber);
        this.europeanEmissionStandard = europeanEmissionStandard;
    }

    public boolean isEuropeanEmissionStandard() {
        return europeanEmissionStandard;
    }

    public void setEuropeanEmissionStandard(boolean europeanEmissionStandard) {
        this.europeanEmissionStandard = europeanEmissionStandard;
    }


    @Override
    public String toString() {
        return getIdNumber() + " " + getProducer() + " " + getType() + " " + getSerialNumber() + " " + isEuropeanEmissionStandard();
    }

//    public void printInfo(){
//        System.out.println(getInfo());
//    }

//    String getInfo(){
//        return getIdNumber() + " " + getProducer() + " " + getType() + " " + getSerialNumber() + " " + isEuropeanEmissionStandard();
//    }

}
