package com.example.module_suprise;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.export_suprise.bean.SupriseInfo;
import com.example.export_suprise.router.SupriseRouterTable;
import com.example.export_suprise.service.ISupriseService;

/**
 * Time:2021/10/8
 * Author:liuxiong
 * Description:
 */
@Route(path = SupriseRouterTable.PATH_SERVICE_SUPRISE)
public class SupriseServiceImp implements ISupriseService {
    @Override
    public SupriseInfo getSupriseInfo() {
        SupriseInfo supriseInfo=new SupriseInfo();
        supriseInfo.supriseInfo="惊喜页面信息";
        return supriseInfo;
    }

    @Override
    public void init(Context context) {

    }
}
