package com.example.ristorante

import android.os.Parcel
import android.os.Parcelable

data class Pietanza(var nome: String, var produttore: String, var tipologia: String, var gradazione: Float) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readFloat()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nome)
        parcel.writeString(produttore)
        parcel.writeString(tipologia)
        parcel.writeFloat(gradazione)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Pietanza> {
        override fun createFromParcel(parcel: Parcel): Pietanza {
            return Pietanza(parcel)
        }

        override fun newArray(size: Int): Array<Pietanza?> {
            return arrayOfNulls(size)
        }
    }
}