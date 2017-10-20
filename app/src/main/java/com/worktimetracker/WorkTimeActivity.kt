package com.worktimetracker

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v7.app.AppCompatActivity


class WorkTimeActivity : AppCompatActivity() {


    val workbookColumnHeaders = listOf<String>("Date", "Time In", "Break In", "Break Out", "Time Out", "Hours")

    var isSpreadSheetAddSuccessful: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work_time)

        val binding:ViewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_work_time)

        var workday = Workday(1, "10/10/2017", "12:00PM", "2:33PM", "4:33PM", "8:33PM")

        binding.setVariable(workday.id, workday)

        binding.executePendingBindings()


//        val tvBreakIn: TextView? by viewOptional(R.id.tvBreakIn)



    }


}
