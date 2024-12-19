package com.usermanagement.service;

import com.usermanagement.data.UserList;
import com.usermanagement.enums.Status;
import org.apache.catalina.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceImpTest {

    /* Demo test */
    @Test
    public void demoTestMethod(){
        assertTrue(true);
    }


/*-------- All of the following is considered Integration Test --------*/

    @Autowired
    UserServiceImp myService;

    /*-- deleteUserById Method Test Start --*/
    @Test
    public void deleteUserByIdTest() {
        String deleteMsg = myService.deleteUserById(2);
        assertEquals(deleteMsg, "User Deleted Successfully");
    }
    @Test
    public void deleteNotFoundUserByIdTest() {
        String deleteMsg = myService.deleteUserById(10);
        assertEquals(deleteMsg, "User not found");
    }
    /*-- deleteUserByIdTest Method Test End --*/


    /*-- changeUserStatus Method Test Start --*/
    @Test
    public void changeNotFoundUserStatusTest() {
        String statusMsg = myService.changeUserStatus(10, Status.Active);
        assertEquals(statusMsg, "User not found");
    }
    @Test
    public void activateUserStatusTest() {
        String statusMsg = myService.changeUserStatus(1, Status.Active);
        assertEquals(statusMsg, "User Activated Successfully");
        com.usermanagement.model.User user = UserList.getUsers().get(0);
        assertNotNull(user.getStatus());
        assertEquals(user.getStatus(), Status.Active);
    }
    @Test
    public void deactivateUserStatusTest() {
        String statusMsg = myService.changeUserStatus(1, Status.Inactive);
        assertEquals(statusMsg, "User Deactivated Successfully");
        com.usermanagement.model.User user = UserList.getUsers().get(0);
        assertNotNull(user.getStatus());
        assertEquals(user.getStatus(), Status.Inactive);
    }
    /*-- changeUserStatus Method Test End --*/

/*---------------------------------------------------------------------*/







}
