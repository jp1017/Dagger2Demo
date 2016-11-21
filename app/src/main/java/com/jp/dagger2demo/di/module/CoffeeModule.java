/*
******************************* Copyright (c)*********************************\
**
**                 (c) Copyright 2015, 蒋朋, china, qd. sd
**                          All Rights Reserved
**
**                           By(青岛世新科技有限公司)
**                         
**-----------------------------------版本信息------------------------------------
** 版    本: V0.1
**
**------------------------------------------------------------------------------
********************************End of Head************************************\
*/

package com.jp.dagger2demo.di.module;

import com.jp.dagger2demo.CoffeeMachine;
import com.jp.dagger2demo.CoffeeMaker;
import com.jp.dagger2demo.Cooker;
import com.jp.dagger2demo.SimpleMaker;

import dagger.Module;
import dagger.Provides;

/**
 * 文 件 名: CoffeeModule
 * 说   明:
 * 创 建 人: 蒋朋
 * 创建日期: 16-11-20 19:20
 * 邮   箱: jp19891017@gmail.com
 * 博   客: http://jp1017.github.io
 * 修改时间：
 * 修改备注：
 */
@Module
public class CoffeeModule {
    private String name;
    private String coffeeKind;

    public CoffeeModule(String name, String coffeeKind) {
        this.name = name;
        this.coffeeKind = coffeeKind;
    }

    @Provides
    public Cooker provideCooker() {
        return new Cooker(name, coffeeKind);
    }

    @Provides
    public CoffeeMachine provideCoffeeMachine(SimpleMaker coffeeMaker) {
        return new CoffeeMachine(coffeeMaker);
    }

/*    @Provides
    public SimpleMaker provideCoffeeMaker(Cooker cooker) {
        return new SimpleMaker(cooker);
    }*/

}
