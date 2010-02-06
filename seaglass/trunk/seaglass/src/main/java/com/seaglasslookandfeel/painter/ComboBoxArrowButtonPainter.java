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

import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.Shape;

import javax.swing.JComponent;

import com.seaglasslookandfeel.painter.AbstractRegionPainter.PaintContext.CacheMode;
import com.seaglasslookandfeel.painter.util.ShapeGenerator.CornerSize;
import com.seaglasslookandfeel.painter.util.ShapeGenerator.CornerStyle;

/**
 * ComboBoxArrowButtonPainter implementation.
 */
public final class ComboBoxArrowButtonPainter extends AbstractCommonColorsPainter {
    public static enum Which {
        BACKGROUND_DISABLED, BACKGROUND_ENABLED, BACKGROUND_PRESSED, BACKGROUND_SELECTED,

        FOREGROUND_ENABLED, FOREGROUND_DISABLED, FOREGROUND_PRESSED, FOREGROUND_SELECTED,

        FOREGROUND_ENABLED_EDITABLE, FOREGROUND_DISABLED_EDITABLE,
    }

    private Which             state;
    private PaintContext      ctx;

    private CommonControlType typestatic final Dimension fgEditableDimension  = new Dimension(6, 9);

    private Path2D                       this.ctx = new PaintContext(CacheMode.FIXED_SIZES     || stattype = getButtonType(state); 0xffb4d9ee, true), 0.4f, new Color(0x134D8C), new Color(0x4F7BBF), new Color(0x3F76BF)));
        setDisabled(new ButtonStateColors(new Color(0xc0F4F8FB, true), new Color(0x00ffffff, tru:
        case BACKGROUND_ENABLED:
        case BACKGROUND_PRESSED:
        case BACKGROUND_SELECTED:
            paintButton(g, c, width, height);
            break;
        case FOREGROUND_ENABLED:
        case FOREGROUND_DISABLED:
        case FOREGROUND_PRESSED:
        case FOREGROUND_SELECTED:
            paintArrows(g, c, width, height);
            break;
        case FOREGROUND_ENABLED_EDITABLE:
        case FOREGROUND_DISABLED_EDITABLE:
            paintArrowDown width, height);
            break;
        case FOREGROUND_ENABLED:
            paintArrowsEnabled(g, c, width, height);
            break;
        case FOREGCommonControlType getButtonType(Which state) {
        switch (state) {
        case BACKGROUND_DISABLED:
            return CommonControlType.DISABLED;
        case BACKGROUND_ENABLED:
            return CommonControlType.ENABLED;
        case BACKGROUND_PRESSED:
        case BACKGROUND_SELECTED:
            return CommonControlType.PRESSED;
        case FOREGROUND_ENABLED:
        case FOREGROUND_PRESSED:
        case FOREGROUND_SELECTED:
        case FOREGROUND_ENABLED_EDITABLE:
            return CommonControlType.ENABLED;
        case FOREGROUND_DISABLED:
        case FOREGROUND_DISABLED_EDITABLE:
            return CommonControlType.DISABLED;
        }
        return null;
    }

    private void paintButton(Graphics2D g, JComponent c, int width, int height }

    @Override
    protected PaintContext getPaintContext() {
        return ctx;
    }

    private void Shape stDicreateButtonPath(CornerSize.BORDER, 0, 2, width - 2, height - 4);
        g.setPaint(getComboBoxButtonBorderPaint(s, type));
        g.fill(s);

        s = createButtonPath(CornerSize.INTERIOR, 1, 3, width - 4, height - 6);
        g.setPaint(getComboBoxButtonInteriorPaint(s, type));
        g.fill(s);
    }

    private void paintArrows(3.5, 0.5);
        path.lineTo(0.5, 2.5);
        path.lineTo(3.5, 4.5);
        path.c5;
        int yOffset = height / 2 - 3    path.reset();
        path.moveTo(6.5, 0.5);
 Shape s = shapeGenerator.createArrowLeft(0.5, 0.5, 3, 4);
        g.setPaint(getCommonArrowPaint(s, type));
        g.fill(s);

        s = shapeGenerator.createArrowRight(6.5, 0.5, 3, 4);
        g.setPaint(getCommonArrowPaint(s, type));
        g.fill(s);

        g.translate(-xOffset, -yOffset);
    }

    private void paintArrowDown(3.5, 0.5);
        path.lineTo(0.5, 2.5);
        path.lineTo(3.5, 4.5);
        path.closePath();
        g.fill(path);

        path.reset();
        path.moveTo(6.5, 0.5);
 Shape s = shapeGenerator.createArrowLeft(1, 1, 4.2, 6);
        g.setPaint(getCommonArrowPaint(s, type));
        g.fill(s);

        g.translate(-xOffset, -yOffset);
    }

    private Shape createButtonPath(CornerSize size, int x, int y, int w, int h) {
        return shapeGenerator.createRoundRectangle(x, y, w, h, size, CornerStyle.SQUARE, CornerStyle.SQUARE, CornerStyle.ROUNDED,
            CornerStyle.ROUNDED);
    }

    public Paint getComboBoxButtonBorderPaint(Shape s, CommonControlType type) {
        TwoColors colors = getCommonBorderColors(type);
        return createVerticalGradient(s, colors);
    }

    public Paint getComboBoxButtonInteriorPaint(Shape s, CommonControlType type) {
        FourColors colors = getCommonInteriorColors(type);
        return createVerticalGradient(s, colors);
    }

    public TwoColors getCommonBorderColors(CommonControlType type) {
        switch (type) {
        case DISABLED:
            return super.getCommonBorderColors(CommonControlType.DISABLED);
        case ENABLED:
            return super.getCommonBorderColors(CommonControlType.PRESSED);
        case PRESSED:
            return super.getCommonBorderColors(CommonControlType.PRESSED_SELECTED);
        }
        return null;
    }

    public FourColors getCommonInteriorColors(CommonControlType type) {
        switch (type) {
        case DISABLED:
            return super.getCommonInteriorColors(CommonControlType.DISABLED);
        case ENABLED:
            return super.getCommonInteriorColors(CommonControlType.PRESSED);
        case PRESSED:
            return super.getCommonInteriorColors(CommonControlType.PRESSED_SELECTED);
        }
        return null;
    }
}
