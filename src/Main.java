public class Main {
    public static void main(String[] args) {
        ConfigManager a = ConfigManager.getInstance();
        ConfigManager b = ConfigManager.getInstance();

        System.out.println(a == b);
        EnumSingleton.INSTANCE.doSomething();
        System.out.println(EnumSingleton.INSTANCE == EnumSingleton.INSTANCE);
        ShapeFactory factory = new ShapeFactory();
        Shape shape1 = factory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = factory.getShape("SQUARE");
        shape2.draw();
    }
}