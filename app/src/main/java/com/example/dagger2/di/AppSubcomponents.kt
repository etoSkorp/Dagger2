package com.example.dagger2.di

import com.example.dagger2.login.LoginComponent
import com.example.dagger2.registration.RegistrationComponent
import com.example.dagger2.user.UserComponent
import dagger.Module

// This module tells AppComponent which are its subcomponents
@Module(subcomponents = [RegistrationComponent::class, LoginComponent::class, UserComponent::class])
class AppSubcomponents