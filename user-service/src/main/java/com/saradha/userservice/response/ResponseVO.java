package com.saradha.userservice.response;

import com.saradha.userservice.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseVO {

    private User user;
    private Department department;


}
