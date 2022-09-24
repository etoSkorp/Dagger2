package com.example.dagger2.di

import com.example.dagger2.registration.RegistrationComponent
import dagger.Module

// This module tells AppComponent which are its subcomponents
@Module(subcomponents = [RegistrationComponent::class])
class AppSubcomponents