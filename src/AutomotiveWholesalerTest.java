public class AutomotiveWholesalerTest {

    public static void main(String[] args) {

        Part part = new Part(3626162, "Toyotires", "PRO Race", "UAD 23133" );

        Tire tire = new Tire(3626752, "Toyotires", "PRO Race", "OASW 3666", 19, 340);

        ExhaustPart exhaustPart = new ExhaustPart(8763252, "Fox", "RaceGear",
                "WSAR 335", true);


//      part.printInfo();
//      tire.printInfo();
//      exhaustPart.printInfo();

        System.out.println(part);
        System.out.println(tire);
        System.out.println(exhaustPart);

        System.out.println( "\n");


        String partInfo = part.toString();
        System.out.println(partInfo);

        String tireInfo = tire.toString();
        System.out.println(tireInfo);

        String exhaustPartInfo = exhaustPart.toString();
        System.out.println(exhaustPartInfo);

    }
}

