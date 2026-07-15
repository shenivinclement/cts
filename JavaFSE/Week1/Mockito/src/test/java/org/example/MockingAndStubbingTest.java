package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MockingAndStubbingTest {

    @Mock
    UserRepository userRepository;

    @Test
    void testGetUserGreeting_userFound() {
        when(userRepository.findUserById(1)).thenReturn("Shenivi");
        Main main = new Main(userRepository);
        assertEquals("Hello, Shenivi", main.getUserGreeting(1));
    }

    @Test
    void testGetUserGreeting_userNotFound() {
        when(userRepository.findUserById(99)).thenReturn(null);
        Main main = new Main(userRepository);
        assertEquals("User not found", main.getUserGreeting(99));
    }
}