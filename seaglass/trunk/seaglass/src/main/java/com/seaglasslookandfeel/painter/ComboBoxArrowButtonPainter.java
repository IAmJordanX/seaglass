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
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;

import javax.swing.JComponent;

import com.seaglasslookandfeel.painter.AbstractRegionPainter.PaintContext.CacheMode;
import com.seaglasslookandfeel.painter.util.PaintUtil;
import com.seaglasslookandfeel.painter.util.ShapeUtil;
import com.seaglasslookandfeel.painter.util.PaintUtil.ButtonType;
import com.seaglasslookandfeel.painter.util.ShapeUtil.CornerSize;
import com.seaglasslookandfeel.painter.util.ShapeUtil.CornerStyle;

/**
 * ComboBoxArrowButtonPainter implementation.
 */
public final class ComboBoxArrowButtonPainter extends AbstractRegionPainter {
    public static enum Which {
        BACKGROUND_DISABLED,
        BACKGROUND_ENABLED,
        BACKGROUND_ENABLED_PRESSED,
        BACKGROUND_DISABLED_EDITABLE,
        BACKGROUND_ENABLED_EDITABLE,
        BACKGROUND_PRESSED_EDITABLE,
        BACKGROUND_SELECTED_EDITABLE,
        FOREGROUND_ENABLED,
        FOREGROUND_DISABLED,
        FOREGROUND_PRESSED,
        FOREGROUND_SELECTED,
        FOREGROUND_EDITABLE,
        FOREGROUND_EDITABLE_DISABLED,
    }

    private static final Color ENABLED_ARROW_COLOR  = new Color(0x000000);
    private static final Color DISABLED_ARROW_COLOR = new Color(0x9ba8cf);

    private Which              state;
    private PaintContext       ctx;

    private ButtonType         typestatic final Dimension fgEditableDimension  = new Dimension(6, 9);

