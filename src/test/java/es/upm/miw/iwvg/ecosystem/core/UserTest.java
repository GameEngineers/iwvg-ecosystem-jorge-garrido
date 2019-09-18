package es.upm.miw.iwvg.ecosystem.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class UserTest {

    private User user;

    @BeforeEach
    void before() {
        user = new User(1, "jorge", "garrido");
    }

    @Test
    void testUser(){
        user = new User(0, "a", "b");
        assertEquals(0, user.getNumber());
        assertEquals("A", user.getName());
        assertEquals("B", user.getFamilyName());
    }

    @Test
    void testUserIndexOutOfBoundsException(){
        assertThrows(IndexOutOfBoundsException.class, () -> new User(0, "", ""));
    }

    @Test
    void testUserNumber() {
        assertEquals(1, user.getNumber());
    }

    @Test
    void testUserName() {
        assertEquals("Jorge", user.getName());
    }

    @Test
    void testUserFamilyName() {
        assertEquals("Garrido", user.getFamilyName());
    }

    @Test
    void testUserInitials() {
        assertEquals("J.", user.initials());
    }

    @Test
    void testFullName() {
        assertEquals("Jorge Garrido", user.fullName());
    }
}
