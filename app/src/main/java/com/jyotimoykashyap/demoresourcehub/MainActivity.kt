package com.jyotimoykashyap.demoresourcehub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jyotimoykashyap.demoresourcehub.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: CustomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val gdscList = listOf<Gdsc>(
            Gdsc("GDSC NIT Silchar" , getString(R.string.dummy_text)),
            Gdsc("GDSC NIT Agartala" , getString(R.string.dummy_text)),
            Gdsc("GDSC NIT Surathkal" , getString(R.string.dummy_text)),
            Gdsc("GDSC NIT Trichy" , getString(R.string.dummy_text)),
            Gdsc("GDSC NIT Durgapur" , getString(R.string.dummy_text)),
            Gdsc("GDSC Assam Engineering College" , getString(R.string.dummy_text)),
            Gdsc("GDSC IIIT Guwahati" , getString(R.string.dummy_text)),
            Gdsc("GDSC LPU" , getString(R.string.dummy_text)),
            Gdsc("GDSC Sarla Birla" , getString(R.string.dummy_text)),
            Gdsc("GDSC Women's College" , getString(R.string.dummy_text)),
            Gdsc("GDSC Delhi" , getString(R.string.dummy_text)),
            Gdsc("GDSC Meerut" , getString(R.string.dummy_text)),
        )

        adapter = CustomAdapter(CustomDiffUtil())
        adapter.submitList(gdscList)

        binding.run {
            gdscListView.adapter = adapter
        }

    }
}