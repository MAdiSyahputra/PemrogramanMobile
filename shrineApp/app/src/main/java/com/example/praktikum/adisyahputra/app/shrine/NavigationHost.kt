package com.example.praktikum.adisyahputra.app.shrine

import androidx.fragment.app.Fragment

interface NavigationHost {

    fun navigateTo(fragment: Fragment, addToBackstack: Boolean)
}
