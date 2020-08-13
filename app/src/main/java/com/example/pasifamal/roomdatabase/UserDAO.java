package com.example.pasifamal.roomdatabase;

import androidx.room.Dao;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.Insert;

@Dao
public interface UserDAO {
     @Insert
    void registerUser(UserEntity userEntity);
}
