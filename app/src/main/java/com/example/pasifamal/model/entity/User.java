package com.example.pasifamal.model.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "user")
public class User {

    @PrimaryKey(autoGenerate = true)
    public Integer id;

    @ColumnInfo(name = "email")
    public String email;

    @ColumnInfo(name = "password")
    public String password;

    @ColumnInfo(name = "nama")
    public String nama;

    @ColumnInfo(name = "no_hp")
    public Integer no_hp;


    public User() {
    }

    public User(Integer id, String email, String password, String nama, Integer no_hp) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.nama = nama;
        this.no_hp = no_hp;
    }


}
