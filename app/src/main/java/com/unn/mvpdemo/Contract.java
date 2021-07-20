package com.unn.mvpdemo;

public interface Contract {

    interface IView{
        void onSuccess(String message);
        void onError(String message);
    }

    interface IPresenter{
        void doLogin(String email, String password);
    }
}
