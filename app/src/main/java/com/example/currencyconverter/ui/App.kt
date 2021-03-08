package com.example.currencyconverter.ui

import android.app.Application
import com.example.currencyconverter.R
import com.example.currencyconverter.di.initDI
import io.github.inflationx.calligraphy3.CalligraphyConfig
import io.github.inflationx.calligraphy3.CalligraphyInterceptor
import io.github.inflationx.viewpump.ViewPump


class App : Application() {

    override fun onCreate() {
        super.onCreate()

//        CalligraphyConfig.initDefault(
//            CalligraphyConfig.Builder()
//                .setDefaultFontPath("fonts/Montserrat-Bold.ttf")
//                .setFontAttrId(R.attr.fontPath)
//                .build()
//        )

        ViewPump.init(
            ViewPump.builder()
                .addInterceptor(
                    CalligraphyInterceptor(
                        CalligraphyConfig.Builder()
                            .setDefaultFontPath("fonts/Montserrat-Bold.ttf")
                            .setFontAttrId(R.attr.fontPath)
                            .build()
                    )
                )
                .build()
        )

        initDI()
    }
}
