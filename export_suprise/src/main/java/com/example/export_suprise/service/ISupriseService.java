package com.example.export_suprise.service;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.example.export_suprise.bean.SupriseInfo;

/**
 * Time:2021/10/7
 * Author:liuxiong
 * Description:
 */
public interface ISupriseService extends IProvider {
    SupriseInfo getSupriseInfo();
}
