/**
 * Created by dragonSlayer on 5/26/16.
 */

public class AbstractFactoryBombDemo {

    public static void main(String[] args) {

        //get Bomb factory
        AbstractFactory BombFactory = FactoryProducer.getFactory("Bomb");

        //get an object of Bomb Grenade
        Bomb Bomb1 = BombFactory.getBomb("GRENADE");

        //call detonate method of Bomb Grenade
        Bomb1.detonate();

        //get an object of Bomb Rpg
        Bomb Bomb2 = BombFactory.getBomb("RPG");

        //detonate an object of Bomb Rpg
        Bomb2.detonate();

        //get an object of Bomb Rdx
        Bomb Bomb3 = BombFactory.getBomb("RDX");

        //detonate an object of Bomb Rdx
        Bomb3.detonate();

        //get BlastIntensity factory
        AbstractFactory BlastIntensityFactory = FactoryProducer.getFactory("BlastIntensity");

        //get an object of BlastIntensity Max
        BlastIntensity BlastIntensity1 = BlastIntensityFactory.getBlastIntensity("MAX");

        //call blast method of BlastIntensity Max
        BlastIntensity1.blast();

        //get an object of BlastIntensity Moderate
        BlastIntensity BlastIntensity2 = BlastIntensityFactory.getBlastIntensity("MODERATE");

        //call blast method of BlastIntensity Moderate
        BlastIntensity2.blast();

        //get an object of BlastIntensity Min
        BlastIntensity BlastIntensity3 = BlastIntensityFactory.getBlastIntensity("MIN");

        //call blast method of BlastIntensity Min
        BlastIntensity3.blast();
    }
}

/*
Scanner sc = new Scanner(System.in);
int i = sc.nextInt();

To retrieve a username I would probably use sc.nextLine().
 */
