public class ShooterWarrior extends Warrior implements IShooting {
    public ShooterWarrior(String name, String spec) {
        super(name, spec);
    }

    @Override
    public void run() {
        logMySelfEvent( "Run-run-run!" );
    }

    @Override
    public void death() {
        logMySelfEvent( "Сourage leads to haven..." );
    }

    @Override
    public void shootByСrossbow() {
        logMySelfEvent( "Shot from crossbow" );
    }

    @Override
    public void defenseWithShield() {
        logMySelfEvent( "Raise the shield" );
    }
}