package com.feicui.TreasureMap.home;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;


import com.feicui.TreasureMap.R;
import com.feicui.TreasureMap.home.Treasure;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 宝藏卡片视图
 * 作者：yuanchao on 2016/7/19 0019 16:11
 * 邮箱：yuanchao@feicuiedu.com
 */
public class TreasureView extends RelativeLayout{

    public TreasureView(Context context) {
        super(context);
        init();
    }

    public TreasureView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TreasureView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    // 用来显示宝藏title
    @Bind(R.id.tv_treasureTitle)TextView tvTitle;
    // 用来显示宝藏位置描述
    @Bind(R.id.tv_treasureLocation)TextView tvLocation;
    // 用来显示宝藏距离
    @Bind(R.id.tv_distance)TextView tv_Distance;

    private void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.view_treasure,this,true);
        ButterKnife.bind(this);
    }

    /** 将宝藏数据，绑定到当前视图上(卡片)*/
    public void bindTreasure(@NonNull Treasure treasure){
        tvTitle.setText(treasure.getTitle());
        tvLocation.setText(treasure.getLocation());
        double distance = 0.00D;
        tv_Distance.setText("0.00KM");
    }
}
