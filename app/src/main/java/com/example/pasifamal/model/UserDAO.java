package com.example.pasifamal.model;

import androidx.room.Dao;
import androidx.room.Ignore;
import androidx.room.Insert;

import com.example.pasifamal.model.entity.User;

import static androidx.room.OnConflictStrategy.IGNORE;


@Dao
public interface UserDAO {

     @Insert(onConflict = IGNORE)
     long registerUser(User user);
}
