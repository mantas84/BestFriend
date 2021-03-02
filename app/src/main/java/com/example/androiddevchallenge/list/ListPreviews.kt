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

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.Dog
import com.example.androiddevchallenge.Dogs

@Composable
@Preview
fun listItemPreview() {
    listItem(Dogs.findDog(0)) {}
}

@Composable
@Preview
fun dogImagePreview(
    modifier: Modifier = Modifier,
    imageUrl: String = "https://images.dog.ceo/breeds/sheepdog-english/n02105641_10188.jpg"
) {
    dogImage(modifier, imageUrl)
}

@Composable
@Preview
fun dogsListPreview(dogs: List<Dog> = Dogs.allDogs, onClick: (Dog) -> Unit = {}) {
    dogsList(dogs, onClick)
}
