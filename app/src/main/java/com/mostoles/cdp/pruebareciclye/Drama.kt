package com.mostoles.cdp.pruebareciclye

import android.os.Parcel
import android.os.Parcelable

data class Drama(val image:Int, val name:String,val descripcion:String): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(image)
        parcel.writeString(name)
        parcel.writeString(descripcion)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Drama> {
        override fun createFromParcel(parcel: Parcel): Drama {
            return Drama(parcel)
        }

        override fun newArray(size: Int): Array<Drama?> {
            return arrayOfNulls(size)
        }
    }

}
