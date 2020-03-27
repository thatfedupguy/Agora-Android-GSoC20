package com.example.agoraandroidgsoc20.utils

import java.io.IOException

class ApiException(message : String) : IOException(message)
class NoInternetException(message: String) : IOException(message)