package com.example.pasifamal.model;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.pasifamal.model.entity.User;

@Database(entities = {User.class},version = 1, exportSchema = false)
public abstract class UserDatabase extends RoomDatabase {

    private static final String dbName = "User";
    private static UserDatabase userDatabase;

    public static UserDatabase getUserDatabase(Context context){
        if (userDatabase == null){
            userDatabase = Room.databaseBuilder(context,UserDatabase.class, dbName)
                    .allowMainThreadQueries()
                    .build();
        }
        return userDatabase;
    }

    public abstract UserDAO userDAO();

}
