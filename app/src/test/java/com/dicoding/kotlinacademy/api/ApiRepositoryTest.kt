package com.dicoding.kotlinacademy.api

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith
import org.mockito.Mockito

/**
 * Created by root on 3/1/18.
 */
@RunWith(JUnitPlatform::class)
class ApiRepositoryTest : Spek({
    describe("test do request") {

        val apiRepository = Mockito.mock(ApiRepository::class.java)
        val url = "https://www.thesportsdb.com/api/v1/json/1/search_all_teams.php?l=English%20Premier%20League"

        on("do request") {
            apiRepository.doRequest(url)

            it("request success") {
                Mockito.verify(apiRepository).doRequest(url)

            }
        }
    }

})