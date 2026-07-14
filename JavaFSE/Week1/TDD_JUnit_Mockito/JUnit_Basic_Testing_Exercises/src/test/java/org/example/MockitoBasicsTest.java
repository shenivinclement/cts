package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MockitoBasicsTest {

    @Mock
    UserRepository userRepository;

    @Test
    void testGetUserGreeting_userFound() {

        when(userRepository.findUserById(1)).thenReturn("Shenivi");

        Main main = new Main(userRepository);
        String result = main.getUserGreeting(1);

        assertEquals("Hello, Shenivi", result);
    }

    @Test
    void testGetUserGreeting_userNotFound() {
        when(userRepository.findUserById(99)).thenReturn(null);

        Main main = new Main(userRepository);
        String result = main.getUserGreeting(99);

        assertEquals("User not found", result);
    }

    @Test
    void testFindUserById_isCalledExactlyOnce() {
        when(userRepository.findUserById(1)).thenReturn("Shenivi");

        Main main = new Main(userRepository);
        main.getUserGreeting(1);

        verify(userRepository, times(1)).findUserById(1);
    }

    @Test
    void testFindUserById_isNeverCalledWithWrongId() {
        when(userRepository.findUserById(1)).thenReturn("Shenivi");

        Main main = new Main(userRepository);
        main.getUserGreeting(1);

        verify(userRepository, never()).findUserById(2);
    }
}