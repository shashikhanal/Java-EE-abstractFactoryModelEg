/**
 * Created by dragonSlayer on 5/26/16.
 */

public class BlastIntensityFactory extends AbstractFactory {

    @Override
    public Bomb getBomb(String bombType) {
        return null;
    }

    @Override
    BlastIntensity getBlastIntensity(String blastIntensity) {

        if (blastIntensity == null) {
            return null;
        }

        if (blastIntensity.equalsIgnoreCase("MAX")) {
            return new Max();
        } else if (blastIntensity.equalsIgnoreCase("MODERATE")) {
            return new Moderate();
        } else if (blastIntensity.equalsIgnoreCase("MIN")){
            return new Min();
        }

        return null;
    }
}
