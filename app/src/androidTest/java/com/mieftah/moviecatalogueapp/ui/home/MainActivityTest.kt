package com.mieftah.moviecatalogueapp.ui.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.swipeUp
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.mieftah.moviecatalogueapp.R
import com.mieftah.moviecatalogueapp.utils.DataDummy
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Rule
import org.junit.Test

class MainActivityTest {
    private val dummyMovies = DataDummy.getMovies()
    private val dummyTvShow = DataDummy.getTvShow()

    @get : Rule
    var activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun loadMovies() {
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovies.size))
    }

    @Test
    fun loadDetailMovies() {
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.coordinator_layout)).perform(swipeUp())
        onView(withId(R.id.fab_favorite)).perform(click())
        onView(withId(R.id.bt_share)).perform(click())
        onView(withId(R.id.collapsing)).check(matches(isDisplayed()))
        onView(withId(R.id.collapsing)).check(matches(withContentDescription(dummyMovies[0].title)))
        onView(withId(R.id.iv_poster)).check(matches(isDisplayed()))
        onView(withId(R.id.iv_poster)).check(matches(withTagValue(equalTo(dummyMovies[0].poster))))
        onView(withId(R.id.tv_title)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_title)).check(matches(withText(dummyMovies[0].title)))
        onView(withId(R.id.tv_genre)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_genre)).check(matches(withText(dummyMovies[0].genre)))
        onView(withId(R.id.rating)).check(matches(isDisplayed()))
        onView(withId(R.id.rating)).check(matches(withText("${dummyMovies[0].userScore}")))
        onView(withId(R.id.tv_release)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_release)).check(matches(withText(dummyMovies[0].releaseDate)))
        onView(withId(R.id.tv_duration)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_duration)).check(matches(withText(dummyMovies[0].duration)))
        onView(withId(R.id.tv_overview)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_overview)).check(matches(withText(dummyMovies[0].overview)))
    }

    @Test
    fun loadTvShow() {
        onView(withText("TV SHOW")).perform(click())
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyTvShow.size))
    }

    @Test
    fun loadDetailTvShow() {
        onView(withText("TV SHOW")).perform(click())
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.coordinator_layout)).perform(swipeUp())
        onView(withId(R.id.fab_favorite)).perform(click())
        onView(withId(R.id.bt_share)).perform(click())
        onView(withId(R.id.collapsing)).check(matches(isDisplayed()))
        onView(withId(R.id.collapsing)).check(matches(withContentDescription(dummyTvShow[0].title)))
        onView(withId(R.id.iv_poster)).check(matches(isDisplayed()))
        onView(withId(R.id.iv_poster)).check(matches(withTagValue(equalTo(dummyTvShow[0].poster))))
        onView(withId(R.id.tv_title)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_title)).check(matches(withText(dummyTvShow[0].title)))
        onView(withId(R.id.tv_genre)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_genre)).check(matches(withText(dummyTvShow[0].genre)))
        onView(withId(R.id.rating)).check(matches(isDisplayed()))
        onView(withId(R.id.rating)).check(matches(withText("${dummyTvShow[0].userScore}")))
        onView(withId(R.id.tv_release)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_release)).check(matches(withText(dummyTvShow[0].releaseDate)))
        onView(withId(R.id.tv_duration)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_duration)).check(matches(withText(dummyTvShow[0].duration)))
        onView(withId(R.id.tv_overview)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_overview)).check(matches(withText(dummyTvShow[0].overview)))
    }
}