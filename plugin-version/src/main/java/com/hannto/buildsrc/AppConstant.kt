package com.hannto.buildsrc


object AppConstant {


    const val ComponentApplicationId = "com.hannto.component"
    const val JiYinApplicationId = "com.hannto.jiyin.print"
    const val XiaoMiApplicationId = "com.mi.print"

    const val compileSdkVersion = 31
    const val minSdkVersion = 26
    const val targetSdkVersion = 29

    const val versionCode = 1
    const val versionName = "1.0.0"



    //开启LeakCanary
    const val OpenLeakCanary = false
    //开启RN，暂时不支持在buildSrc中配置rn
    const val OpenRN = false


}