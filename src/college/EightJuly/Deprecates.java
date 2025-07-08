package college.EightJuly;

class MyService {

    void oldMethod() {

    }

    void newMethod() {

    }
}

public class Deprecates {

    public static void main(String[] args) {
        MyService service = new MyService();

        service.oldMethod();
        service.newMethod();
    }
}
