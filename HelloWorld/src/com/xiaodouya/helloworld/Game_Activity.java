package com.xiaodouya.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class Game_Activity extends Activity {

	BallView bv;		//BallView��������
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);		//���ò���ʾ����
        getWindow().setFlags(								//����Ϊȫ��ģʽ
        		WindowManager.LayoutParams.FLAG_FULLSCREEN, 
        		WindowManager.LayoutParams.FLAG_FULLSCREEN);
        bv = new BallView(this);	//����BallView����
        setContentView(bv);			//����Ļ����ΪBallView����
    }

}