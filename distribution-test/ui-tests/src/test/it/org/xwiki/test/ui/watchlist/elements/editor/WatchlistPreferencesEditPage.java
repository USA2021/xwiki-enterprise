/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.test.ui.watchlist.elements.editor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.xwiki.test.ui.framework.elements.editor.EditPage;

/** User profile, the watchlist pane, edit mode. */
public class WatchlistPreferencesEditPage extends EditPage
{
    private static final String AUTOMATICWATCH_DEFAULT = "Default";

    private static final String AUTOMATICWATCH_NONE = "Disabled";

    private static final String AUTOMATICWATCH_ALL = "Any modification";

    private static final String AUTOMATICWATCH_MAJOR = "Major modifications";

    private static final String AUTOMATICWATCH_NEW = "New documents";

    @FindBy(xpath = "//select[@id='XWiki.WatchListClass_0_automaticwatch']")
    private WebElement automaticwatch;

    public void setAutomaticWatchDefault()
    {
        Select select = new Select(this.automaticwatch);
        select.selectByValue(AUTOMATICWATCH_DEFAULT);
    }

    public void setAutomaticWatchNone()
    {
        Select select = new Select(this.automaticwatch);
        select.selectByValue(AUTOMATICWATCH_NONE);
    }

    public void setAutomaticWatchAll()
    {
        Select select = new Select(this.automaticwatch);
        select.selectByValue(AUTOMATICWATCH_ALL);
    }

    public void setAutomaticWatchMajor()
    {
        Select select = new Select(this.automaticwatch);
        select.selectByValue(AUTOMATICWATCH_MAJOR);
    }

    public void setAutomaticWatchNew()
    {
        Select select = new Select(this.automaticwatch);
        select.selectByValue(AUTOMATICWATCH_NEW);
    }
}
