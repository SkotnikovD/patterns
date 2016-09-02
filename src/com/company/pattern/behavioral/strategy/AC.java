package com.company.pattern.behavioral.strategy;
/*********************************
 * PROPRIETARY/CONFIDENTIAL.  Use of this product is subject to license terms.
 * Copyright (c) 2016 NVision Group, Inc. All rights reserved.
 *
 * 19.07.2016 19:38
 *********************************/

import com.company.pattern.behavioral.strategy.rideable.ACAction;

/**
 * @author Dmitry Skotnikov (DSkotnikov@nvision-group.com) on 19.07.2016.
 */
public class AC {
    private ACAction currentAction;

    public void switchToMode(ACMode newMode){
        currentAction = ACMode.getActionForMode(newMode);
        currentAction.doAction();
    }
}
