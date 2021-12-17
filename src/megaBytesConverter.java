public class megaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {

            int myKiloValue;
            myKiloValue = kiloBytes % 1024;

            int myMegaValue;
            myMegaValue = (kiloBytes / 1024);

            System.out.println(kiloBytes + " KB = " + myMegaValue + " MB and " + myKiloValue + " KB");
        }
    }
}
