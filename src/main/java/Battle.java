public class Battle {
    public static void start() {
        WizardWarrior first = new WizardWarrior( "Morozko", "Wizard" );
        ShooterWarrior second = new ShooterWarrior( "John Sheppard", "Shooter" );

        second.shootByСrossbow();
        first.defenseWithTeleport();
        first.run();
        second.shootByСrossbow();
        second.shootByСrossbow();
        second.run();
        first.defenseWithTeleport();
        first.attackByMagickFireBall();
        second.defenseWithShield();
        first.attackByMagickFireBall();
        second.run();
        second.run();
        second.defenseWithShield();
        second.run();
        second.shootByСrossbow();
        first.run();
        first.attackByMagickFireBall();
        second.death();

        System.out.println( "good game. well played." );
    }
}
