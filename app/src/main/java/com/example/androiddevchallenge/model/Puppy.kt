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
package com.example.androiddevchallenge.model

import com.example.androiddevchallenge.R

data class Puppy(
    val id: Int,
    val name: String,
    val age: String,
    val description: String,
    val painterRes: Int
)

const val description = "thanks pexels.com for open-source puppy pictures"

val sample1 = Puppy(1, "Lucas", "Age : 3 months old", description, R.drawable.puppy_res_1)
val sample2 = Puppy(2, "Anna", "Age : 3 months old", description, R.drawable.puppy_res_2)
val sample3 = Puppy(3, "Josh", "Age : 6 months old", description, R.drawable.puppy_res_3)
val sample4 = Puppy(4, "Helena", "Age : 4 months old", description, R.drawable.puppy_res_4)

val puppies = listOf(sample1, sample2, sample3, sample4)
