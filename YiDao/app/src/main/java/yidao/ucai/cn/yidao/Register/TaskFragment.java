package yidao.ucai.cn.yidao.Register;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.rengwuxian.materialedittext.MaterialEditText;

import yidao.ucai.cn.yidao.R;

/**
 * Created by Administrator on 2017/1/3.
 */
public class TaskFragment extends Fragment implements TaskContract.View,View.OnClickListener{

    private MaterialEditText edt_user,edt_pass;
    private Button btn_login,btn_regist;
    private String user,pass,phone;
    private TaskContract.Presenter mPresenter;

    public static TaskFragment newInstance() {
        return new TaskFragment();
    }
    public TaskFragment(){

    }

    public void setPresenter(TaskContract.Presenter presenter) {
        mPresenter =presenter;
    }
    @Override
    public void onResume() {
        super.onResume();
        mPresenter.start();
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.activity_login, container, false);
        edt_user= (MaterialEditText) root.findViewById(R.id.edt_user);
        edt_pass= (MaterialEditText)root. findViewById(R.id.edt_password);
        btn_login= (Button)root. findViewById(R.id.btn_login);
        btn_regist= (Button)root. findViewById(R.id.btn_regist);
        return root;

    }

    public void doEvent(){
        btn_login.setOnClickListener(this);
        btn_regist.setOnClickListener(this);
    }

    public void showEmptyList(){

    }

    public void showOrderList(){

    }

    public void showMessage(){

    }

    public void getMessage(){
        user = edt_user.getText().toString();
        pass = edt_pass.getText().toString();
    }
    public  void onClick(View v){

        switch(v.getId()){

            case R.id.btn_login:
                getMessage();
                 mPresenter.checkLogin(user,pass);
                break;
            case R.id.btn_regist:
                mPresenter.checkPhone(user);
                break;
        }
    }

}
