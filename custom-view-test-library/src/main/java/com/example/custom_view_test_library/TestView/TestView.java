package com.example.custom_view_test_library.TestView;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.custom_view_test_library.R;

public class TestView extends ConstraintLayout {

    ImageView joystickBack,joystickFront;

    public TestView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        LayoutInflater.from(context).inflate(R.layout.test_view, this, true);
        this.joystickBack = this.findViewById(R.id.joystick_back);
        this.joystickFront = this.findViewById(R.id.joystick_front);

        init();
    }

    private void init() {
        this.setBackgroundColor(Color.DKGRAY);

        LayoutParams paramsBack = new LayoutParams(500,500);
        paramsBack.topToTop = LayoutParams.PARENT_ID;
        paramsBack.bottomToBottom = LayoutParams.PARENT_ID;
        paramsBack.leftToLeft = LayoutParams.PARENT_ID;
        paramsBack.rightToRight = LayoutParams.PARENT_ID;
        joystickBack.setLayoutParams(paramsBack);

        LayoutParams paramsFront = new LayoutParams((int) (paramsBack.width*0.386), (int) (paramsBack.height*0.386));
        paramsFront.topToTop = LayoutParams.PARENT_ID;
        paramsFront.bottomToBottom = LayoutParams.PARENT_ID;
        paramsFront.leftToLeft = LayoutParams.PARENT_ID;
        paramsFront.rightToRight = LayoutParams.PARENT_ID;
        joystickFront.setLayoutParams(paramsFront);
    }
}
