package kr.tjeit.sharedpreferences_20200421

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.tjeit.sharedpreferences_20200421.utils.ContextUtil

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValue()
    }

    override fun setupEvents() {

        loginBtn.setOnClickListener {
            val inputId = idEdt.text.toString()
            ContextUtil.setUserId(mContext, inputId)
        }

    }

    override fun setValue() {

        idEdt.setText(ContextUtil.getUserId(mContext))

    }
}
