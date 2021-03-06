public abstract class Warrior {
    private final String name;
    private final String specialization;

    public abstract void run();
    public abstract void death();

    public Warrior( String name, String spec ) {
        this.name = name;
        this.specialization = spec;
    }

    protected void logMySelfEvent( String event ) {
        System.out.println( String.format( "[%s::%s] : %s", name, specialization, event ) );
    }
}
