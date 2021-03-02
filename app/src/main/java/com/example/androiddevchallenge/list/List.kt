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
package com.example.androiddevchallenge.list

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import coil.transform.CircleCropTransformation
import com.example.androiddevchallenge.Dog
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.greyTransparent
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun listItem(
    dog: Dog,
    onClick: (Dog) -> Unit
) {
    Box(modifier = Modifier.padding(16.dp, 8.dp)) {

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(24.dp))
                .background(greyTransparent)
                .clickable { onClick(dog) }
                .padding(0.dp, 8.dp)
        ) {
            Row {
                dogImage(
                    Modifier
                        .weight(2f)
                        .size(150.dp),
                    dog.image,
                )
                Column(
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .weight(2f)
                        .height(150.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp, 8.dp),
                        horizontalArrangement = Arrangement.End,
                        verticalAlignment = Alignment.Top
                    ) {
                        CoilImage(
                            data = R.drawable.ic_paw,
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                    Text(
                        text = dog.name,
                        modifier = Modifier.padding(8.dp),
                        style = MaterialTheme.typography.h5
                    )
                    Text(
                        text = dog.breed,
                        modifier = Modifier.padding(8.dp),
                        style = MaterialTheme.typography.subtitle2
                    )
                }
            }
        }
    }
}

@Composable
fun dogImage(modifier: Modifier = Modifier, imageUrl: String) {
    CoilImage(
        data = imageUrl,
        contentDescription = null,
        requestBuilder = {
            transformations(CircleCropTransformation())
        },
        modifier = modifier
    )
}

@Composable
fun dogsList(dogs: List<Dog>, onClick: (Dog) -> Unit) {
    LazyColumn(
        content = {
            items(dogs.size) { index ->
                listItem(dog = dogs[index], onClick = onClick)
            }
        }
    )
}
