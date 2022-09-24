package com.example.dagger2.di

import android.content.Context
import com.example.dagger2.main.MainActivity
import com.example.dagger2.registration.RegistrationActivity
import com.example.dagger2.registration.RegistrationComponent
import com.example.dagger2.registration.enterdetails.EnterDetailsFragment
import com.example.dagger2.registration.termsandconditions.TermsAndConditionsFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

// Definition of a Dagger component that adds info from the StorageModule to the graph
@Singleton
@Component(modules = [StorageModule::class, AppSubcomponents::class])
interface AppComponent {

    // Factory to create instances of the AppComponent
    @Component.Factory
    interface Factory {
        // With @BindsInstance, the Context passed in will be available in the graph
        fun create(@BindsInstance context: Context) : AppComponent
    }

    // Expose RegistrationComponent factory from the graph
    fun registrationComponent(): RegistrationComponent.Factory

    // Classes that can be injected by this Component
    fun inject(activity: MainActivity)
}