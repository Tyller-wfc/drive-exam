package cn.wfc.driveexam.mapper;

import cn.wfc.driveexam.entity.MyUser;

public interface MyUserMapper {
    MyUser findByName(String username);
}
