public class Assignment {
    public static void main(String[] args) {
        ConcatExcercise ce=new ConcatExcercise();
        System.out.println(ce.concat("Tastes ","Better & only costs ", 3.49f));
        System.out.println(ce.concat(6," Pack"," for Friday"));
        System.out.println(ce.concat("Tune into ",98.6f," FM"));
    }

    private static class ConcatExcercise{
        public String concat(String s1,String s2,float f){
            return s1+s2+f;
        }

        public String concat(float f1,String str1, String str2){
            return f1+str1+str2;
        }

        public String concat(String a1,float f2,String a2){
            return a1+f2+a2;
        }

    }
}
