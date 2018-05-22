package cn.dagongniu.oax.viewincludedemo.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import cn.dagongniu.oax.viewincludedemo.R;

public class MyRightView extends FrameLayout {

    public MyRightView(Context context) {
        super(context);
    }

    public MyRightView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyRightView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public MyRightView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        Button mButton = (Button) this.findViewById(R.id.bt_right);
        mButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "A---MyRightView::::right", Toast.LENGTH_LONG).show();
            }
        });
    }
}
