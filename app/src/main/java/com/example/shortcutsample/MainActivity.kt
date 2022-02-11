package com.example.shortcutsample

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.pm.ShortcutInfoCompat
import androidx.core.content.pm.ShortcutManagerCompat
import androidx.core.graphics.drawable.IconCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Defining shortcuts
        val shortcut = ShortcutInfoCompat.Builder(this, "id1")
            .setShortLabel("Twitter")
            .setLongLabel("Open the Twitter")
            .setIcon(IconCompat.createWithResource(this, R.drawable.ic_twitter))
            .setIntent(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://twitter.com/")
                )
            )
            .build()

        val shortcutTwo = ShortcutInfoCompat.Builder(this, "id2")
            .setShortLabel("Instagram")
            .setLongLabel("Open the Instagram")
            .setIcon(IconCompat.createWithResource(this, R.drawable.ic_instagram))
            .setIntent(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://instagram.com/")
                )
            )
            .build()

        val shortcutThird = ShortcutInfoCompat.Builder(this, "id3")
            .setShortLabel("Facebook")
            .setLongLabel("Open the Facebook")
            .setIcon(IconCompat.createWithResource(this, R.drawable.ic_facebook))
            .setIntent(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://facebook.com/")
                )
            )
            .build()

        // Add shortcuts
        ShortcutManagerCompat.pushDynamicShortcut(this, shortcut)
        ShortcutManagerCompat.pushDynamicShortcut(this, shortcutTwo)
        ShortcutManagerCompat.pushDynamicShortcut(this, shortcutThird)
    }
}