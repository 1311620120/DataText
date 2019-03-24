package com.example.day0322.view.interfaces;

/**
 * @Auther: 白俊岭
 * @Date: 2019/3/22 13:56:46
 * @Description:
 */
public interface IMainView<T>  {
     void  onSeccuss(T t);
     void  onFail(String err);
}
