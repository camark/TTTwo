package com.gm

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor

/**
 * Created by Administrator on 2017-01-17.
 */


data class  Ctt (var error:Int,var msg:String){

    constructor():this(1,"hello"){
    }

    override fun toString(): String {
        return "Error no:$error Msg:$msg"
    }

    fun cx(a: Int): Int {
        return a + 1
    }
}
