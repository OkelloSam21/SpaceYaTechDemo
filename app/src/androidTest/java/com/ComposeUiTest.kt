package com

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import com.example.spaceyatechdemo.DisplayContent
import com.example.spaceyatechdemo.MyCard
import org.junit.Rule
import org.junit.Test

class ComposeUiTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun DisplayContentTest() {
        composeTestRule.setContent {
            DisplayContent()
        }

        // check if upcoming trips is displaed on the screen
        composeTestRule.onNodeWithText("Upcoming Trips").assertIsDisplayed()

        // check if the card component is displayed on the screen
        composeTestRule.onNodeWithText("my_card").assertIsDisplayed()
    }

    @Test
    fun testContent() {
        composeTestRule.setContent {
            MyCard(name = "upcoming")
        }
        composeTestRule.onNodeWithText("upcoming").assertIsDisplayed()
    }
}
