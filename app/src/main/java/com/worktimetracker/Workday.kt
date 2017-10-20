package com.worktimetracker

/**
 * Created by Patrick on 10/8/2017.
 */
data class Workday(
        var id: Int,
        var dataToday: String,
        var timeIn: String,
        var breakIn: String,
        var breakOut: String,
        var timeOut: String
)