package com.usermanagement.mapper;


import com.usermanagement.dto.UserDto;
import com.usermanagement.dto.UserUpdateDto;
import com.usermanagement.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {

    //Creating new user object based on userDto
    User UserDtoMapToUser(UserDto userDto);


    //Update aer with valn existing usues from a UserDto object.
    //@Mapping(target = "fullName", ignore = true)
    //@Mapping(target = "gender", ignore = true)
    void UpdateDtoMapToUser(UserUpdateDto userUpdateDto, @MappingTarget User user);



}
