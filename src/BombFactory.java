/**
 * Created by dragonSlayer on 5/26/16.
 */

public class BombFactory extends AbstractFactory {

    @Override
    public Bomb getBomb(String bombType) {

        if (bombType == null) {
            return null;
        }
        if (bombType.equalsIgnoreCase("GRENADE")) {
            return new Grenade();
        } else if (bombType.equalsIgnoreCase("RPG")) {
            return new Rpg();
        } else if (bombType.equalsIgnoreCase("RDX")) {
            return new Rdx();
        }

        return null;
    }

    @Override
    BlastIntensity getBlastIntensity(String blastIntensity) {
        return null;
    }
}
