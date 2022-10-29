public class GamingMouse extends Mouse {
    protected String firstSideButton = "first", secondSideButton = "second";
    protected int sensitivity = 500, buttons = 4;

    public void increaseSensitivity() {
        if (sensitivity < 1000) {
            sensitivity += 100;
        }
        else {
            System.out.println("Error: sensitivity is already 1000");
        }
    }
    public void decreaseSensitivity() {
        if (sensitivity > 0) {
            sensitivity -= 100;
        }
        else {
            System.out.println("Error: sensitivity is already at 0");
        }
    }
    public void changeSideButtons() {
        String a = firstSideButton;
        firstSideButton = secondSideButton;
        secondSideButton = a;
    }

    @Override
    protected int getButtons() {
        return buttons;
    }
    public void printInfo() {
        System.out.println("Type of mouse: GAMINGMOUSE");
        System.out.println("Gaming mouse has " + getColor() + " color, left button is " + leftButton + ", right button is " + rightButton);
        System.out.println("Gaming mouse has " + getButtons() + " buttons. First side button is " + firstSideButton + ", second side button is " + secondSideButton);
        System.out.println("Sensitivity is " + sensitivity);
        System.out.println();
    }
}
