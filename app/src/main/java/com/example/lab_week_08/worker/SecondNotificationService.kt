package com.example.lab_week_08.worker

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.widget.Toast

class SecondNotificationService : Service() {
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val id = intent?.getStringExtra(EXTRA_ID) ?: "Unknown"
        Toast.makeText(this, "SecondNotificationService is processing with ID $id", Toast.LENGTH_LONG).show()

        // Complete the foreground service logic here, such as showing a notification
        stopSelf() // Stop the service when done
        return START_NOT_STICKY
    }

    override fun onBind(intent: Intent?): IBinder? = null

    companion object {
        const val EXTRA_ID = "Id"
    }
}
