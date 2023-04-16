package com.patel.quickstart.scaffold

import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

suspend fun <T: Any> apiCall(call: ()->T?): Result<T> {
    return suspendCoroutine {
        try {
            val response = call()
            if (response != null) {
                it.resume(Result.Success(response))
            } else {
                it.resume(Result.Failure(Throwable("Error in getting the response")))
            }
        } catch (e: Throwable) {
            it.resume(Result.Failure(e))
        }
    }
}
