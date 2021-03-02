/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.details.dogDetailsScreen
import com.example.androiddevchallenge.list.dogsList

object Navigation {

    private const val listString = "list"
    private const val detailsString = "details/{dogId}"

    @Composable
    fun navigationComposable(navController: NavHostController) {
        NavHost(navController, startDestination = listString) {
            composable(listString) {
                dogsList(
                    dogs = Dogs.allDogs,
                    onClick = {
                        navController.navigate("details/${it.id}")
                    }
                )
            }
            composable(
                detailsString,
                arguments = listOf(navArgument("dogId") { type = NavType.IntType })
            ) { backStackEntry ->
                dogDetailsScreen(
                    dogId = backStackEntry.arguments?.getInt("dogId")!!,
                )
            }
        }
    }
}
