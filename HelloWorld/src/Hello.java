public class Hello {
    public static void main(String[] args){
        System.out.println("What up, from Java!");

//        boolean isAlien = true;
//        if(!isAlien) {
//            System.out.println("Is an Alien");
//        }
//        String makeOfCar = "VW";
//        String isDomestic = (makeOfCar == "WV") ? "domestic" : "not domestic";
//        System.out.println(isDomestic);

        double v1 = 20.00;
        double v2 = 80.00;
        double result = ( 100 * (v1 + v2)) % 40.00;
        boolean hasRemainder = result == 0.00;
        System.out.println(hasRemainder);
        if (!hasRemainder) {
            System.out.print("Got some remainder");
        }




    }
}
