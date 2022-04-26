package com.lv.service;

import com.lv.error.BusinessException;
import com.lv.service.model.UserModel;

public interface UserService {
    UserModel getUserById(Integer id);
    void register(UserModel userModel) throws BusinessException;

    UserModel validateLogin(String telphong,String encrptPassword) throws BusinessException;
}
