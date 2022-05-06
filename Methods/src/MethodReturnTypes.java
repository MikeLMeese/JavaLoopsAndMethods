public class MethodReturnTypes {

    public static void main(String[] args) throws Exception {
        System.out.println("Invoke the sacred mantra!");
        String ramblings = invokeRamblings();
        System.out.println(ramblings);

        System.out.println("Invoke the holy number!");
        int arithmetic = invokeLegalAgeForBooze();
        System.out.println(arithmetic);

        System.out.println("Art thou a normie? true/false");
        boolean heresy = checkForHeresy();
        System.out.println(heresy);
    }
    public static String invokeRamblings() {
        return "Too many waifus will destroy your laifu as you meet your end at the tip of a knaifu";
    }
    public static int invokeLegalAgeForBooze() {
        return 21;
    }
    public static boolean checkForHeresy() {
        return true;
    }
}