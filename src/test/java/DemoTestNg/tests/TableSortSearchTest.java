package DemoTestNg.tests;

import DemoTestNg.TestBase;
import org.example.actions.SortSearchActions;
import org.example.pages.TableSortSearchPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TableSortSearchTest extends TestBase {
    private TableSortSearchPage tableSortSearchPage;

    @BeforeMethod
    public void methodSetup() {
        SortSearchActions actions = new SortSearchActions(driver);
        tableSortSearchPage = new TableSortSearchPage(actions);
    }

    @Test
    public void testTableSortAndSearch(){
        tableSortSearchPage.clickLink();
        tableSortSearchPage.enterSearchText("A. Nelson");
    }

    @Test
    @Parameters
    public void testFileDownload(){

    }
}
