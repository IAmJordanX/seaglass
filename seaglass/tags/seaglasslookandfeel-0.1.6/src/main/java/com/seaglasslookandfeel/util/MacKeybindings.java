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
package com.seaglasslookandfeel.util;

import javax.swing.JTextField;
import javax.swing.UIDefaults;
import javax.swing.text.DefaultEditorKit;

/**
 * Install Mac keyboard bindings.
 */
public class MacKeybindings {

    public static void installKeybindings(UIDefaults table) {

        UIDefaults.LazyInputMap buttonFocusInputMap = new UIDefaults.LazyInputMap(new Object[] {
            "SPACE", "pressed",
            "released SPACE", "released"
        });

        // Input map for text fields
        UIDefaults.LazyInputMap fieldInputMap = new UIDefaults.LazyInputMap(new String[] {
            "BACK_SPACE", DefaultEditorKit.deletePrevCharAction,
            "DELETE", DefaultEditorKit.deleteNextCharAction,
            "meta X", DefaultEditorKit.cutAction,
            "meta C", DefaultEditorKit.copyAction,
            "meta V", DefaultEditorKit.pasteAction,
            "CUT", DefaultEditorKit.cutAction,
            "COPY", DefaultEditorKit.copyAction,
            "PASTE", DefaultEditorKit.pasteAction,
            "RIGHT", DefaultEditorKit.forwardAction,
            "KP_RIGHT", DefaultEditorKit.forwardAction,
            "LEFT", DefaultEditorKit.backwardAction,
            "KP_LEFT", DefaultEditorKit.backwardAction,
            "shift RIGHT", DefaultEditorKit.selectionForwardAction,
            "shift KP_RIGHT", DefaultEditorKit.selectionForwardAction,
            "shift LEFT", DefaultEditorKit.selectionBackwardAction,
            "shift KP_LEFT", DefaultEditorKit.selectionBackwardAction,
            "UP", DefaultEditorKit.upAction,
            "KP_UP", DefaultEditorKit.upAction,
            "DOWN", DefaultEditorKit.downAction,
            "KP_DOWN", DefaultEditorKit.downAction,
            "shift UP", DefaultEditorKit.selectionUpAction,
            "shift KP_UP", DefaultEditorKit.selectionUpAction,
            "shift DOWN", DefaultEditorKit.selectionDownAction,
            "shift KP_DOWN", DefaultEditorKit.selectionDownAction,
            "alt LEFT", DefaultEditorKit.previousWordAction,
            "alt KP_LEFT", DefaultEditorKit.previousWordAction,
            "alt RIGHT", DefaultEditorKit.nextWordAction,
            "alt KP_RIGHT", DefaultEditorKit.nextWordAction,
            "alt shift LEFT", DefaultEditorKit.selectionPreviousWordAction,
            "alt shift KP_LEFT", DefaultEditorKit.selectionPreviousWordAction,
            "alt shift RIGHT", DefaultEditorKit.selectionNextWordAction,
            "alt shift KP_RIGHT", DefaultEditorKit.selectionNextWordAction,
            "alt UP", DefaultEditorKit.beginLineAction,
            "alt KP_UP", DefaultEditorKit.beginLineAction,
            "ctrl LEFT", DefaultEditorKit.beginLineAction,
            "ctrl KP_LEFT", DefaultEditorKit.beginLineAction,
            "meta LEFT", DefaultEditorKit.beginLineAction,
            "meta KP_LEFT", DefaultEditorKit.beginLineAction,
            "alt DOWN", DefaultEditorKit.endLineAction,
            "alt KP_DOWN", DefaultEditorKit.endLineAction,
            "ctrl RIGHT", DefaultEditorKit.endLineAction,
            "ctrl KP_RIGHT", DefaultEditorKit.endLineAction,
            "meta RIGHT", DefaultEditorKit.endLineAction,
            "meta KP_RIGHT", DefaultEditorKit.endLineAction,
            "ctrl shift LEFT", DefaultEditorKit.selectionBeginLineAction,
            "ctrl shift KP_LEFT", DefaultEditorKit.selectionBeginLineAction,
            "meta shift LEFT", DefaultEditorKit.selectionBeginLineAction,
            "meta shift KP_LEFT", DefaultEditorKit.selectionBeginLineAction,
            "ctrl shift RIGHT", DefaultEditorKit.selectionEndLineAction,
            "ctrl shift KP_RIGHT", DefaultEditorKit.selectionEndLineAction,
            "meta shift RIGHT", DefaultEditorKit.selectionEndLineAction,
            "meta shift KP_RIGHT", DefaultEditorKit.selectionEndLineAction,
            "HOME", DefaultEditorKit.beginAction,
            "END", DefaultEditorKit.endAction,
            "meta UP", DefaultEditorKit.beginAction,
            "meta KP_UP", DefaultEditorKit.beginAction,
            "meta DOWN", DefaultEditorKit.endAction,
            "meta KP_DOWN", DefaultEditorKit.endAction,
            "shift HOME", DefaultEditorKit.selectionBeginAction,
            "shift END", DefaultEditorKit.selectionEndAction,
            "meta A", DefaultEditorKit.selectAllAction,
            "meta shift A", "unselect",
            "controlBackground shift O", "toggle-componentOrientation",
            "alt DELETE", MacEditorKit.deleteNextWordAction,
            "alt BACK_SPACE", MacEditorKit.deletePrevWordAction,
            "ENTER", JTextField.notifyAction,
        });

        // Input map for password fields
        UIDefaults.LazyInputMap passwordFieldInputMap = new UIDefaults.LazyInputMap(new String[] {
            "BACK_SPACE", DefaultEditorKit.deletePrevCharAction,
            "DELETE", DefaultEditorKit.deleteNextCharAction,
            "meta X", DefaultEditorKit.beepAction,
            "meta C", DefaultEditorKit.beepAction,
            "meta V", DefaultEditorKit.pasteAction,
            "CUT", DefaultEditorKit.beepAction,
            "COPY", DefaultEditorKit.beepAction,
            "PASTE", DefaultEditorKit.pasteAction,
            "RIGHT", DefaultEditorKit.forwardAction,
            "KP_RIGHT", DefaultEditorKit.forwardAction,
            "LEFT", DefaultEditorKit.backwardAction,
            "KP_LEFT", DefaultEditorKit.backwardAction,
            "shift RIGHT", DefaultEditorKit.selectionForwardAction,
            "shift KP_RIGHT", DefaultEditorKit.selectionForwardAction,
            "shift LEFT", DefaultEditorKit.selectionBackwardAction,
            "shift KP_LEFT", DefaultEditorKit.selectionBackwardAction,
            "UP", DefaultEditorKit.upAction,
            "KP_UP", DefaultEditorKit.upAction,
            "DOWN", DefaultEditorKit.downAction,
            "KP_DOWN", DefaultEditorKit.downAction,
            "shift UP", DefaultEditorKit.selectionUpAction,
            "shift KP_UP", DefaultEditorKit.selectionUpAction,
            "shift DOWN", DefaultEditorKit.selectionDownAction,
            "shift KP_DOWN", DefaultEditorKit.selectionDownAction,
            "alt LEFT", DefaultEditorKit.previousWordAction,
            "alt KP_LEFT", DefaultEditorKit.previousWordAction,
            "alt RIGHT", DefaultEditorKit.nextWordAction,
            "alt KP_RIGHT", DefaultEditorKit.nextWordAction,
            "alt shift LEFT", DefaultEditorKit.selectionPreviousWordAction,
            "alt shift KP_LEFT", DefaultEditorKit.selectionPreviousWordAction,
            "alt shift RIGHT", DefaultEditorKit.selectionNextWordAction,
            "alt shift KP_RIGHT", DefaultEditorKit.selectionNextWordAction,
            "alt UP", DefaultEditorKit.beginLineAction,
            "alt KP_UP", DefaultEditorKit.beginLineAction,
            "ctrl LEFT", DefaultEditorKit.beginLineAction,
            "ctrl KP_LEFT", DefaultEditorKit.beginLineAction,
            "meta LEFT", DefaultEditorKit.beginLineAction,
            "meta KP_LEFT", DefaultEditorKit.beginLineAction,
            "alt DOWN", DefaultEditorKit.endLineAction,
            "alt KP_DOWN", DefaultEditorKit.endLineAction,
            "ctrl RIGHT", DefaultEditorKit.endLineAction,
            "ctrl KP_RIGHT", DefaultEditorKit.endLineAction,
            "meta RIGHT", DefaultEditorKit.endLineAction,
            "meta KP_RIGHT", DefaultEditorKit.endLineAction,
            "ctrl shift LEFT", DefaultEditorKit.selectionBeginLineAction,
            "ctrl shift KP_LEFT", DefaultEditorKit.selectionBeginLineAction,
            "meta shift LEFT", DefaultEditorKit.selectionBeginLineAction,
            "meta shift KP_LEFT", DefaultEditorKit.selectionBeginLineAction,
            "ctrl shift RIGHT", DefaultEditorKit.selectionEndLineAction,
            "ctrl shift KP_RIGHT", DefaultEditorKit.selectionEndLineAction,
            "meta shift RIGHT", DefaultEditorKit.selectionEndLineAction,
            "meta shift KP_RIGHT", DefaultEditorKit.selectionEndLineAction,
            "HOME", DefaultEditorKit.beginAction,
            "END", DefaultEditorKit.endAction,
            "meta UP", DefaultEditorKit.beginAction,
            "meta KP_UP", DefaultEditorKit.beginAction,
            "meta DOWN", DefaultEditorKit.endAction,
            "meta KP_DOWN", DefaultEditorKit.endAction,
            "shift HOME", DefaultEditorKit.selectionBeginAction,
            "shift END", DefaultEditorKit.selectionEndAction,
            "meta A", DefaultEditorKit.selectAllAction,
            "meta shift A", "unselect",
            "controlBackground shift O", "toggle-componentOrientation",
            "alt DELETE", MacEditorKit.deleteNextWordAction,
            "alt BACK_SPACE", MacEditorKit.deletePrevWordAction,
            "ENTER", JTextField.notifyAction,
        });

        // Input map for spinner editors
        UIDefaults.LazyInputMap spinnerInputMap = new UIDefaults.LazyInputMap(new String[] {
            "BACK_SPACE", DefaultEditorKit.deletePrevCharAction,
            "DELETE", DefaultEditorKit.deleteNextCharAction,
            "meta X", DefaultEditorKit.cutAction,
            "meta C", DefaultEditorKit.copyAction,
            "meta V", DefaultEditorKit.pasteAction,
            "CUT", DefaultEditorKit.cutAction,
            "COPY", DefaultEditorKit.copyAction,
            "PASTE", DefaultEditorKit.pasteAction,
            "RIGHT", DefaultEditorKit.forwardAction,
            "KP_RIGHT", DefaultEditorKit.forwardAction,
            "LEFT", DefaultEditorKit.backwardAction,
            "KP_LEFT", DefaultEditorKit.backwardAction,
            "shift RIGHT", DefaultEditorKit.selectionForwardAction,
            "shift KP_RIGHT", DefaultEditorKit.selectionForwardAction,
            "shift LEFT", DefaultEditorKit.selectionBackwardAction,
            "shift KP_LEFT", DefaultEditorKit.selectionBackwardAction,
            "UP", "increment",
            "KP_UP", "increment",
            "DOWN", "decrement",
            "KP_DOWN", "decrement",
            "shift UP", DefaultEditorKit.selectionUpAction,
            "shift KP_UP", DefaultEditorKit.selectionUpAction,
            "shift DOWN", DefaultEditorKit.selectionDownAction,
            "shift KP_DOWN", DefaultEditorKit.selectionDownAction,
            "alt LEFT", DefaultEditorKit.previousWordAction,
            "alt KP_LEFT", DefaultEditorKit.previousWordAction,
            "alt RIGHT", DefaultEditorKit.nextWordAction,
            "alt KP_RIGHT", DefaultEditorKit.nextWordAction,
            "alt shift LEFT", DefaultEditorKit.selectionPreviousWordAction,
            "alt shift KP_LEFT", DefaultEditorKit.selectionPreviousWordAction,
            "alt shift RIGHT", DefaultEditorKit.selectionNextWordAction,
            "alt shift KP_RIGHT", DefaultEditorKit.selectionNextWordAction,
            "alt UP", DefaultEditorKit.beginLineAction,
            "alt KP_UP", DefaultEditorKit.beginLineAction,
            "ctrl LEFT", DefaultEditorKit.beginLineAction,
            "ctrl KP_LEFT", DefaultEditorKit.beginLineAction,
            "meta LEFT", DefaultEditorKit.beginLineAction,
            "meta KP_LEFT", DefaultEditorKit.beginLineAction,
            "alt DOWN", DefaultEditorKit.endLineAction,
            "alt KP_DOWN", DefaultEditorKit.endLineAction,
            "ctrl RIGHT", DefaultEditorKit.endLineAction,
            "ctrl KP_RIGHT", DefaultEditorKit.endLineAction,
            "meta RIGHT", DefaultEditorKit.endLineAction,
            "meta KP_RIGHT", DefaultEditorKit.endLineAction,
            "ctrl shift LEFT", DefaultEditorKit.selectionBeginLineAction,
            "ctrl shift KP_LEFT", DefaultEditorKit.selectionBeginLineAction,
            "meta shift LEFT", DefaultEditorKit.selectionBeginLineAction,
            "meta shift KP_LEFT", DefaultEditorKit.selectionBeginLineAction,
            "ctrl shift RIGHT", DefaultEditorKit.selectionEndLineAction,
            "ctrl shift KP_RIGHT", DefaultEditorKit.selectionEndLineAction,
            "meta shift RIGHT", DefaultEditorKit.selectionEndLineAction,
            "meta shift KP_RIGHT", DefaultEditorKit.selectionEndLineAction,
            "HOME", DefaultEditorKit.beginAction,
            "END", DefaultEditorKit.endAction,
            "meta UP", DefaultEditorKit.beginAction,
            "meta KP_UP", DefaultEditorKit.beginAction,
            "meta DOWN", DefaultEditorKit.endAction,
            "meta KP_DOWN", DefaultEditorKit.endAction,
            "shift HOME", DefaultEditorKit.selectionBeginAction,
            "shift END", DefaultEditorKit.selectionEndAction,
            "meta A", DefaultEditorKit.selectAllAction,
            "meta shift A", "unselect",
            "controlBackground shift O", "toggle-componentOrientation",
            "alt DELETE", MacEditorKit.deleteNextWordAction,
            "alt BACK_SPACE", MacEditorKit.deletePrevWordAction,
            "ENTER", JTextField.notifyAction,
        });

        // Input map for multiline text fields
        UIDefaults.LazyInputMap multilineInputMap = new UIDefaults.LazyInputMap(new String[] {
            "shift ENTER", DefaultEditorKit.insertBreakAction,
            "alt ENTER", DefaultEditorKit.insertBreakAction,
            "ENTER", DefaultEditorKit.insertBreakAction,
            "TAB", DefaultEditorKit.insertTabAction,
            "BACK_SPACE", DefaultEditorKit.deletePrevCharAction,
            "DELETE", DefaultEditorKit.deleteNextCharAction,
            "meta X", DefaultEditorKit.cutAction,
            "meta C", DefaultEditorKit.copyAction,
            "meta V", DefaultEditorKit.pasteAction,
            "CUT", DefaultEditorKit.cutAction,
            "COPY", DefaultEditorKit.copyAction,
            "PASTE", DefaultEditorKit.pasteAction,
            "PAGE_UP", DefaultEditorKit.pageUpAction,
            "PAGE_DOWN", DefaultEditorKit.pageDownAction,
            "shift PAGE_UP", "selection-page-up",
            "shift PAGE_DOWN", "selection-page-down",
            "ctrl shift PAGE_UP", "selection-page-left",
            "ctrl shift PAGE_DOWN", "selection-page-right",
            "RIGHT", DefaultEditorKit.forwardAction,
            "KP_RIGHT", DefaultEditorKit.forwardAction,
            "LEFT", DefaultEditorKit.backwardAction,
            "KP_LEFT", DefaultEditorKit.backwardAction,
            "shift RIGHT", DefaultEditorKit.selectionForwardAction,
            "shift KP_RIGHT", DefaultEditorKit.selectionForwardAction,
            "shift LEFT", DefaultEditorKit.selectionBackwardAction,
            "shift KP_LEFT", DefaultEditorKit.selectionBackwardAction,
            "UP", DefaultEditorKit.upAction,
            "KP_UP", DefaultEditorKit.upAction,
            "DOWN", DefaultEditorKit.downAction,
            "KP_DOWN", DefaultEditorKit.downAction,
            "shift UP", DefaultEditorKit.selectionUpAction,
            "shift KP_UP", DefaultEditorKit.selectionUpAction,
            "shift DOWN", DefaultEditorKit.selectionDownAction,
            "shift KP_DOWN", DefaultEditorKit.selectionDownAction,
            "alt LEFT", DefaultEditorKit.previousWordAction,
            "alt KP_LEFT", DefaultEditorKit.previousWordAction,
            "alt RIGHT", DefaultEditorKit.nextWordAction,
            "alt KP_RIGHT", DefaultEditorKit.nextWordAction,
            "alt shift LEFT", DefaultEditorKit.selectionPreviousWordAction,
            "alt shift KP_LEFT", DefaultEditorKit.selectionPreviousWordAction,
            "alt shift RIGHT", DefaultEditorKit.selectionNextWordAction,
            "alt shift KP_RIGHT", DefaultEditorKit.selectionNextWordAction,
            "alt UP", DefaultEditorKit.beginLineAction,
            "alt KP_UP", DefaultEditorKit.beginLineAction,
            "ctrl LEFT", DefaultEditorKit.beginLineAction,
            "ctrl KP_LEFT", DefaultEditorKit.beginLineAction,
            "meta LEFT", DefaultEditorKit.beginLineAction,
            "meta KP_LEFT", DefaultEditorKit.beginLineAction,
            "alt DOWN", DefaultEditorKit.endLineAction,
            "alt KP_DOWN", DefaultEditorKit.endLineAction,
            "ctrl RIGHT", DefaultEditorKit.endLineAction,
            "ctrl KP_RIGHT", DefaultEditorKit.endLineAction,
            "meta RIGHT", DefaultEditorKit.endLineAction,
            "meta KP_RIGHT", DefaultEditorKit.endLineAction,
            "ctrl shift LEFT", DefaultEditorKit.selectionBeginLineAction,
            "ctrl shift KP_LEFT", DefaultEditorKit.selectionBeginLineAction,
            "meta shift LEFT", DefaultEditorKit.selectionBeginLineAction,
            "meta shift KP_LEFT", DefaultEditorKit.selectionBeginLineAction,
            "ctrl shift RIGHT", DefaultEditorKit.selectionEndLineAction,
            "ctrl shift KP_RIGHT", DefaultEditorKit.selectionEndLineAction,
            "meta shift RIGHT", DefaultEditorKit.selectionEndLineAction,
            "meta shift KP_RIGHT", DefaultEditorKit.selectionEndLineAction,
            "HOME", DefaultEditorKit.beginAction,
            "END", DefaultEditorKit.endAction,
            "meta UP", DefaultEditorKit.beginAction,
            "meta KP_UP", DefaultEditorKit.beginAction,
            "meta DOWN", DefaultEditorKit.endAction,
            "meta KP_DOWN", DefaultEditorKit.endAction,
            "shift HOME", DefaultEditorKit.selectionBeginAction,
            "shift END", DefaultEditorKit.selectionEndAction,
            "meta A", DefaultEditorKit.selectAllAction,
            "meta shift A", "unselect",
            "controlBackground shift O", "toggle-componentOrientation",
            "alt DELETE", MacEditorKit.deleteNextWordAction,
            "alt BACK_SPACE", MacEditorKit.deletePrevWordAction,
        });

        // Input map for the editors of combo boxes
        UIDefaults.LazyInputMap comboEditorInputMap = new UIDefaults.LazyInputMap(new String[] {
            "BACK_SPACE", DefaultEditorKit.deletePrevCharAction,
            "DELETE", DefaultEditorKit.deleteNextCharAction,
            "meta X", DefaultEditorKit.cutAction,
            "meta C", DefaultEditorKit.copyAction,
            "meta V", DefaultEditorKit.pasteAction,
            "CUT", DefaultEditorKit.cutAction,
            "COPY", DefaultEditorKit.copyAction,
            "PASTE", DefaultEditorKit.pasteAction,
            "RIGHT", DefaultEditorKit.forwardAction,
            "KP_RIGHT", DefaultEditorKit.forwardAction,
            "LEFT", DefaultEditorKit.backwardAction,
            "KP_LEFT", DefaultEditorKit.backwardAction,
            "shift RIGHT", DefaultEditorKit.selectionForwardAction,
            "shift KP_RIGHT", DefaultEditorKit.selectionForwardAction,
            "shift LEFT", DefaultEditorKit.selectionBackwardAction,
            "shift KP_LEFT", DefaultEditorKit.selectionBackwardAction,
            //"UP", DefaultEditorKit.upAction,
            //"DOWN", DefaultEditorKit.downAction,
            //"shift UP", DefaultEditorKit.selectionUpAction,
            //"shift DOWN", DefaultEditorKit.selectionDownAction,
            //, DefaultEditorKit.beginWordAction,
            //, DefaultEditorKit.endWordAction,
            //, DefaultEditorKit.selectionBeginWordAction,
            //, DefaultEditorKit.selectionEndWordAction,
            "alt LEFT", DefaultEditorKit.previousWordAction,
            "alt KP_LEFT", DefaultEditorKit.previousWordAction,
            "alt RIGHT", DefaultEditorKit.nextWordAction,
            "alt KP_RIGHT", DefaultEditorKit.nextWordAction,
            "alt shift LEFT", DefaultEditorKit.selectionPreviousWordAction,
            "alt shift KP_LEFT", DefaultEditorKit.selectionPreviousWordAction,
            "alt shift RIGHT", DefaultEditorKit.selectionNextWordAction,
            "alt shift KP_RIGHT", DefaultEditorKit.selectionNextWordAction,
            //"alt UP", DefaultEditorKit.beginLineAction,
            "ctrl LEFT", DefaultEditorKit.beginLineAction,
            "meta LEFT", DefaultEditorKit.beginLineAction,
            //"alt DOWN", DefaultEditorKit.endLineAction,
            "ctrl RIGHT", DefaultEditorKit.endLineAction,
            "meta RIGHT", DefaultEditorKit.endLineAction,
            "ctrl shift LEFT", DefaultEditorKit.selectionBeginLineAction,
            "meta shift LEFT", DefaultEditorKit.selectionBeginLineAction,
            "ctrl shift RIGHT", DefaultEditorKit.selectionEndLineAction,
            "meta shift RIGHT", DefaultEditorKit.selectionEndLineAction,
            //, DefaultEditorKit.beginParagraphAction,
            //, DefaultEditorKit.endParagraphAction,
            //, DefaultEditorKit.selectionBeginParagraphAction,
            //, DefaultEditorKit.selectionEndParagraphAction,
            //"HOME", DefaultEditorKit.beginAction,
            //"END", DefaultEditorKit.endAction,
            //"meta UP", DefaultEditorKit.beginAction,
            //"meta DOWN", DefaultEditorKit.endAction,
            "shift HOME", DefaultEditorKit.selectionBeginAction,
            "shift END", DefaultEditorKit.selectionEndAction,
            //, DefaultEditorKit.selectWordAction,
            //, DefaultEditorKit.selectLineAction,
            //, DefaultEditorKit.selectParagraphAction,
            "meta A", DefaultEditorKit.selectAllAction,
            "meta shift A", "unselect"/*DefaultEditorKit.unselectAction*/,
            "controlBackground shift O", "toggle-componentOrientation", /*DefaultEditorKit.toggleComponentOrientation*/
            "alt DELETE", MacEditorKit.deleteNextWordAction,
            "alt BACK_SPACE", MacEditorKit.deletePrevWordAction,
            "ENTER", JTextField.notifyAction,
        });

        UIDefaults.LazyInputMap tabbedPaneFocusInputMap = new UIDefaults.LazyInputMap(new Object[] {
            "RIGHT", "navigateRight",
            "KP_RIGHT", "navigateRight",
            "LEFT", "navigateLeft",
            "KP_LEFT", "navigateLeft",
            "UP", "navigateUp",
            "KP_UP", "navigateUp",
            "DOWN", "navigateDown",
            "KP_DOWN", "navigateDown",
            "ctrl DOWN", "requestFocusForVisibleComponent",
            "ctrl KP_DOWN", "requestFocusForVisibleComponent",
        });

        UIDefaults.LazyInputMap tabbedPaneAncestorInputMap = new UIDefaults.LazyInputMap(new Object[] {
            "ctrl PAGE_DOWN", "navigatePageDown",
            "ctrl PAGE_UP", "navigatePageUp",
            "ctrl UP", "requestFocus",
            "ctrl KP_UP", "requestFocus",
        });

        UIDefaults.LazyInputMap tableAncestorInputMap = new UIDefaults.LazyInputMap(new Object[] {
            "meta C", "copy",
            "meta V", "paste",
            "meta X", "cut",
            "COPY", "copy",
            "PASTE", "paste",
            "CUT", "cut",
            "RIGHT", "selectNextColumn",
            "KP_RIGHT", "selectNextColumn",
            "shift RIGHT", "selectNextColumnExtendSelection",
            "shift KP_RIGHT", "selectNextColumnExtendSelection",
            "ctrl shift RIGHT", "selectNextColumnExtendSelection",
            "ctrl shift KP_RIGHT", "selectNextColumnExtendSelection",
            "ctrl RIGHT", "selectNextColumnChangeLead",
            "ctrl KP_RIGHT", "selectNextColumnChangeLead",
            "LEFT", "selectPreviousColumn",
            "KP_LEFT", "selectPreviousColumn",
            "shift LEFT", "selectPreviousColumnExtendSelection",
            "shift KP_LEFT", "selectPreviousColumnExtendSelection",
            "ctrl shift LEFT", "selectPreviousColumnExtendSelection",
            "ctrl shift KP_LEFT", "selectPreviousColumnExtendSelection",
            "ctrl LEFT", "selectPreviousColumnChangeLead",
            "ctrl KP_LEFT", "selectPreviousColumnChangeLead",
            "DOWN", "selectNextRow",
            "KP_DOWN", "selectNextRow",
            "shift DOWN", "selectNextRowExtendSelection",
            "shift KP_DOWN", "selectNextRowExtendSelection",
            "ctrl shift DOWN", "selectNextRowExtendSelection",
            "ctrl shift KP_DOWN", "selectNextRowExtendSelection",
            "ctrl DOWN", "selectNextRowChangeLead",
            "ctrl KP_DOWN", "selectNextRowChangeLead",
            "UP", "selectPreviousRow",
            "KP_UP", "selectPreviousRow",
            "shift UP", "selectPreviousRowExtendSelection",
            "shift KP_UP", "selectPreviousRowExtendSelection",
            "ctrl shift UP", "selectPreviousRowExtendSelection",
            "ctrl shift KP_UP", "selectPreviousRowExtendSelection",
            "ctrl UP", "selectPreviousRowChangeLead",
            "ctrl KP_UP", "selectPreviousRowChangeLead",
            "HOME", "selectFirstColumn",
            "shift HOME", "selectFirstColumnExtendSelection",
            "ctrl shift HOME", "selectFirstRowExtendSelection",
            "ctrl HOME", "selectFirstRow",
            "END", "selectLastColumn",
            "shift END", "selectLastColumnExtendSelection",
            "ctrl shift END", "selectLastRowExtendSelection",
            "ctrl END", "selectLastRow",
            "PAGE_UP", "scrollUpChangeSelection",
            "shift PAGE_UP", "scrollUpExtendSelection",
            "ctrl shift PAGE_UP", "scrollLeftExtendSelection",
            "ctrl PAGE_UP", "scrollLeftChangeSelection",
            "PAGE_DOWN", "scrollDownChangeSelection",
            "shift PAGE_DOWN", "scrollDownExtendSelection",
            "ctrl shift PAGE_DOWN", "scrollRightExtendSelection",
            "ctrl PAGE_DOWN", "scrollRightChangeSelection",
            "TAB", "selectNextColumnCell",
            "shift TAB", "selectPreviousColumnCell",
            "ENTER", "selectNextRowCell",
            "shift ENTER", "selectPreviousRowCell",
            "meta A", "selectAll",
            "ctrl SLASH", "selectAll",
            "ctrl BACK_SLASH", "clearSelection",
            "ESCAPE", "cancel",
            "F2", "startEditing",
            "SPACE", "addToSelection",
            "ctrl SPACE", "toggleAndAnchor",
            "shift SPACE", "extendTo",
            "ctrl shift SPACE", "moveSelectionTo"
        });

        UIDefaults.LazyInputMap tableAncestorInputMapRightToLeft = new UIDefaults.LazyInputMap(new Object[] {
            "RIGHT", "selectPreviousColumn",
            "KP_RIGHT", "selectPreviousColumn",
            "shift RIGHT", "selectPreviousColumnExtendSelection",
            "shift KP_RIGHT", "selectPreviousColumnExtendSelection",
            "ctrl shift RIGHT", "selectPreviousColumnExtendSelection",
            "ctrl shift KP_RIGHT", "selectPreviousColumnExtendSelection",
            "shift RIGHT", "selectPreviousColumnChangeLead",
            "shift KP_RIGHT", "selectPreviousColumnChangeLead",
            "LEFT", "selectNextColumn",
            "KP_LEFT", "selectNextColumn",
            "shift LEFT", "selectNextColumnExtendSelection",
            "shift KP_LEFT", "selectNextColumnExtendSelection",
            "ctrl shift LEFT", "selectNextColumnExtendSelection",
            "ctrl shift KP_LEFT", "selectNextColumnExtendSelection",
            "ctrl LEFT", "selectNextColumnChangeLead",
            "ctrl KP_LEFT", "selectNextColumnChangeLead",
            "ctrl PAGE_UP", "scrollRightChangeSelection",
            "ctrl PAGE_DOWN", "scrollLeftChangeSelection",
            "ctrl shift PAGE_UP", "scrollRightExtendSelection",
            "ctrl shift PAGE_DOWN", "scrollLeftExtendSelection",
        });

        UIDefaults.LazyInputMap comboBoxAncestorInputMap = new UIDefaults.LazyInputMap(new Object[] {
            "ESCAPE", "hidePopup",
            "PAGE_UP", "pageUpPassThrough",
            "PAGE_DOWN", "pageDownPassThrough",
            "HOME", "homePassThrough",
            "END", "endPassThrough",
            "DOWN", "selectNext",
            "KP_DOWN", "selectNext",
            "alt DOWN", "togglePopup",
            "alt KP_DOWN", "togglePopup",
            "alt UP", "togglePopup",
            "alt KP_UP", "togglePopup",
            "SPACE", "spacePopup",
            "ENTER", "enterPressed",
            "UP", "selectPrevious",
            "KP_UP", "selectPrevious"
        });

        // These bindings are only enabled when there is a default
        // button set on the RootPane.
        Object[] rootPaneDefaultButtonWindowKeyBindings = new Object[] {
            "ENTER", "press",
            "released ENTER", "release",
            "ctrl ENTER", "press",
            "ctrl released ENTER", "release"
        };

        UIDefaults.LazyInputMap spinnerAncestorInputMap = new UIDefaults.LazyInputMap(new Object[] {
            "UP", "increment",
            "KP_UP", "increment",
            "DOWN", "decrement",
            "KP_DOWN", "decrement",
        });

        UIDefaults.LazyInputMap treeFocusInputMap = new UIDefaults.LazyInputMap(new Object[] {
            "meta C", "copy",
            "meta V", "paste",
            "meta X", "cut",
            "COPY", "copy",
            "PASTE", "paste",
            "CUT", "cut",
            "UP", "selectPrevious",
            "KP_UP", "selectPrevious",
            "shift UP", "selectPreviousExtendSelection",
            "shift KP_UP", "selectPreviousExtendSelection",
            "DOWN", "selectNext",
            "KP_DOWN", "selectNext",
            "shift DOWN", "selectNextExtendSelection",
            "shift KP_DOWN", "selectNextExtendSelection",
            "RIGHT", "selectChild",
            "KP_RIGHT", "selectChild",
            "LEFT", "selectParent",
            "KP_LEFT", "selectParent",
            "PAGE_UP", "scrollUpChangeSelection",
            "shift PAGE_UP", "scrollUpExtendSelection",
            "PAGE_DOWN", "scrollDownChangeSelection",
            "shift PAGE_DOWN", "scrollDownExtendSelection",
            "HOME", "selectFirst",
            "alt UP", "selectFirst",
            "shift HOME", "selectFirstExtendSelection",
            "END", "selectLast",
            "alt DOWN", "selectLast",
            "shift END", "selectLastExtendSelection",
            "F2", "startEditing",
            "meta A", "selectAll",
            // "ctrl SLASH", "selectAll",
            "meta shift A", "clearSelection",
            "ctrl SPACE", "toggleSelectionPreserveAnchor",
            "shift SPACE", "extendSelection",
            "ctrl HOME", "selectFirstChangeLead",
            "ctrl END", "selectLastChangeLead",
            "ctrl UP", "selectPreviousChangeLead",
            "ctrl KP_UP", "selectPreviousChangeLead",
            "ctrl DOWN", "selectNextChangeLead",
            "ctrl KP_DOWN", "selectNextChangeLead",
            "ctrl PAGE_DOWN", "scrollDownChangeLead",
            "ctrl shift PAGE_DOWN", "scrollDownExtendSelection",
            "ctrl PAGE_UP", "scrollUpChangeLead",
            "ctrl shift PAGE_UP", "scrollUpExtendSelection",
            "ctrl LEFT", "scrollLeft",
            "ctrl KP_LEFT", "scrollLeft",
            "ctrl RIGHT", "scrollRight",
            "ctrl KP_RIGHT", "scrollRight",
            "SPACE", "toggleSelectionPreserveAnchor",
        });

        // Assign the defaults
        Object[] defaults = {
            "Button.focusInputMap", buttonFocusInputMap,
            "CheckBox.focusInputMap", buttonFocusInputMap,
            //"ComboBox.actionMap", ...,
            "ComboBox.ancestorInputMap", comboBoxAncestorInputMap,
            "ComboBox.editorInputMap", comboEditorInputMap,
            "EditorPane.focusInputMap", multilineInputMap,
            "FormattedTextField.focusInputMap", fieldInputMap,
            "FormattedTextField.keyBindings", null,
            "PasswordField.focusInputMap", passwordFieldInputMap,
            "PasswordField.keyBindings", null,
            "RadioButton.focusInputMap", buttonFocusInputMap,
            "RootPane.defaultButtonWindowKeyBindings", rootPaneDefaultButtonWindowKeyBindings,
            "Spinner.ancestorInputMap", spinnerAncestorInputMap,
            "Spinner.focusInputMap", spinnerInputMap,
            "TabbedPane.focusInputMap", tabbedPaneFocusInputMap,
            "TabbedPane.ancestorInputMap", tabbedPaneAncestorInputMap,
            "TabbedPane.actionMap", table.get("TabbedPane.actionMap"),
            "TabbedPane.wrap.focusInputMap", tabbedPaneFocusInputMap,
            "TabbedPane.wrap.ancestorInputMap", tabbedPaneAncestorInputMap,
            "TabbedPane.wrap.actionMap", table.get("TabbedPane.actionMap"),
            "TabbedPane.scroll.focusInputMap", tabbedPaneFocusInputMap,
            "TabbedPane.scroll.ancestorInputMap", tabbedPaneAncestorInputMap,
            "TabbedPane.scroll.actionMap", table.get("TabbedPane.actionMap"),
            "Table.ancestorInputMap", tableAncestorInputMap,
            "Table.ancestorInputMap.rightToLeft", tableAncestorInputMapRightToLeft,
            "TextArea.focusInputMap", multilineInputMap,
            "TextArea.keyBindings", null,
            "TextField.focusInputMap", fieldInputMap,
            "TextField.keyBindings", null,
            "TextPane.focusInputMap", multilineInputMap,
            "TextPane.keyBindings", null,
            "ToggleButton.focusInputMap", buttonFocusInputMap,
            "Tree.focusInputMap", treeFocusInputMap,
        };

        table.putDefaults(defaults);
    }
}
