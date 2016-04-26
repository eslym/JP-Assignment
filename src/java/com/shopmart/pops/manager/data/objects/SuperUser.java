package com.shopmart.pops.manager.data.objects;

import com.shopmart.pops.manager.data.enums.AccessLevel;

import java.util.Random;

/**
 * Created by 0nepeop1e on 4/26/16.
 */
public class SuperUser extends User {
    @Override
    public int getId(){
        return 1;
    }
    @Override
    public String getUsername(){
        return "superuser";
    }
    @Override
    public boolean setUsername(String username, String password){
        return false;
    }
    @Override
    public AccessLevel getAccessLevel(){
        return AccessLevel.SuperUser;
    }
    @Override
    public void setStaffId(String staffName){}
    @Override
    public void setStaffName(String staffName){}
    @Override
    public void setPassword(String password){
        this.username = "";
        for(int i = 0; i < 16; i ++)
            this.username = String.format("%s%02X", this.username ,
                    new Random().nextInt() & 0xFF);
        this.setPassword(password);
    }
}