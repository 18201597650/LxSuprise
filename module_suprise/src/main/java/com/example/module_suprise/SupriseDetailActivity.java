package com.example.module_suprise;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.export_suprise.router.SupriseRouterTable;

/**
 * Time:2021/10/7
 * Author:liuxiong
 * Description:
 */
@Route(path = SupriseRouterTable.PATH_PAGE_SUPRISE_DETAIL)
public class SupriseDetailActivity extends AppCompatActivity {
    public static void jump(Context context){
        Intent intent =new Intent(context, SupriseDetailActivity.class);
        context.startActivity(intent);
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suprise_detail);

    }
}
