package com.example.pasifamal.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.pasifamal.R;
import com.example.pasifamal.model.UserDatabase;
import com.example.pasifamal.presenter.AuthPresenterImp;
import com.example.pasifamal.presenter.LoginPresenter;
import com.example.pasifamal.presenter.LoginPresenterImp;
import com.example.pasifamal.view.LoginView;
import com.example.pasifamal.view.RegisterView;

public class LoginFragment extends Fragment implements LoginView {

    private EditText edEmail, edPassword;
    private Button btnMasuk;

    public UserDatabase uDatabase;
    private LoginPresenter loginPresenter;
    private TextView mTextEmpty;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_login, container, false);

        edEmail = (EditText)getActivity().findViewById(R.id.user_email);
        edPassword = (EditText)getActivity().findViewById(R.id.user_password);
        btnMasuk = (Button)v.findViewById(R.id.btn_masuk);

        uDatabase = UserDatabase.getUserDatabase(getActivity());
        loginPresenter = new LoginPresenterImp(this, uDatabase.userDAO());

        btnMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        return v;
    }

    @Override
    public void viewUser() {

    }
}
