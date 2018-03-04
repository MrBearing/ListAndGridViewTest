package com.tasktoys.listandgridviewtest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.GridView






class MainActivity : AppCompatActivity() {


    private lateinit var stringList : MutableList<String>
    private lateinit var arrayAdapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mGridView = findViewById<GridView>(R.id.gridView)

        makeStringGridVeiw(mGridView)

//        val uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI //SDカード
//        val cursor = contentResolver.query(uri, null, null, null, null)
//        val cr = contentResolver
//        val lstBitmap = ArrayList<Bitmap>()
//        cursor!!.moveToFirst()
//        for (i in 0 until cursor.count) {
//            val id = cursor.getLong(cursor.getColumnIndexOrThrow("_id"))
//            val bmp = MediaStore.Images.Thumbnails.getThumbnail(cr, id, MediaStore.Images.Thumbnails.MICRO_KIND, null)
//            lstBitmap.add(bmp)
//            cursor.moveToNext()
//        }
//
//        val pingArrayAdapter = PingArrayAdapter(applicationContext,lstBitmap)
//        mGridView.adapter = pingArrayAdapter

    }

    private fun makeStringGridVeiw(mGridView: GridView) {
        stringList = ArrayList()
        for (i in 1..5) {
            stringList.add("myItems" + i.toString())
        }

        arrayAdapter = ArrayAdapter<String>(
                this, R.layout.simple_item_1, stringList
        )
        mGridView.adapter = arrayAdapter
    }

    fun addStringItem(view: View){
        arrayAdapter.add("add Item" + stringList.size.toString())
    }
}
