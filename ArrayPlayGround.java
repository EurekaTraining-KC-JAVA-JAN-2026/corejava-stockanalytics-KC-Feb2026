public class ArrayPlayGround {
    public static void main(String[] args){
        int[] numArray= new int[]{};//empty array
        int[] valuesArray=new int[]{10,20,30,40};
        System.out.println(valuesArray.length);

        for(int i=0;i<valuesArray.length;i++){
            System.out.println(valuesArray[i]);

        }
        for(int i=valuesArray.length-1;i>=0;i--){
            System.out.println("ReverseArray:"+valuesArray[i]);
        }
        for (int values:valuesArray){
            System.out.println(values);

        }

        String tickerString="AAPL-AMD-GOOG";
        String[] tickerArray=tickerString.split("-");
        for(String word:tickerArray) {
            System.out.println(word);
        }

    }
}
