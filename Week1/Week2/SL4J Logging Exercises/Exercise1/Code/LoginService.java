package packag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginService {

    private static final Logger logger = LoggerFactory.getLogger(LoginService.class);

    public boolean authenticate(String username, String password) {
        if (username == null || password == null) {
            logger.error("Username or password is null");
            return false;
        }

        if (username.equals("admin") && password.equals("admin123")) {
            logger.info("User authenticated successfully");
            return true;
        } else {
            logger.warn("Failed login attempt for user: {}", username);
            return false;
        }
    }
}
