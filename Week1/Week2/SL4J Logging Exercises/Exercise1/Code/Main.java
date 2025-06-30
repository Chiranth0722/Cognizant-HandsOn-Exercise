package packag;

public class Main {
    public static void main(String[] args) {
        LoginService service = new LoginService();

        service.authenticate("admin", "admin123"); // success
        service.authenticate("admin", "wrong");     // warning
        service.authenticate(null, null);           // error
    }
}

