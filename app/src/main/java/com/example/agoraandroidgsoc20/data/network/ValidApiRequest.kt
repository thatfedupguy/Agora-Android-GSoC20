package com.example.agoraandroidgsoc20.data.network

import android.util.Log
import com.example.agoraandroidgsoc20.utils.ApiException
import org.json.JSONException
import org.json.JSONObject
import retrofit2.Response
import java.lang.StringBuilder

abstract class ValidApiRequest{

    suspend fun<T:Any> apiRequest(call : suspend () -> Response<T>) : T{

        val response = call.invoke()
        if(response.isSuccessful){
            Log.d("friday", response.toString())
            return response.body()!!
        }else{
            val error = response.errorBody()?.string()
            var message = StringBuilder()
            Log.d("friday", response.errorBody().toString())
            error?.let {
                try {
                    message.append(JSONObject(it).getString("message"))
                }catch (e : JSONException){
                }
                message.append("\n")
            }
            message.append("Error Code is : ${response.code()}")
            throw ApiException(message.toString())
        }

    }
}