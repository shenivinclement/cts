package org.example;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public ResponseWrapper login(@RequestBody LoginRequest request) {
        // Simplified hardcoded check — real apps would verify against a DB/UserService
        if ("shenivi".equals(request.getUsername()) && "password123".equals(request.getPassword())) {
            String token = JwtUtil.generateToken(request.getUsername());
            return new ResponseWrapper(token);
        } else {
            throw new RuntimeException("Invalid username or password");
        }
    }
}

class ResponseWrapper {
    private String token;
    public ResponseWrapper(String token) { this.token = token; }
    public String getToken() { return token; }
}