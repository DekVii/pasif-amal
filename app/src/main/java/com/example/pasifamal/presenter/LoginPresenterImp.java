package com.example.pasifamal.presenter;

import android.view.View;

import com.example.pasifamal.model.UserDAO;
import com.example.pasifamal.model.entity.User;
import com.example.pasifamal.view.LoginView;

public class LoginPresenterImp implements LoginPresenter{
    private final LoginView loginView;
    private final UserDAO uDAO;

    public LoginPresenterImp(LoginView loginView, UserDAO uDAO) {
        this.loginView = loginView;
        this.uDAO = uDAO;
    }

    @Override
    public void loginUser(User user) {
        loginView.viewUser(user.id);
    }

    @Override
    public void regisUser() {
        loginView.openRegis();
    }

}
