package me.dio.copa.catar.remote.services

import me.dio.copa.catar.remote.model.MatchRemote
import retrofit2.http.GET

interface MatchesServices {
    @GET("api.json")
    //@GET("https://brunodorea.github.io/dio-copa-2022-api/api.json")
    suspend fun getMatches(): List<MatchRemote>
}
