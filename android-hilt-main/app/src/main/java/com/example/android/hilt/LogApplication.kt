/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.hilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

// 컴파일 타임 시 표준 컴포넌트 빌딩에 필요한 클래스들을 초기화를 해줍니다.
// 따라서 Hilt를 사용하는 모든 앱은 @HiltAndroidApp 이 달린 Application 클래스를 반드시 포함해야 합니다.
@HiltAndroidApp
class LogApplication : Application() {

//    lateinit var serviceLocator: ServiceLocator
//
//    override fun onCreate() {
//        super.onCreate()
//        serviceLocator = ServiceLocator(applicationContext)
//    }
}
