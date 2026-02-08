public class StringExample {
    public static void main(String[] args) {


        String name = "sai mahesh";
        String subject_name = "java";
        float score = 3.8f;

        System.out.println("Total score of student " + name + " " + subject_name + " " + "is " + score+" on a scale of 4");
        //
        System.out.println(printStrings("mahesh","SQL",3.7f));
        //
        System.out.println(concat());

    }
    private static String concat(){
        String name3 = "sai mahesh";
        String subject_name3="Java Script";
        float scores3=3.65f;
        return ("Total score of  "+name3+" in the "+subject_name3+"  is "+scores3+  " on a scale of 4");
    }

    private static String printStrings(String name2,String subject_name2,float scores2){

        return ("Total score of student "+name2+"in the subject  "+subject_name2+" is "+scores2+" on a scale of 4" );
    }
}
