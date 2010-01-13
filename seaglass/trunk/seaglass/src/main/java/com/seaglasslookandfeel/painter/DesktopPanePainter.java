/*
 * Copyright (c) 2009 Kathryn Huxtable and Kenneth Orr.
 *
 * This file is part of the SeaGlass Pluggable Look and Feel.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * $Id$
 */
package com.seaglasslookandfeel.painter;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Insets;

import javax.swing.JComponent;

import com.seaglasslookandfeel.painter.AbstractRegionPainter.PaintContext.CacheMode;

/**
 * Nimbus's DesktopPanePainter.
 */
public final class DesktopPanePainter extends AbstractRegionPainter {
    public static enum Which {
        BACKGROUND_ENABLED
    }

    private PaintContext           ctx;

    private Color                  desktopPaneColor = decodeColor("nimbusBase.DesktopPane", 0f, 0f, 0f, 0);

    private static final Insets    insets           = new Insets(0, 0, 0, 0);
    private static final Dimension dimension        = new Dimension(300, 232);
    private static final CacheMode cacheMode        = CacheMode.FIXED_SIZES;
    private static final Double    maxH             = Double.POSITIVE_INFINITY;
    private static final Double    maxV             = Double.POSITIVE_INFINITY;

    public DesktopPanePainter(Which state) {
        super();
        this.ctx = new PaintContext(insets, dimension, false, cacheMode, maxH, maxV);
    }

    protected void doPaint(Graphics2D g, JComponent c, int width, int height, Object[] extendedCacheKeys) {
        g.setColor(desktopPaneColor);
        g.fillRect(0, 0, width, height);
    }

    protected final PaintContext getPaintContext() {
        return ctx;
    }
}
