public class WizardWarrior extends Warrior implements IWizarding {
    public WizardWarrior(String name, String spec) {
        super(name, spec);
    }

    @Override
    public void run() {
        logMySelfEvent( "Wzhuh-Wzhuh!" );
    }

    @Override
    public void death() {
        logMySelfEvent( "Evaporated into the clouds..." );
    }

    @Override
    public void attackByMagickFireBall() {
        logMySelfEvent( "Launch fireball" );
    }

    @Override
    public void defenseWithTeleport() {
        logMySelfEvent( "Jump into teleport" );
    }
}
