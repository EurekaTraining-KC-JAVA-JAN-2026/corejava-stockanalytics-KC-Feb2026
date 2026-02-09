public class Assignment1 {
    public static void main(String[] args) {
        System.out.println("Assignment-1 Sneha-Kancharla");
        String firstName;
        firstName= "Sneha";
        String lastName="Kancharla";
        float x = 2.34f ;
        //performing concatination in main
        System.out.println("1st type of Concatination is"+" " +firstName +" " +lastName + " "+x);
        String output= concatenation(firstName,lastName,x);
        System.out.println("output is:" +output);
        concatenation();//calling void meth 2nd type concat
    }
    //with arguments and return type
    private static String concatenation(String firstName,String lastName,float x){
        return firstName +" " +lastName + " "+x;
    }
    //with no arg and no return type
    public static void concatenation() {
        String firstName = "Sneha";
        String lastName = "Kancharla";
        float x = 2.34f ;
        System.out.println("3rd type of concat: "+firstName + " "+ lastName+" "+x);

    }
    //with concat operator


}
