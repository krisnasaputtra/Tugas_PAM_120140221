package com.example.tugas_pam_120140221.model

import android.os.Parcel
import android.os.Parcelable

data class Skill(val imageSkill: Int, var textImageSkill:String) : Parcelable{
    constructor(parcel: Parcel): this(
        parcel.readInt(),
        parcel.readString()!!
    )
    {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(imageSkill)
        parcel.writeString(textImageSkill)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Skill> {
        override fun createFromParcel(parcel: Parcel): Skill {
            return Skill(parcel)
        }

        override fun newArray(size: Int): Array<Skill?> {
            return arrayOfNulls(size)
        }
    }

}