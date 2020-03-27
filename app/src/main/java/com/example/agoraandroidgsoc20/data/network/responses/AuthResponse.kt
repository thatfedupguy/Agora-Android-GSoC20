package com.example.agoraandroidgsoc20.data.network.responses

data class AuthResponse(
    var username: String?,
    var email: String?,
    var firstName: String?,
    var lastName: String?,
    var towFactorAuthentication: Boolean?,
    var token: Token?,
    var trustedDevice: String?
)

//"username": "string",
//"email": "string",
//"firstName": "string",
//"lastName": "string",
//"avatarURL": "string",
//"twoFactorAuthentication": true,
//"token": {
//    "token": "string",
//    "expiresOn": "2020-03-25T11:29:41.287Z"
//},
//"trustedDevice": "string"