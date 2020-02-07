package com.hikaad.global.controller;

import com.hikaad.global.dto.UsersDTO;
import com.hikaad.global.model.Users;
import com.hikaad.global.repository.UsersRepository;
import com.hikaad.utils.HikaadLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.security.MessageDigest;

@RestController
public class UsersController {

    private UsersRepository usersRepository;

    @Autowired
    public UsersController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @PostMapping("/Users")
    public Users findUser(@RequestBody UsersDTO usersDTO) {
        try {
            return usersRepository.findUser(usersDTO.getUsername(), getMD5(usersDTO.getPassword()));
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return new Users();
        }
    }

    private String getMD5(String input) {
        try {
            input                   =  "18" + input + "1976";
            MessageDigest md        = MessageDigest.getInstance("MD5");
            byte[] messageDigest    = md.digest(input.getBytes());
            BigInteger number       = new BigInteger(1, messageDigest);
            String hashtext         = number.toString(16);

            while (hashtext.length() < 32)
                hashtext = "0" + hashtext;

            return hashtext;
        }
        catch (Exception e) {
            HikaadLogger.error(e.toString());
            return "";
        }
    }
}