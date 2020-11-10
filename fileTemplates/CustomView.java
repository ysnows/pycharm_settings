package ${PACKAGE_NAME}.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.LinearLayout;


import com.ysnows.common.mvp.BaseView;

import java.util.ArrayList;

/**
 * Created by xianguangjin on 16/6/1.
 * 自定义
 */

public class ${name} extends LinearLayout {


    private BaseView view;


    public ${name}(Context context) {
        this(context, null);

    }

    public ${name}(Context context, AttributeSet attrs) {
        this(context, attrs, 0);


    }

    public ${name}(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr);

    }

    private void init(Context context, AttributeSet attrs, int defStyleAttr) {
        if (context instanceof BaseView) {
            this.view = (BaseView) context;
        }

        inflate(context, R.layout.${layout}, this);
 
    }


}
