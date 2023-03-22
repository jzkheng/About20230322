package tw.edu.pu.gm.o1103026.about

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var txv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv = findViewById(R.id.txv)
        txv.setOnClickListener({
            if(txv.text == "邓佳钲你好"){
                txv.text = "海清班很棒"
            }else {
                txv.text = "邓佳钲你好"
            }
            })
    }
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        var txv:TextView = findViewById(R.id.txv)
        txv.text = "螢幕觸控"
        return true
    }
}