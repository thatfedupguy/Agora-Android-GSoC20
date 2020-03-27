package com.example.agoraandroidgsoc20.data.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

const val CURRENT_USER_ID = 0

//{
//    "username": "string",
//    "email": "string",
//    "firstName": "string",
//    "lastName": "string",
//    "avatarURL": "string",
//    "twoFactorAuthentication": true,
//    "token": {
//    "token": "string",
//    "expiresOn": "2020-03-24T23:09:12.450Z"
//},
//    "trustedDevice": "string"
//}

@Entity
data class User(
    var username: String? = null,
    var email: String? = null,
    var firstName: String? = null,
    var lastName: String? = null,
    var twoFactorAuhtnetication: Boolean? = null
){
    @PrimaryKey(autoGenerate = false)
    var uid : Int = CURRENT_USER_ID
}