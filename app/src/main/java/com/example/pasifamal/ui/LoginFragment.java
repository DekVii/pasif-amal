package com.example.pasifamal.ui;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.pasifamal.R;
import com.example.pasifamal.model.UserDatabase;
import com.example.pasifamal.model.entity.User;
import com.example.pasifamal.presenter.AuthPresenterImp;
import com.example.pasifamal.presenter.LoginPresenter;
import com.example.pasifamal.presenter.LoginPresenterImp;
import com.example.pasifamal.view.LoginView;
import com.example.pasifamal.view.RegisterView;

public class LoginFragment extends Fragment implements LoginView {

    private EditText edEmail, edPassword;
    private Button btnMasuk;
    private TextView tvRegis;

    public UserDatabase uDatabase;
    private LoginPresenterImp loginPresenterImp;
    private TextView mTextEmpty;


    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View v = inflater.inflate(R.layout.fragment_login, container, false);

        edEmail = (EditText)getActivity().findViewById(R.id.user_email);
        edPassword = (EditText)getActivity().findViewById(R.id.user_password);
        btnMasuk = (Button)v.findViewById(R.id.btn_masuk);

        uDatabase = UserDatabase.getUserDatabase(getActivity());
        loginPresenterImp = new LoginPresenterImp(this, uDatabase.userDAO());

        action_text(v);
        btnMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginPresenterImp.loginUser();
            }
        });
        return v;
    }

    public void action_text(View view){
        tvRegis = (TextView) view.findViewById(R.id.btn_regis);
        tvRegis.setTextColor(Color.BLUE);
        tvRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRegis();
            }
        });
    }

    @Override
    public void viewUser(Integer id) {
        NavHostFragment.findNavController(LoginFragment.this)
                .navigate(R.id.action_fLogin_to_fHome);
    }

    @Override
    public void openRegis() {
        NavHostFragment.findNavController(LoginFragment.this)
                .navigate(R.id.action_fLogin_to_fRegister);
    }

}
