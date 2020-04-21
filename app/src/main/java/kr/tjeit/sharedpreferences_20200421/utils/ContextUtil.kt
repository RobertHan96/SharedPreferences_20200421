package kr.tjeit.sharedpreferences_20200421.utils

import android.content.Context

class ContextUtil {

//    JAVA의 static 변수/메쏘드에 해당하는 코드들을 적는 영역
    companion object {

//      메모장의 파일명에 대응되는 개념.
        val prefName = "MyPref" // 프로젝트별로 맞는 이름으로 작명.
//      메모장에 저장될 항목의 이름.
        val USER_ID = "USER_ID"

        fun setUserId (context:Context, inputId:String) {
//            메모장 파일을 여는것과 비슷한 행위.
            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
//            USER_ID 항목에 함수의 재료로 들어오는 String 변수 저장.
            pref.edit().putString(USER_ID, inputId).apply()
        }



    }

}