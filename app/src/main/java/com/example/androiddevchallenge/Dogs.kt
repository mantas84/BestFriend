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

object Dogs {

    val allDogs = listOf<Dog>(
        Dog(
            id = 0,
            name = "Cooper",
            breed = "English Sheepdog",
            image = "https://images.dog.ceo/breeds/sheepdog-english/n02105641_10188.jpg"
        ),
        Dog(
            id = 1,
            name = "Spike",
            breed = "Terrier-Westhighland",
            image = "https://images.dog.ceo/breeds/terrier-westhighland/n02098286_3263.jpg"
        ),
        Dog(
            id = 2,
            name = "Ace",
            breed = "Otterhound",
            image = "https://images.dog.ceo/breeds/otterhound/n02091635_1337.jpg"
        ),
        Dog(
            id = 3,
            name = "Doggo",
            breed = "Beagle",
            image = "https://images.dog.ceo/breeds/beagle/n02088364_17294.jpg"
        ),
        Dog(
            id = 4,
            name = "Bruno",
            breed = "Norfolk Terrier",
            image = "https://images.dog.ceo/breeds/terrier-norfolk/n02094114_515.jpg"
        ),
        Dog(
            id = 5,
            name = "Gauss",
            breed = "Swiss Mountain",
            image = "https://images.dog.ceo/breeds/mountain-swiss/n02107574_2356.jpg"
        ),
        Dog(
            id = 6,
            name = "Decarte",
            breed = "Norwich Terrier",
            image = "https://images.dog.ceo/breeds/terrier-norwich/n02094258_2711.jpg"
        ),
        Dog(
            id = 7,
            name = "Cardano",
            breed = "Flatcoated Retriever",
            image = "https://images.dog.ceo/breeds/retriever-flatcoated/n02099267_5745.jpg"
        ),
        Dog(
            id = 8,
            name = "Euler",
            breed = "Fox Terrier",
            image = "https://images.dog.ceo/breeds/terrier-fox/n02095314_1033.jpg"
        ),
        Dog(
            id = 9,
            name = "Cantor",
            breed = "Bichon Frise",
            image = "https://images.dog.ceo/breeds/frise-bichon/4.jpg"
        ),
        Dog(
            id = 10,
            name = "Turing",
            breed = "Dandie Terrier",
            image = "https://images.dog.ceo/breeds/terrier-dandie/n02096437_850.jpg"
        ),
        Dog(
            id = 11,
            name = "Pascal",
            breed = "Chesapeake Retriever",
            image = "https://images.dog.ceo/breeds/retriever-chesapeake/n02099849_4692.jpg"
        ),
        Dog(
            id = 12,
            name = "Euclid",
            breed = "Toy Poodle",
            image = "https://images.dog.ceo/breeds/poodle-toy/n02113624_619.jpg"
        ),
        Dog(
            id = 13,
            name = "Napier",
            breed = "Cairn",
            image = "https://images.dog.ceo/breeds/cairn/n02096177_1889.jpg"
        ),
        Dog(
            id = 14,
            name = "Kepler",
            breed = "Dingo",
            image = "https://images.dog.ceo/breeds/dingo/n02115641_2701.jpg"
        ),
        Dog(
            id = 15,
            name = "Leibniz",
            breed = "Sussex Spaniel",
            image = "https://images.dog.ceo/breeds/spaniel-sussex/n02102480_6179.jpg"
        ),
        Dog(
            id = 16,
            name = "Bayes",
            breed = "Chow",
            image = "https://images.dog.ceo/breeds/chow/n02112137_1733.jpg"
        ),
        Dog(
            id = 17,
            name = "Lebesgue",
            breed = "Akita",
            image = "https://images.dog.ceo/breeds/akita/Akita_Inu_dog.jpg"
        ),
        Dog(
            id = 18,
            name = "Riemann",
            breed = "Basset Hound",
            image = "https://images.dog.ceo/breeds/hound-basset/n02088238_13709.jpg"
        ),
        Dog(
            id = 19,
            name = "Dirichlet",
            breed = "Redbone",
            image = "https://images.dog.ceo/breeds/redbone/n02090379_980.jpg"
        ),
        Dog(
            id = 20,
            name = "Bernoulli",
            breed = "Saluki",
            image = "https://images.dog.ceo/breeds/saluki/n02091831_4142.jpg"
        ),
        Dog(
            id = 21,
            name = "Lagrange",
            breed = "Leonberg",
            image = "https://images.dog.ceo/breeds/leonberg/n02111129_4048.jpg"
        ),
    )

    fun findDog(id: Int): Dog {
        return allDogs.find { it.id == id }!!
    }
}

data class Dog(val id: Int, val name: String, val breed: String, val image: String) {
    val desc: String
        get() = "This unbelievably adorable face belongs to $name. Although he does not get along great with dogs, he certainly loves his humans. $name will be your one and only biggest fan - in return he just wants love, attention and a forever home. $name is high energy and playful. He will need basic training and we feel a single family home would be the best environment for him since he is not dog-friendly and will need training. When $name gets excited and wants to play, Please adopt him"
}
