package com.example.dependencyinjectionstart.example2.di

import com.example.dependencyinjectionstart.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Subcomponent

@Subcomponent( modules = [ViewModelModule::class])
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)

    @Subcomponent.Factory
    interface Factory {

    fun create ( @BindsInstance id:String):ActivityComponent

    }
}