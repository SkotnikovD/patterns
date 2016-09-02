package com.company.pattern.behavioral.strategy;
/*********************************
 * PROPRIETARY/CONFIDENTIAL.  Use of this product is subject to license terms.
 * Copyright (c) 2016 NVision Group, Inc. All rights reserved.
 *
 * 19.07.2016 19:41
 *********************************/

import com.company.pattern.behavioral.strategy.rideable.ACAction;
import com.company.pattern.behavioral.strategy.rideable.CoolingMode;
import com.company.pattern.behavioral.strategy.rideable.HeatMode;

/**
 * @author Dmitry Skotnikov (DSkotnikov@nvision-group.com) on 19.07.2016.
 */
public enum ACMode {
    H, C;

    public static ACAction getActionForMode(ACMode acMode) {
        switch (acMode) {
            case C:
                return new CoolingMode();
            case H:
                return new HeatMode();
            default:
                throw new RuntimeException("Dead wrong");
        }
    }
}
