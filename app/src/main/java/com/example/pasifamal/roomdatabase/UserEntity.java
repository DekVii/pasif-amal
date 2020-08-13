package com.example.pasifamal.roomdatabase;

import android.provider.ContactsContract;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "User")
public class UserEntity {

    @PrimaryKey(autoGenerate = true)
    Integer id;

    @ColumnInfo(name = "Email")
    String email;

    @ColumnInfo(name = "Password")
    String password;

    @ColumnInfo(name = "Nama")
    String nama;

    @ColumnInfo(name = "No_hp")
    Integer no_hp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(Integer no_hp) {
        this.no_hp = no_hp;
    }
}
