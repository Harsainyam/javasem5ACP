public class Depricates {
    public static void main(String[] args) {
        MyService service = new MyService();

        service.oldMethod(); // ⚠️ Generates warning: oldMethod() is deprecated
        service.newMethod(); // ✅ No warning
    }
}
