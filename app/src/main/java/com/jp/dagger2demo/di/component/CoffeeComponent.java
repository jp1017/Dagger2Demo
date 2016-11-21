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

package com.jp.dagger2demo.di.component;

import com.jp.dagger2demo.CoffeeMachine;
import com.jp.dagger2demo.MainActivity;
import com.jp.dagger2demo.di.module.CoffeeModule;

import dagger.Component;
import dagger.Module;

/**
 * 文 件 名: CoffeeComponent
 * 说   明:
 * 创 建 人: 蒋朋
 * 创建日期: 16-11-20 19:08
 * 邮   箱: jp19891017@gmail.com
 * 博   客: http://jp1017.github.io
 * 修改时间：
 * 修改备注：
 */
@Component(modules = CoffeeModule.class)
public interface CoffeeComponent {
    void inject(MainActivity mainActivity);

}
