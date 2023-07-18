package org.example.pages;

import org.example.actions.SortSearchActions;
import org.example.locators.TableSortSearchPageLocators;

public class TableSortSearchPage {
    private SortSearchActions actions;

    public TableSortSearchPage(SortSearchActions actions) {
        this.actions = actions;
    }

    public void enterSearchText(String text) {
        actions.enterText(TableSortSearchPageLocators.SEARCH_BOX, text);
    }

    public void clickLink() {
        actions.click(TableSortSearchPageLocators.LINK_TEXT);
    }
}
