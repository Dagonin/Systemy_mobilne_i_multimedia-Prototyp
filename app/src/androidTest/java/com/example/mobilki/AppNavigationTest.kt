import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.navigation.compose.ComposeNavigator
import androidx.navigation.testing.TestNavHostController
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.mobilki.navigation.AppNavigation
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import androidx.compose.material3.MaterialTheme
import androidx.test.core.app.ApplicationProvider

@RunWith(AndroidJUnit4::class)
class AppNavigationTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    private lateinit var navController: TestNavHostController

    @Before
    fun setupNavController() {
        navController = TestNavHostController(ApplicationProvider.getApplicationContext())
        navController.navigatorProvider.addNavigator(ComposeNavigator())
    }

    private fun setAppContent() {
        composeTestRule.setContent {
            MaterialTheme {
                AppNavigation(navController = navController)
            }
        }
    }

    @Test
    fun testNavigationFromWelcomeToCategories() {
        setAppContent()
        composeTestRule.onNodeWithText("Rozpocznij").assertIsDisplayed().performClick()
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithText("Wybierz kategorię:").assertIsDisplayed()
    }

    @Test
    fun testNavigationFromCategoriesToProducts() {
        setAppContent()
        composeTestRule.onNodeWithText("Rozpocznij").performClick()
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithText("Owoce", substring = true).assertIsDisplayed().performClick()
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithText("Wybierz Owoce:").assertIsDisplayed()
        composeTestRule.onNodeWithText("Jabłko", substring = true).assertExists()
    }

    @Test
    fun testNavigationToDetailsScreen() {
        setAppContent()
        composeTestRule.onNodeWithText("Rozpocznij").performClick()
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithText("Owoce", substring = true).performClick()
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithText("Jabłko").performClick()
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithText("Jabłko").assertIsDisplayed()
        composeTestRule.onNodeWithText("Opis").assertIsDisplayed()
    }

    @Test
    fun testBackNavigationFromDetailsToProducts() {
        setAppContent()
        composeTestRule.onNodeWithText("Rozpocznij").performClick()
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithText("Owoce", substring = true).performClick()
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithText("Jabłko").performClick()
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithText("Jabłko").assertIsDisplayed()
        composeTestRule.onNodeWithContentDescription("Back").performClick()
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithText("Wybierz Owoce:").assertIsDisplayed()
        composeTestRule.onNodeWithText("Jabłko").assertExists()
    }

    @Test
    fun testBackNavigationFromProductsToCategories() {
        setAppContent()
        composeTestRule.onNodeWithText("Rozpocznij").performClick()
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithText("Owoce", substring = true).performClick()
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithContentDescription("Back").performClick()
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithText("Wybierz kategorię:").assertIsDisplayed()
    }
}
