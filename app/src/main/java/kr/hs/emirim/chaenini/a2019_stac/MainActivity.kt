package kr.hs.emirim.chaenini.a2019_stac

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button2.setOnClickListener{
            startActivity(Intent(this,InformationActivity::class.java))
        }

        val name = intent.getStringExtra("name")

        resultLabel.text = "${name}님의 혜돋이 입니다. "

        if(!TextUtils.isEmpty(name)){
            resultLabel.text = "${name} 님의 혜돋이 "
        }

    }
}
