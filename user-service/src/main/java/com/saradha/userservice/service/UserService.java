package com.saradha.userservice.service;

import com.saradha.userservice.entity.User;
import com.saradha.userservice.repository.UserRepository;
import com.saradha.userservice.response.Department;
import com.saradha.userservice.response.ResponseVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    RestTemplate restTemplate;

    public User saveUser(User user) {
        return userRepository.save(user);

    }

    public ResponseVO getUserWithDepartment(Long id) {
        log.info("Inside get user with department");
        ResponseVO responseVO = new ResponseVO();
        User user = userRepository.findByUserId(id);
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/" + user.getUserId(), Department.class);
        responseVO.setUser(user);
        responseVO.setDepartment(department);
        return responseVO;
    }
}
