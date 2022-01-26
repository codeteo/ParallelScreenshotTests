package com.parallel.shots

import androidx.fragment.app.testing.launchFragmentInContainer
import com.karumi.shot.FragmentScenarioUtils.waitForFragment
import com.karumi.shot.ScreenshotTest
import org.junit.Test

class FragmentScreenshotTest : ScreenshotTest {
    private var fragmentScenario =
        launchFragmentInContainer<FirstFragment>().waitForFragment()

    @Test
    fun theActivityIsShownProperly() {
        val fragment = fragmentScenario

        compareScreenshot(fragment)
    }

}