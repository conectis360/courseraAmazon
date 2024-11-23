class Tiger extends Animal implements Walk {
    private int numberOfStripes;
    private int speed;

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSoundLevel() {
        return soundLevel;
    }

    public void setSoundLevel(int soundLevel) {
        this.soundLevel = soundLevel;
    }

    private int soundLevel;

    @Override
    public void eatingFood() {
        System.out.println("The animal: Tiger is eating.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Tiger: I have eaten meat.");
    }
    @Override
    public void walking(){
        System.out.println("Tiger: I am moving at the speed " + this.speed);
    }
}