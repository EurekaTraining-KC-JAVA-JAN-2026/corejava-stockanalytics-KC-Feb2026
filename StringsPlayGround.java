public class StringsPlayGround {
        public static void main(String[] args) {
            // Strings are immutable
            String s1 = "Eureka";
            s1 = "EurekaTech";
            String s11 = "Eureka";

            System.out.println(System.identityHashCode(s1));
            System.out.println(System.identityHashCode(s11));

            String s3 = "Eureka";
            String s4 = new String("Tech");
            String s5 = " ";
            System.out.println("Combination of Eureka and Tech " + s3 + " " + s4);
            System.out.println(s1.charAt(2));
            System.out.println(s3.concat(" ").concat(s4));
            System.out.println(s3 == s4);          // false
            System.out.println(s3.equals(s4));
            System.out.println(s3.equalsIgnoreCase("eureka"));
            System.out.println(s1.substring(2, 5));
            System.out.println(s5.isEmpty());
            System.out.println(s5.isBlank());
            System.out.println(s1.toUpperCase());
            System.out.println(s1.toLowerCase());
        }
}
