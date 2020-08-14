package com.example.pasifamal.presenter;

import com.example.pasifamal.model.UserDAO;
import com.example.pasifamal.view.LoginView;

public class LoginPresenterImp implements LoginPresenter{
    private final LoginView loginView;
    private final UserDAO uDAO;

    public LoginPresenterImp(LoginView loginView, UserDAO uDAO) {
        this.loginView = loginView;
        this.uDAO = uDAO;
    }

    @Override
    public void loginUser() {
        loginView.viewUser();
    }
}
