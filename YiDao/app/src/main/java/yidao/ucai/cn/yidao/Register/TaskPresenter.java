package yidao.ucai.cn.yidao.Register;

import yidao.ucai.cn.yidao.Register.TaskContract;

/**
 * Created by Administrator on 2017/1/3.
 */
public class TaskPresenter implements TaskContract.Presenter{



    private final TaskContract.View contentView;

    public TaskPresenter(TaskContract.View contentView){
        this.contentView = contentView;
        contentView.setPresenter(this);

    }
    public void start() {


    }

    public void savePersonInfo(){

    }

    public void checkPhone(String phone){

        //与model层关联
        contentView.showMessage();
    }

    public void checkLogin(String phone,String pass){

        contentView.showMessage();

    }
}
