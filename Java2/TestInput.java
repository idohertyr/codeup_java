public class TestInput {
    public static void main(String[] args) {
        System.out.println("Hello TestInput!");
        Input user = new Input();
        user.yesNo();
        user.getString();
        user.getInt(1, 10);
        user.getDouble(2.42, 32.34);
        System.out.println("Test input complete.");
    }
}