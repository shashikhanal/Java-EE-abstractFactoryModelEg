/**
 * Created by dragonSlayer on 5/26/16.
 */

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {

        if (choice.equalsIgnoreCase("BOMB")) {
            return new BombFactory();
        } else if (choice.equalsIgnoreCase("BLASTINTENSITY")) {
            return new BlastIntensityFactory();
        }

        return null;
    }
}
