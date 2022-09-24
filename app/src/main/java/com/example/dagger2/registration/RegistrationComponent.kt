package com.example.dagger2.registration

import com.example.dagger2.registration.enterdetails.EnterDetailsFragment
import com.example.dagger2.registration.termsandconditions.TermsAndConditionsFragment
import dagger.Subcomponent

// Definition of a Dagger subcomponent
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