package com.example.pasifamal.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pasifamal.R;
import com.example.pasifamal.model.UserDatabase;
import com.example.pasifamal.presenter.AuthPresenterImp;
import com.example.pasifamal.view.RegisterView;

public class RegisterFragment extends Fragment implements RegisterView, View.OnClickListener {

    private EditText etNama, etEmail, etPassword, etNomor;
    private Button btnDaftar;

    public UserDatabase uDatabase;
    private AuthPresenterImp authPresenterImp;
    private TextView mTextEmpty;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_register, container, false);

        etNama = (EditText)getActivity().findViewById(R.id.reg_nama);
        etEmail = (EditText)getActivity().findViewById(R.id.reg_email);
        etPassword = (EditText)getActivity().findViewById(R.id.reg_password);
        etNomor = (EditText)getActivity().findViewById(R.id.reg_no);
        btnDaftar = (Button)getActivity().findViewById(R.id.btn_daftar);
        btnDaftar.setOnClickListener(this);

        uDatabase = UserDatabase.getUserDatabase(getActivity());
        authPresenterImp = new AuthPresenterImp(this, uDatabase.userDAO());

        return view;
    }

    @Override
    public void showAddUser() {
        NavHostFragment.findNavController(RegisterFragment.this)
                .navigate(R.id.action_fRegister_to_fLogin);
    }


    @Override
    public void onClick(View view) {
        String sEtNama, sEtNo, sEtEmail, sEtPass;

        sEtNama = etNama.getText().toString();
        sEtNo = etNomor.getText().toString();
        sEtEmail = etEmail.getText().toString();
        sEtPass = etPassword.getText().toString();

        if (sEtNama.matches("") && sEtNo.matches("") && sEtEmail.matches("") && sEtPass.matches("")) {
            Toast.makeText(getContext(), "Login Gagal", Toast.LENGTH_SHORT).show();
        } else {
            authPresenterImp.addNewUser();
            NavHostFragment.findNavController(RegisterFragment.this)
                    .navigate(R.id.action_fRegister_to_fLogin);
            Toast.makeText(getContext(), "Login Berhasil", Toast.LENGTH_SHORT).show();
        }
    }
}