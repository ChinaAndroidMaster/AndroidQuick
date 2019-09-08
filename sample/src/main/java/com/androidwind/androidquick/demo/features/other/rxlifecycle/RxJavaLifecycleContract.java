package com.androidwind.androidquick.demo.features.other.rxlifecycle;

import com.androidwind.androidquick.ui.mvp.BaseContract;
import com.androidwind.androidquick.ui.mvp.BaseModel;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public interface RxJavaLifecycleContract {
    interface Model extends BaseModel {

    }

    interface View extends BaseContract.BaseView {
        void updateView(String result);
    }

    interface Presenter extends BaseContract.BasePresenter<View> {
        void initDataRxLifecycle();
        void initDataCompositeDisposable();
    }
}