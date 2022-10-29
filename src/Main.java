class Main {
    public static void main(String[] args) {
        // Обычная мышка (родитель)
        Mouse mouse = new Mouse();
        mouse.printInfo();

        mouse.changeButtons();
        mouse.changeColor();

        mouse.printInfo();


        // Игровая мышка
        GamingMouse gamingMouse = new GamingMouse();

        gamingMouse.printInfo();

        gamingMouse.changeButtons();
        gamingMouse.changeSideButtons();

        for (int i = 0; i < 5; ++i) {
            gamingMouse.decreaseSensitivity();
        }
        gamingMouse.printInfo();

        for (int i = 0; i < 9; ++i) {
            gamingMouse.increaseSensitivity();
        }
        gamingMouse.printInfo();

        gamingMouse.increaseSensitivity();
        gamingMouse.changeColor();

        gamingMouse.printInfo();


        // Цветная игровая мышка
        ColoredGamingMouse coloredGamingMouse = new ColoredGamingMouse();

        for (int i = 0; i < 5; ++i) {
            coloredGamingMouse.changeMouseBacklight();
            coloredGamingMouse.printInfo();
        }
    }
}