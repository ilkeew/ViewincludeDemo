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

public class MyLeftView extends FrameLayout {

    public MyLeftView(Context context) {
        super(context);
    }

    public MyLeftView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyLeftView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public MyLeftView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        Button mButton = (Button) this.findViewById(R.id.bt_left);
        mButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "B---MyLeftView::::left", Toast.LENGTH_LONG).show();
            }
        });
    }
}
