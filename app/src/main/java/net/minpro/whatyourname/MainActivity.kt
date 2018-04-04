package net.minpro.whatyourname

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

// 下のがあればfindViewByIdを書かなくて良くなる
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    // 画面が開いた時に最初にやることを書く場所
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val textView = findViewById<TextView>(R.id.textView)でもおｋ
//        val textView: TextView = findViewById(R.id.textView)
//        val editText: EditText = findViewById(R.id.editText)
//        val button: Button = findViewById(R.id.button)
//        val imageView: ImageView = findViewById(R.id.imageView)

        // 押してねを押したら
        button.setOnClickListener(this)
    }


    // buttonが押された時にやることを書く場所
    override fun onClick(v: View?) {
        textView.text = editText.text.toString() + "さん、長い間くそお世話になりました！"
        imageView.setImageResource(R.drawable.c_05)
    }
}
