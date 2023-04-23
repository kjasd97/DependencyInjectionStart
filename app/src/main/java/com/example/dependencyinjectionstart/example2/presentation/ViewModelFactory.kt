package com.example.dependencyinjectionstart.example2.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton

class ViewModelFactory @Inject constructor(
    private val viewModelsProvider: @JvmSuppressWildcards Map<Class<out ViewModel>, Provider <ViewModel>>
) :ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return viewModelsProvider[modelClass]?.get() as T
    }

//    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
//       if (modelClass == ExampleViewModel::class.java){
//           return ExampleViewModel (exampleUseCase) as T
//       }
//       if (modelClass==ExampleViewModel2::class.java) {
//           return ExampleViewModel2(repository) as T
//       }
//        throw RuntimeException ("Unknown ViewModel Class $modelClass")
//    }



}