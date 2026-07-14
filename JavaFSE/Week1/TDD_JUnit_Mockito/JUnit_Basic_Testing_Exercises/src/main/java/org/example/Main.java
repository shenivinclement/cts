package org.example;

public class Main {
    private UserRepository userRepository;

    public Main() {}

    public Main(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public boolean isEven(int number) { return number % 2 == 0; }
    public String greet(String name) { return name == null ? null : "Hello, " + name; }

    public String getUserGreeting(int userId) {
        String user = userRepository.findUserById(userId);
        return user == null ? "User not found" : "Hello, " + user;
    }
}