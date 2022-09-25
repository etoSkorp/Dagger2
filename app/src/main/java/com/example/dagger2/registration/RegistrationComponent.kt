package com.example.dagger2.registration

import com.example.dagger2.di.ActivityScope
import com.example.dagger2.registration.enterdetails.EnterDetailsFragment
import com.example.dagger2.registration.termsandconditions.TermsAndConditionsFragment
import dagger.Subcomponent

// Definition of a Dagger subcomponent
// Classes annotated with @ActivityScope will have a unique instance in this Component
@ActivityScope
@Subcomponent
interface RegistrationComponent {

    // Factory to create instances of RegistrationComponent
    @Subcomponent.Factory
    interface Factory {
        fun create(): RegistrationComponent
    }

    // Classes that can be injected by this Component
    fun inject(activity: RegistrationActivity)
    fun inject(fragment: EnterDetailsFragment)
    fun inject(fragment: TermsAndConditionsFragment)
}