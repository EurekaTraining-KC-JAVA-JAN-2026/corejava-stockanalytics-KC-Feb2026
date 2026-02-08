public class Assignment {

        public void concat(String str1, String str2, float fVal) {
            String result = str1 + " " + str2 + " " + fVal;
            System.out.println("Method 1 (Spaces): " + result);
        }
        public void concat(float fVal, String str1, String str2) {
            String result = fVal + " " + str1 + " " + str2;
            System.out.println(result);
        }
        public void concat(String str1, float fVal, String str2) {

            String result = str1 + " " + fVal + " " + str2;
            System.out.println(result);
        }

        public static void main(String[] args) {
            Assignment demo = new Assignment();

            demo.concat("apple", "banana", 12.34f);
            demo.concat(54.22f, "rice", "grain");
            demo.concat("lattitude", 90.12f, "longitudes");
        }
    }



