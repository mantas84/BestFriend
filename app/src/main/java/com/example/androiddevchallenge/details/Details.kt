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
package com.example.androiddevchallenge.details

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.Dog
import com.example.androiddevchallenge.Dogs
import com.example.androiddevchallenge.R
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun dogDetailsScreen(dogId: Int) {
    val dog = Dogs.findDog(dogId)
    dogDetails(dog)
}

@Composable
fun dogDetails(dog: Dog) {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(Modifier.verticalScroll(rememberScrollState())) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(0.dp, 0.dp, 32.dp, 32.dp))
                    .background(Color.Green)
            ) {
                CoilImage(
                    data = dog.image,
                    contentScale = ContentScale.FillWidth,
                    contentDescription = null,
                    modifier = Modifier.fillMaxWidth()
                )
            }
            Text(
                text = dog.name,
                style = MaterialTheme.typography.h5,
                modifier = Modifier.padding(16.dp, 4.dp)
            )
            Text(
                text = dog.breed,
                style = MaterialTheme.typography.subtitle2,
                modifier = Modifier.padding(16.dp, 4.dp)
            )
            Text(
                text = dog.desc,
                style = MaterialTheme.typography.body1,
                modifier = Modifier.padding(16.dp, 4.dp)
            )
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp, 8.dp, 8.dp, 24.dp)
            ) {
                Button(modifier = Modifier.padding(16.dp, 8.dp), onClick = { }) {
                    Text(text = stringResource(R.string.adopt))
                }
            }
        }
    }
}
