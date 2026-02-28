class PassByValue {
    public static void main(String[] args) {
        int x = 20;
        System.out.println(System.identityHashCode(x));
        // you get a hashcode only if it is initialized to a value
        // only pass the value of 20 but not reference of it
        System.out.println(x);
        System.out.println(System.identityHashCode(x));

        update(x);

    }
    static void update(int a)
    // before it is showing the same reference number as a has no value assigned and same as x
    {   System.out.println(System.identityHashCode(a));
        a = 40;
        // now reference no is not same as x
        System.out.println(System.identityHashCode(a));

    }
}


