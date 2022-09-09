package cn.galasp.recyclerview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("NotifyDataSetChanged")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycle_view.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        var simpleRecyclerViewAdapter=SimpleRecyclerViewAdapter()

        recycle_view.adapter = simpleRecyclerViewAdapter
        simpleRecyclerViewAdapter.addData("123")

    }
}