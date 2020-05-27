public class DoorLock {

    public static final int MAX_NUMBER_OF_ATTEMPTS = 3;

    private Combination combination;
    private boolean open;
    private boolean activated;
    private int numberOfAttempts;

    public DoorLock(Combination combination) {
        this.combination=combination;
        open=false;
        activated=true;
        numberOfAttempts=0;
    }

    public boolean isOpen() {
        return open;
    }

    public boolean isActivated() {
        return activated;
    }

    public boolean open(Combination combination) {

        if(!activated){
            if(combination.equals(this.combination)){
            numberOfAttempts=0;
            open=true;
            }
        }
        else{
            numberOfAttempts++;
        }

        if(numberOfAttempts==MAX_NUMBER_OF_ATTEMPTS){
            activated=false;
        }
        return open;
    }

    public void activate(Combination c) {
        if(combination.equals(c)){
            activated=true;
        }
    }

}