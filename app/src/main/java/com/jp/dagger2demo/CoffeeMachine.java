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

package com.jp.dagger2demo;

import javax.inject.Inject;

/**
 * 文 件 名: CoffeeMachine
 * 说   明:
 * 创 建 人: 蒋朋
 * 创建日期: 16-11-20 18:44
 * 邮   箱: jp19891017@gmail.com
 * 博   客: http://jp1017.github.io
 * 修改时间：
 * 修改备注：
 */
public class CoffeeMachine {

    private CoffeeMaker mCoffeeMaker;

    public CoffeeMachine(CoffeeMaker coffeeMaker) {
        mCoffeeMaker = coffeeMaker;
    }

    public String makeCoffee() {
        return mCoffeeMaker.makeCoffee();
    }

}
