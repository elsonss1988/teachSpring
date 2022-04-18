package com.ibm.hello.Services;

import com.ibm.hello.Entity.User;
import com.ibm.hello.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository;

//    public findAll(){
//        User user = userRepository.findAll();
//    }
//

}

