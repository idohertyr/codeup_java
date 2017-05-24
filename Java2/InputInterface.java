/**
 * compilation: javac InputInterface.java
 *
 * Interface used for Input
 */
public interface InputInterface {
    String getString();
    boolean yesNo();
    int getInt(int min, int max);
    String getInt();
    double getDouble(double min, double max);
    String getDouble();
}
