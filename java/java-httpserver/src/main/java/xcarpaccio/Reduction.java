package xcarpaccio;

/**
 * Created by mhutt on 17/01/2017.
 */
public class Reduction
{
  public static float reduce(float amount) {
    if (amount >= 50000) {
      return amount * 0.85f;
    }
    if (amount >= 10000) {
      return amount * 0.9f;
    }
    if (amount >= 7000) {
      return amount * 0.93f;
    }
    if (amount >= 5000) {
      return amount * 0.95f;
    }
    if (amount >= 1000) {
      return amount * 0.97f;
    }
    return amount;
  }
}
