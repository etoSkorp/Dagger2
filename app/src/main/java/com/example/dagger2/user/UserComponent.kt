package com.example.dagger2.user

import com.example.dagger2.main.MainActivity
import com.example.dagger2.settings.SettingsActivity
import dagger.Subcomponent

// Definition of a Dagger subcomponent
// Scope annotation that the UserComponent uses
// Classes annotated with @LoggedUserScope will have a unique instance in this Component
@LoggedUserScope
@Subcomponent
interface UserComponent {

    // Factory to create instances of UserComponent
    @Subcomponent.Factory
    interface Factory {
        fun create(): UserComponent
    }

    // Classes that can be injected by this Component
    fun inject(activity: MainActivity)
    fun inject(activity: SettingsActivity)
}