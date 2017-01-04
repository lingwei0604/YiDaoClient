package yidao.ucai.cn.yidao.Register;


import yidao.ucai.cn.yidao.BasePresenter;
import yidao.ucai.cn.yidao.BaseView;

/**
 * Created by Administrator on 2017/1/3.
 */
public interface TaskContract {
    interface View extends BaseView<Presenter> {

        void showOrderList();

        void showEmptyList();

        void showMessage();


    }

    interface Presenter extends BasePresenter {

      void savePersonInfo();

      void checkPhone(String phone);

      void checkLogin(String phone,String pass);



    }
}
