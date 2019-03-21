package com.youqi.note.http;

import com.youqi.note.model.ResponseModel;

import rx.functions.Func1;

public class PayLoad<T> implements Func1<ResponseModel<T>, T>{
    @Override
    public T call(ResponseModel<T> tResponseModel){
        if(!tResponseModel.isSuccess()) {
            throw new Fault(tResponseModel.getMsg(), tResponseModel.getStatus());
        }
        return tResponseModel.getData();
    }
}
