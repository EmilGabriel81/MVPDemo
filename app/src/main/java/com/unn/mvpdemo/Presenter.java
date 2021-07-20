package com.unn.mvpdemo;

import com.unn.mvpdemo.Contract.IView;

public class Presenter implements Contract.IPresenter {

    IView view;

    public Presenter(IView view) {
        this.view = view;
    }


    @Override
    public void doLogin(String email, String password) {

        if(email.equalsIgnoreCase("Emil")&&password.equalsIgnoreCase("123")){
            view.onSuccess("Welcome");
        }else{
            view.onError("Unsuccessful attempt!");
        }
    }
}
