package cn.dagongniu.oax.viewincludedemo;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.dagongniu.oax.viewincludedemo.fragment.AFragment;
import cn.dagongniu.oax.viewincludedemo.view.MyLeftView;
import cn.dagongniu.oax.viewincludedemo.view.MyRightView;

public class MainActivity extends AppCompatActivity {

    AFragment mAFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

//        mAFragment = new AFragment();
//
//        //Fragment 的加载方式
//        FragmentTransaction fragmentTransaction = this.getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.replace(R.id.fragmenta, mAFragment);
//        fragmentTransaction.commit();

    }


}
