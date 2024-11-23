class Penguin extends Animal implements Swim, Walk {
    private String colorOfPenguin;
    private boolean isSwimming;
    private int swimSpeed;
    private int walkSpeed;

    @Override
    public void eatingFood() {
        System.out.println("Penguin: I am eating delicious fish.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Penguin: I have eaten fish.");
    }

    @Override
    public void swimming() {
        System.out.println("Penguin: I am swimming at the speed " + this.swimSpeed + " nautical miles per hour");
    }

    @Override
    public void walking() {
        System.out.println("Penguin: I am walking at the speed " + this.walkSpeed + " mph");
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public String getColorOfPenguin() {
        return colorOfPenguin;
    }

    public void setColorOfPenguin(String colorOfPenguin) {
        this.colorOfPenguin = colorOfPenguin;
    }

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    public int getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }
}