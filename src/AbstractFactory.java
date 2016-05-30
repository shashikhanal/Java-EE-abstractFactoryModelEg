/**
 * Created by dragonSlayer on 5/26/16.
 */

public abstract class AbstractFactory {

    abstract BlastIntensity getBlastIntensity(String blastIntensity);
    abstract Bomb getBomb(String bomb);
}
