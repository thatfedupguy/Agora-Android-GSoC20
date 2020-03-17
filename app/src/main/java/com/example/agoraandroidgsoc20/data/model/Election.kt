package com.example.agoraandroidgsoc20.data.model

data class Election(
    var id : Int ?= null,
    var name : String?= null,
    var desc :String?= null,
    var status :String?= null,
    var startsAt : String ?= null,
    var endsAt: String ?= null
)