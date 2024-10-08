package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList list = new UserList();
        list.addUser("John", "1234");
        list.addUser("Jane", "2345");
        list.addUser("Jack", "3456");
        // TODO: find one of them
        User user = list.findUserByUsername("John");
        // TODO: assert that UserList found User
        assertEquals("John", user.getUsername());
        // String expected = "<one of username>";
        // String actual = user.getUsername();
        // assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList list = new UserList();
        list.addUser("John", "1234");
        list.addUser("Jane", "2345");
        list.addUser("Jack", "3456");
        // TODO: change password of one user
        boolean changed = list.changePassword("John", "1234","1144");
        // TODO: assert that user can change password
        assertTrue(changed);
        // assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList list = new UserList();
        list.addUser("John", "1234");
        list.addUser("Jane", "2345");
        list.addUser("Jack", "3456");
        // TODO: call login() with correct username and password
        User actual = list.login("Jack", "3456");
        // TODO: assert that User object is found
        User expected = list.findUserByUsername("Jack");
        assertEquals(expected, actual);
        // assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList list = new UserList();
        list.addUser("John", "1234");
        list.addUser("Jane", "2345");
        list.addUser("Jack", "3456");
        // TODO: call login() with incorrect username or incorrect password
        User actual = list.login("Jack", "112233");
        // TODO: assert that the method return null
        // assertNull(actual);
        assertNull(actual);
    }

}