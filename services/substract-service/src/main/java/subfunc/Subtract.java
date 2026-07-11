package subfunc;

import java.math.BigDecimal;

/**
 * Substract function.
 */
public class Subtract {

  public static int sub(int a, int b) {
    return a - b; 
  }


  public static double sub(double a, double b) {
    return a - b;
  }


  public static float sub(float a, float b) {
    return a - b;
  }

  public static BigDecimal sub(BigDecimal a, BigDecimal b) {
    return a.subtract(b);
  }
}
