package com.parallel.shots

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import androidx.fragment.app.testing.launchFragmentInContainer
import com.karumi.shot.FragmentScenarioUtils.waitForFragment
import com.karumi.shot.ScreenshotTest
import org.junit.Test

class FragmentScreenshotTest : ScreenshotTest {

    @Test
    fun basicScenarioWithDefaultArguments() {
        val fragment = launchFragmentInContainer<FirstFragment>(
            factory = object : FragmentFactory() {
                override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
                    return FirstFragment()
                }
            }
        ).waitForFragment()

        compareScreenshot(fragment)
    }
}