package com.usermanagement.service;

import com.usermanagement.data.UserList;
import com.usermanagement.service.UserServiceImp;
import com.usermanagement.enums.Status;
import com.usermanagement.model.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceImpUnitTest {

    /* Demo test */
    @Test
    public void demoTestMethod(){
        assertTrue(true);
    }


    /*-------- All of the following is considered Integration Test --------*/

    @MockBean
    UserList mylist;

    @Autowired
    UserServiceImp myService;

    /*-- deleteUserById Method Test Start --*/
    @Test
    public void deleteUserByIdTest() {

       // Mockito.when(myService.deleteUserById(2)).thenReturn();
        String deleteMsg = myService.deleteUserById(2);
        assertEquals(deleteMsg, "User Deleted Successfully");
    }

    @Test
    public void getUserByIdTest() {
        /*
        com.usermanagement.model.User user = com.usermanagement.model.User.builder()
                .userName("Max").id(5).fullName("Mahmoud Khaled").email("mahmoud3@yahoo.com")
                .role("Moderator").mobileNumber("01097889876").password("max12")
                .status(Status.Inactive).gender("Male").build();
        */

//        Optional<User> user = Optional.of(new User("Max", "max12", "mahmoud3@yahoo.com"
//                , "Mahmoud Khaled", "01097889876", "Moderator", "Male",
//                Status.Inactive));
        User user = new User("Max", "max12", "mahmoud3@yahoo.com"
                , "Mahmoud Khaled", "01097889876", "Moderator", "Male",
                Status.Inactive);

        Mockito.when(myService.getUserById(Mockito.anyInt())).thenReturn(user);

        assertNotNull(user);
//        assertEquals(user.get().getStatus(), Status.Inactive);
//        assertNotNull(user.get().getFullName());
        assertEquals(user.getStatus(), Status.Inactive);
        assertNotNull(user.getFullName());
    }
//
//    @Test
//    public void deleteNotFoundUserByIdTest() {
//        String deleteMsg = myService.deleteUserById(10);
//        assertEquals(deleteMsg, "User not found");
//    }
//    /*-- deleteUserByIdTest Method Test End --*/
//
//
//    /*-- changeUserStatus Method Test Start --*/
//    @Test
//    public void changeNotFoundUserStatusTest() {
//        String statusMsg = myService.changeUserStatus(10, Status.Active);
//        assertEquals(statusMsg, "User not found");
//    }
//    @Test
//    public void activateUserStatusTest() {
//        String statusMsg = myService.changeUserStatus(1, Status.Active);
//        assertEquals(statusMsg, "User Activated Successfully");
//        com.usermanagement.model.User user = UserList.getUsers().get(0);
//        assertNotNull(user.getStatus());
//        assertEquals(user.getStatus(), Status.Active);
//    }
//    @Test
//    public void deactivateUserStatusTest() {
//        String statusMsg = myService.changeUserStatus(1, Status.Inactive);
//        assertEquals(statusMsg, "User Deactivated Successfully");
//        com.usermanagement.model.User user = UserList.getUsers().get(0);
//        assertNotNull(user.getStatus());
//        assertEquals(user.getStatus(), Status.Inactive);
//    }
//    /*-- changeUserStatus Method Test End --*/
//
//    /*---------------------------------------------------------------------*/







}
