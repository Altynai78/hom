package com.example.hw8_5.mvvm

import android.content.pm.LauncherApps
import android.telecom.Call
import androidx.lifecycle.MutableLiveData
import com.example.hw8_5.db.localDB.LoveDao
import com.example.hw8_5.db.remote.LoveApi
import com.example.hw8_5.db.remote.LoveModel
import com.example.hw8_5.model.Love



    class Repository @Inject constructor(private val api: LoveApi, private val dao: LoveDao) {
        fun getLove(fName:String, sName:String): MutableLiveData<LoveModel> {
            val liveLove = MutableLiveData<LoveModel>()

            api.percentageName(fName, sName).enqueue(object : LauncherApps.Callback<LoveModel> {
                override fun onResponse(call: Call<LoveModel>, response: Response<LoveModel>) {
                    if(response.isSuccessful){
                        liveLove.postValue(response.body())
                    }
                }
                override fun onFailure(call: Call<LoveModel>, t: Throwable) {

                }
            })
            return liveLove
        }

        fun daoInsert(love: Love) {
            dao.insert(love)
        }

        fun daoUpdate(love: Love) {
            dao.update(love)
        }

        fun daoGetAll(): List<Love> = dao.getAll()
    }
}