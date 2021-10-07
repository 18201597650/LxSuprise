package com.example.export_suprise;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.export_suprise.bean.SupriseInfo;
import com.example.export_suprise.router.SupriseRouterTable;
import com.example.export_suprise.service.ISupriseService;

/**
 * Time:2021/10/7
 * Author:liuxiong
 * Description:
 */
public class SupriseServiceUtil {
    /**
     * 跳转到购物车页面
     * @param param1
     * @param param2
     */
    public static void navigateCartPage(String param1, String param2){
        ARouter.getInstance()
                .build(SupriseRouterTable.PATH_PAGE_SUPRISE)
                .withString("key1",param1)
                .withString("key2",param2)
                .navigation();
    }

    /**
     * 获取服务
     * @return
     */
    public static ISupriseService getService(){
        //return ARouter.getInstance().navigation(ICartService.class);//如果只有一个实现，这种方式也可以
        return (ISupriseService) ARouter.getInstance().build(SupriseRouterTable.PATH_SERVICE_SUPRISE).navigation();
    }

    /**
     * 获取购物车中商品数量
     * @return
     */
    public static SupriseInfo getHdInfo(){
        return getService().getSupriseInfo();
    }

}
