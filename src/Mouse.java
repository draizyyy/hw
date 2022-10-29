public class Mouse {
    protected String leftButton = "left", rightButton = "right", color = "black";
    protected int buttons = 2;

    protected int getButtons() {
        return buttons;
    }

    protected void changeColor() {
        if (color.equals("black")) {
            color = "grey";
        }
        else {
            color = "black";
        }
    }

    protected String getColor() {
        return color;
    }

    public void changeButtons() {
        String a = leftButton;
        leftButton = rightButton;
        rightButton = a;
    }
    public void printInfo() {
        System.out.println("Type of mouse: MOUSE");
        System.out.println("Mouse has " + getColor() + " color");
        System.out.println("Left button is " + leftButton + ", right button is " + rightButton);
        System.out.println("The mouse has " + getButtons() + " buttons in total");
        System.out.println();
    }
}
