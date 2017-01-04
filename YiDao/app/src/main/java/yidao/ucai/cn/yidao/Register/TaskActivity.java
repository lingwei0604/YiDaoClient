package yidao.ucai.cn.yidao.Register;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.rengwuxian.materialedittext.MaterialEditText;

import yidao.ucai.cn.yidao.R;

/**
 * Created by Administrator on 2017/1/3.
 */
public class TaskActivity extends AppCompatActivity {


    private Toolbar mToolBar;
    private MaterialEditText edt_user,edt_pass;
    private Button btn_login,btn_regist;
    private TaskPresenter taskPresenter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initToolBar();


        TaskFragment taskFragment = (TaskFragment)
                getSupportFragmentManager().findFragmentById(R.id.contentFrame);


        taskPresenter = new TaskPresenter(taskFragment);
        taskFragment.setPresenter(taskPresenter);

    }




    private  void initToolBar(){
        mToolBar.setTitle("我要登录");
        setSupportActionBar(mToolBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mToolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }






}