    private Path2D                       this.ctx = new PaintContext(CacheMode.FIXED_SIZES     || stattype = getButtonType(state); 0xffb4d9ee, true), 0.4f, new Color(0x134D8C), new Color(0x4F7BBF), new Color(0x3F76BF)));
        setDisabled(new ButtonStateColors(new Color(0xc0F4F8FB, true), new Color(0x00ffffff, true), new Color(0x00A8D9FC, true), new Color(
            0xffF7FCFF, true), 0.4f, new Color(0xeeeeee), new Color(0x8AAFE0), new Color(0x5785BF)));
    }

    public void setEnabled(ButtonStateColors enabled) {
        this.enabled = enabled;
    }

    public void setPressed(ButtonStateColors enabledPressed) {
        this.pressed = enabledPressed;
    }

    public void setDisabled(ButtonStateColors defaultButton) {
        this.disabled = defaultButton;
    }

    @Override
    protected void doPaint(Graphics2D g, JComponent c, int width, int height, Object[] extendedCacheKeys) {
        switch (state) {
        case BACKGROUND_DISABLED_EDITABLE:
            paintDisabledEditable(g, c, width, height);
            break;
        case BACKGROUND_ENABLED_EDITABLE:
            paintEnabledEditable(g, c, width, height);
            break;
        case BACKGROUND_PRESSED_EDITABLE:
            paintPressedEditable(g, c, width, height);
            break;
        case BACKGROUND_SELECTED_EDITABLE:
            paintPressedEditable(g, c, width, height);
            break;
        case FOREGROUND_ENABLED:
            paintArrowsEnabled(g, c, width, height);
            break;
        case FOREGButtonType getButtonType(Which stateColors(new Color(0xc0F4F8FB, true), new Color(0x00ffffff, true), new Color(0x00A8D9Freturn ButtonType.DISABLED;
        case BACKGROUND_ENABLED_EDITABLE:
            return ButtonType.ENABLED;
        case BACKGROUND_PRESSED_EDITABLE:
        case BACKGROUND_SELECTED_EDITABLE:
            return ButtonType.PRESSED;
        }
        return nullk;
        case FOREGROUND_DISABLED:
            paintArrowsDisabled(g, c, width, height);
            break;
        case FOREGROUND_PRESSE     paintArrowsEnabled(g, c, width, height);
            break;
        case FOREGROUND_SELECTED:
            paintArrowsEnabled(g, c, widt);
            break;
        case FOREGROUND_EDITABLE:
            paintArrowDownEnabled(g, c, width, height);
            break;
        c);
    }

    private void paintButton(Graphics2D g, JComponent c, int width, int height }

    @Override
    protected PaintContext getPaintContext() {
        return ctx;
    }

    private void Shape stDicreateButtonPath(CornerSize.BORDER, 0, 2, width - 2, height - 4);
        g.setPaint(PaintUtil.getComboBoxButtonBorderPaint(s, type));
        g.fill(s);

        s = createButtonPath(CornerSize.INTERIOR, 1, 3, width - 4, height - 6);
        g.setPaint(PaintUtil.getComboBoxButtonInteriorMainPaint(s, type));
        g.fill(s);
        g.setPaint(PaintUtil.getComboBoxButtonInteriorLowerShinePaint(s, type));
        g.fill(s);
        g.setPaint(PaintUtil.getComboBoxButtonInteriorUpperShinePaint(s, type));
        g.fill(s);
    }

    private void paintArrows.moveTo(3.5, 0.5);
        path.lineTo(0.5, 2.5);
        path.lineTo(3.5, 4.5);
        path.c5;
        int yOffset = height / 2 - 3    path.reset();
        path.moveTo(6.5, 0.5);
 Shape s = ShapeUtil.createArrowLeft(0.5, 0.5, 3, 4);
        g.setColor(ENABLED_ARROW_COLOR);
        g.fill(s);

        s = ShapeUtil.createArrowRight(6.5, 0.5, 3, 4);
        g.fill(sht) {
        g.setColor(DISABLED_ARROW_COLOR);

        path.reset();
        sDisoveTo(3.5, 0.5);
        path.lineTo(0.5, 2.5);
        path.lineTo(3.5, 4.5);
        path.c5;
        int yOffset = height / 2 - 3    path.reset();
        path.moveTo(6.5, 0.5);
 Shape s = ShapeUtil.createArrowLeft(0.5, 0.5, 3, 4);
        g.setColor(DISABLED_ARROW_COLOR);
        g.fill(s);

        s = ShapeUtil.createArrowRight(6.5, 0.5, 3, 4);
        g.fill(sht) {
        g.setColor(DISABLED_ARROW_COLOR);

        path.reset();
        path.moveTo(3.5, 0.5);
        path.lineTo(0.5, 2.5);
        path.lineTo(3.5, 4.5);
        path.closePath();
        g.fill(path);

        path.reset();
        path.moveTo(6.5, 0.5);
 Shape s = ShapeUtil.createArrowLeft(1, 1, 4.2, 6);
        g.setColor(ENABLED_ARROW_COLOR);
        g.fill(sht) {
        g.setColor(DISABLED_ARROW_COLOR);

        path.reset();
        pathDisenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        path = decodeBorLED_ARROW_COLOR);
        g.fill(path);
    }

    private void paintArrowDownDisabled(GrShape s = ShapeUtil.createArrowLeft(1, 1, 4.2, 6);
        g.setColor(DISABLED_ARROW_COLOR);
        g.fill(s);

        g.translate(-xOffset, -yOffset);
    }

    private Shape createButtonPath(CornerSize size, int x, int y, int w, int h) {
        return ShapeUtil.createRoundRectangle(x, y, w, h, size, CornerStyle.SQUARE, CornerStyle.SQUARE, CornerStyle.ROUNDED,
            CornerStyle.ROUNDED);
    }
}
