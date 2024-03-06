package tw.edu.tw.cmis.s1150765.lotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var t:TextView =findViewById(R.id.txv);
        t.text = "0"
    }
    fun happy(v: View){
        var txv: TextView = findViewById(R.id.txv)
        txv.text = (1..100).random().toString()
    }

}