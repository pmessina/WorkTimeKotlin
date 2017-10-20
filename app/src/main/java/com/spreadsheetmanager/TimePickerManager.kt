package com.spreadsheetmanager

import android.app.TimePickerDialog
import android.content.Context
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.TimePicker
import org.joda.time.DateTime
import org.joda.time.format.DateTimeFormat

class TimePickerManager(val context: Context,
                        val tvTimeIn: TextView,
                        val tvBreakIn: TextView,
                        val tvBreakOut: TextView,
                        val tvTimeOut: TextView,
                        val btnSelTimeIn: ImageButton,
                        val btnSelBreakIn: ImageButton,
                        val btnSelBreakOut: ImageButton,
                        val btnSelTimeOut: ImageButton,
                        val btnSubmit: Button
                        )
{

    val dateTimeFormat = DateTimeFormat.shortDate()

    val timeInListener = TimePickerDialog.OnTimeSetListener { timePicker, hourOfDay, minute ->
        val date: DateTime = DateTime.now()

        val dt = DateTime(date.year, date.monthOfYear, date.dayOfMonth, hourOfDay, minute, date.secondOfMinute)

        tvTimeIn.text = dateTimeFormat.print(dt)

        setEnabledStates(true, false, false, false, true, false, false, false,  false)
    }

    val breakInListener = TimePickerDialog.OnTimeSetListener { timePicker, hourOfDay, minute ->
        val date: DateTime = DateTime.now()

        val dt = DateTime(date.year, date.monthOfYear, date.dayOfMonth, hourOfDay, minute, date.secondOfMinute)

        tvBreakIn.text = dateTimeFormat.print(dt)

        setEnabledStates(false, true, false, false, false, true, false, false,  false)
    }

    val breakOutListener = TimePickerDialog.OnTimeSetListener { timePicker, hourOfDay, minute ->
        val date: DateTime = DateTime.now()

        val dt = DateTime(date.year, date.monthOfYear, date.dayOfMonth, hourOfDay, minute, date.secondOfMinute)

        tvBreakOut.text = dateTimeFormat.print(dt)

        setEnabledStates(true, false, false, false, true, false, false, false,  false)
    }

    val timeOutListener = TimePickerDialog.OnTimeSetListener { timePicker, hourOfDay, minute ->
        val date: DateTime = DateTime.now()

        val dt = DateTime(date.year, date.monthOfYear, date.dayOfMonth, hourOfDay, minute, date.secondOfMinute)

        tvTimeOut.text = dateTimeFormat.print(dt)

        setEnabledStates(false, false, false, true, false, true, false, true,  true)
    }

    fun setUpDialog(timePickerListener: TimePickerDialog.OnTimeSetListener) : TimePickerDialog
    {
        return TimePickerDialog(context, timePickerListener, DateTime.now().getHourOfDay(), DateTime.now().getMinuteOfHour(), false)
    }

    fun setEnabledStates( timeInEnabled: Boolean,
                          breakInEnabled: Boolean,
                          breakOutEnabled: Boolean,
                          timeOutEnabled: Boolean,
                          btnSelTimeInEnabled: Boolean,
                          btnSelBreakInEnabled: Boolean,
                          btnSelBreakOutEnabled: Boolean,
                          btnSelTimeOutEnabled: Boolean,
                          btnSubmitEnabled: Boolean)
    {
        tvTimeIn.isEnabled = timeInEnabled;
        tvBreakIn.isEnabled = breakInEnabled;
        tvBreakOut.isEnabled = breakOutEnabled;
        tvTimeOut.isEnabled = timeOutEnabled;

        btnSelTimeIn.isEnabled = btnSelTimeInEnabled;
        btnSelBreakIn.isEnabled = btnSelBreakInEnabled;
        btnSelBreakOut.isEnabled = btnSelBreakOutEnabled;
        btnSelTimeOut.isEnabled = btnSelTimeOutEnabled;

        btnSubmit.isEnabled = btnSubmitEnabled;
    }

    fun showDialog(timePickerDialog: TimePickerDialog)
    {
        timePickerDialog.show()
    }

}

