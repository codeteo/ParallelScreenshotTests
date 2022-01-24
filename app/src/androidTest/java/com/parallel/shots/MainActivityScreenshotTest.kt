package com.parallel.shots

import androidx.test.core.app.ActivityScenario.launch
import com.karumi.shot.ActivityScenarioUtils.waitForActivity
import com.karumi.shot.ScreenshotTest
import org.junit.Test

class GreetingScreenshotTest : ScreenshotTest {
    private var activityScenarioRule = launch(MainActivity::class.java)

    @Test
    fun theActivityIsShownProperly() {
        val activity = activityScenarioRule.waitForActivity()

        compareScreenshot(activity)
    }

}