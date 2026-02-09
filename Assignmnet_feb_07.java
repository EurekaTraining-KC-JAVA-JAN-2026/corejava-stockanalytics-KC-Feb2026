
//write a method, in three ways, it should take 3 arug's (string,string,float) it should return the cancatination of those argus

public class Assignmnet_feb_07 {

    static void main(String[] args) {

        //1.type-1
        String first_name = "Raja";
        String last_name = "simha reddy";
        float scores = 89.9f;

        System.out.println("Total score of student " + first_name + " " + last_name + " " + "is " + scores);
        //
        System.out.println(Conationcation_type_2());
        //
        System.out.println(Conationcation_type_3("Raja","Simha Reddy",92.3f));
    }
        private static String Conationcation_type_2(){
            String first_name2 = "Raja";
            String last_name2="simha reddy";
            float scores2=91.9f;
            return ("Total score of student "+first_name2+" "+last_name2+" in the second subject is "+scores2);
        }

    private static String Conationcation_type_3(String first_name3,String last_name3,float scores3){

        return ("Total score of student "+first_name3+" "+last_name3+" in the second subject is "+scores3);
    }


}

