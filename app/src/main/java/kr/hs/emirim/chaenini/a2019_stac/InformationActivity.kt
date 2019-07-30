package kr.hs.emirim.chaenini.a2019_stac

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_infomation.*

class InformationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_infomation)

        goButton.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }

        backButton.setOnClickListener{

            finish()
        }
    }
}
