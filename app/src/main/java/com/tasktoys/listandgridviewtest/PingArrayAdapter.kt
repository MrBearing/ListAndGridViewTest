package com.tasktoys.listandgridviewtest

import android.content.Context
import android.graphics.Bitmap
import android.widget.ArrayAdapter
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView


/**
 * Created by takum on 2018/03/03.
 */


class PingArrayAdapter(context: Context, objects: List<Bitmap>) : ArrayAdapter<Bitmap>(context, RESOURCE_ID, objects) {

    private val mInflater: LayoutInflater

    init {
        mInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView
        if (convertView == null) {
            convertView = mInflater.inflate(RESOURCE_ID, null)
        }
        val imageView = convertView!!.findViewById(R.id.imageView1) as ImageView
        imageView.setImageBitmap(getItem(position))
        return convertView
    }

    companion object {
        private val RESOURCE_ID = R.layout.grid_item
    }

}