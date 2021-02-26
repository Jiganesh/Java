public class ObjectCasting {
    public static void main(String[] args) {
        /*
         * Explicit casting has to be done when the source type is extended or
         * implemented by the target type (casting to a subtype). This can produce a
         * runtime exception (ClassCastException) when the object being cast is not of
         * the target type (or the target's subtype).
         */

        float i = 7.90f;
        Number n = i;
        double b = (double)i;// even i is sufficient and it cannot do it for (double) n --> throws exception ClassCastException
        System.out.println(b);
        System.out.println(n);
        System.out.println(i);
    }
}
