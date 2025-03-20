@Service
public class AuthService {
    public String generateToken(String username) {
        return JwtUtils.generateToken(username);
    }
}