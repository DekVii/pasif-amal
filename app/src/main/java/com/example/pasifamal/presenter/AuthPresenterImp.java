package com.example.pasifamal.presenter;

import com.example.pasifamal.model.UserDAO;
import com.example.pasifamal.view.RegisterView;

public class AuthPresenterImp implements AuthPresenter{

    private final RegisterView registerView;
    private final UserDAO uDAO;

    public AuthPresenterImp(RegisterView registerView, UserDAO uDAO) {
        this.registerView = registerView;
        this.uDAO = uDAO;
    }

    @Override
    public void addNewUser() {
        registerView.showAddUser();

    }


}
