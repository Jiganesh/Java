import java.lang.Math;

public class JavaMathTryout {
    public static void main(String[] args) {

        System.out.println(Math.PI+" "+Math.E);

        // Math.abs()
        System.out.println(Math.abs(-5));

        // Math.ceil()
        System.out.println(Math.ceil(5.5));

        // Math.floor()
        System.out.println(Math.floor(5.5));

        // Math.max()
        System.out.println(Math.max(5, 10));

        // Math.min()
        System.out.println(Math.min(5, 10));

        // Math.pow()
        System.out.println(Math.pow(5, 2));

        // Math.random()
        System.out.println(Math.random());

        // Math.round()
        System.out.println(Math.round(5.5));

        // Math.sqrt()
        System.out.println(Math.sqrt(25));

        // Math.toDegrees()
        System.out.println(Math.toDegrees(Math.PI));

        // Math.toRadians()
        System.out.println(Math.toRadians(180));

        // Math.copySign()
        System.out.println(Math.copySign(5, -8));

        //Math.addExact()
        System.out.println(Math.addExact(899999999999999999L, 2000000000000000000L));
        
        //Math.decrementExact()
        System.out.println(Math.decrementExact(50));

        //Math.floorDiv()
        System.out.println(Math.floorDiv(10, 4));

        //Math.floorMod()
        System.out.println(Math.floorMod(10, 3));

        //Math.exp()
        System.out.println(Math.exp(3));
        System.out.println(Math.getExponent(15));

        //Math.expm1()
        System.out.println(Math.expm1(3));

        //Math.log()
        System.out.println(Math.log(3));
        System.out.println(Math.log10(3));

        //Math.log1p()
        System.out.println(Math.log1p(3));

        //Math.max()
        System.out.println(Math.max(3, 5));

        //Math.min()
        System.out.println(Math.min(3, 5));

        //Math.nextAfter()
        System.out.println("nextAfter: "+Math.nextAfter(3, 5));

        //Math.nextUp()
        System.out.println(Math.nextUp(3));

        //Math.ulp()
        System.out.println(Math.ulp(3));

        //Math.signum()
        System.out.println(Math.signum(3));

        //Math.sin()
        System.out.println(Math.sin(3));

        //Math.cos()
        System.out.println(Math.cos(3));

        //Math.tan()
        System.out.println(Math.tan(3));

        //Math.asin()
        System.out.println(Math.asin(3));

        //Math.acos()
        System.out.println(Math.acos(3));

        //Math.atan()
        System.out.println(Math.atan(3));

        //Math.atan2()
        System.out.println(Math.atan2(3, 5));

        //Math.toDegrees()
        System.out.println(Math.toDegrees(3));

        //Math.toRadians()
        System.out.println(Math.toRadians(3));

        //Math.cbrt()
        System.out.println(Math.cbrt(3));

        //Math.rint()
        System.out.println(Math.rint(5.46)); 

        //Math.scalb()
        System.out.println(Math.scalb(5, 2));
    }
}