public class Assignment1 {
    public static void main(String[] args){
        String message = "Hello";
        String name = "Sathvika";
        float f = 5.2f;
        System.out.println("concatenation : " + message + " " + name + " " + f);
        concatenation(); //method calling
        String output = concatenation(message, name, f);
                System.out.println("concatenation : " + output);
    }
    //method with passing arguments
    public static String concatenation(String message, String name, float f) {
        return message + " " + name + " " + f;
    }
    //another method without calling values
    public static void concatenation(){
        String message = "Hello";
        String name = "Sathvika";
        float f = 5.2f;
        System.out.println("concatenation : " + message + " " + name + " " + f);
    }
}
