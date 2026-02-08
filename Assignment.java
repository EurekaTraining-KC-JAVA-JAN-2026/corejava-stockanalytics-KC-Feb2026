public class Assignment {
    public static void main(String[] args) {
        String firstname = "Bhuvana";
        String lastname = "nalluri";
        float f = 10.6f;
        System.out.println("concatination" + firstname);
        System.out.println("concatination" + lastname);
        System.out.println("concatination" + f);

        concatmethod();
        concatmethod("Bhuvana", "nalluri", 10.44f);

    }

    private static void concatmethod() {
        String firstname = "Bhuvana";
        String lastname = "Nalluri";
        float f = 10.44f;
        System.out.println("concatination for second method" + firstname + lastname + f);
    }

    private static void concatmethod(String firstname, String lastname, float f) {
        System.out.println("concatination for third method " + firstname + lastname +f);
    }
}