package me.dio.copa.catar.remote.services

import me.dio.copa.catar.remote.model.MatchRemote
import retrofit2.http.GET

interface MatchesServices {
    //@GET("api.json")
    @GET("https://adminfilipeoliveira.github.io/copa-2022-api/Api.json")
    suspend fun getMatches(): List<MatchRemote>
}
