package com.csc415.hellotoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity()
{
	private var count: Int = 0
	private lateinit var showCount: TextView

	override fun onCreate(savedInstanceState: Bundle?)
	{
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		showCount = findViewById(R.id.show_count)
	}

	fun showToast(view: android.view.View)
	{
		Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show()
	}

	fun countUp(view: android.view.View)
	{
		showCount.text = (++count).toString()
	}
}