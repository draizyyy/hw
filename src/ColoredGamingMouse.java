import java.util.Random;

public class ColoredGamingMouse extends GamingMouse {
    protected String[] backlightColors = new String[] {"yellow", "green", "blue", "red"};
    protected String backlightColor = backlightColors[0], newColor = backlightColor;

    public void changeMouseBacklight() {
        do {
            int n = (int)Math.floor(Math.random() * backlightColors.length);
            newColor = backlightColors[n];
        } while (newColor.equals(backlightColor));
        backlightColor = newColor;
    }
    @Override
    public void printInfo() {
        System.out.println("Type of mouse: COLOREDGAMINGMOUSE");
        System.out.println("Mouse backlight color is " + backlightColor);
        System.out.println("Gaming mouse has " + getColor() + " color, left button is " + leftButton + ", right button is " + rightButton);
        System.out.println("Gaming mouse has " + getButtons() + " buttons. First side button is " + firstSideButton + " second button is " + secondSideButton);
        System.out.println("Sensitivity is " + sensitivity);
        System.out.println();
    }
}
