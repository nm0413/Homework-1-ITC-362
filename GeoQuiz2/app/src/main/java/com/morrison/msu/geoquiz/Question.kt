package com.morrison.msu.geoquiz

import androidx.annotation.StringRes

data class Question(@StringRes val textResID: Int, val answer: Boolean)