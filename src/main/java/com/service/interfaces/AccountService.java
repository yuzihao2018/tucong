package com.service.interfaces;

import com.bo.Account;

import com.bo.UserInfo;
import com.bo.UserInfoDetail;
import org.springframework.stereotype.Service;



/**
 * Created by John on 2019/4/13.
 */
public interface AccountService {

    public int   checkAccount(Account account);

    public void doRegister(String userName , String userPwd);

    public UserInfo queryUserInfoById(int id);

    public Account queryAccountByPhone(String userName);

    public UserInfoDetail qryUserInfoDetail(Integer userId)throws Exception;

}
