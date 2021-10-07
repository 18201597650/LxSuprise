package com.example.module_suprise;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.export_suprise.router.SupriseRouterTable;

@Route(path = "/suprise/SupriseActivity")
public class SupriseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suprise);

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction= manager.beginTransaction();

        Fragment userFragment = (Fragment) ARouter.getInstance().build(SupriseRouterTable.PATH_FRAGMENT_SUPRISE).navigation();
        transaction.add(R.id.fl_test_fragment, userFragment, "tag");
        transaction.commit();
    }
}