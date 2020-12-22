package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class recycleView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_view)

        val recycler_view : RecyclerView = findViewById(R.id.recycler_view)
        val carList = ArrayList<CarForList>()
        for (i in 0 until 50){
            carList.add(CarForList("" + i + " 번째 자동차", "" + i + "순위 엔진"))
        }
        val adpater = RecycleViewAdpater(carList, LayoutInflater.from(this@recycleView))
        recycler_view.adapter = adpater
        recycler_view.layoutManager = LinearLayoutManager(this@recycleView)
        //recycler_view.layoutManager = GridLayoutManager(this@recycleView, 2)
    }
}

class RecycleViewAdpater(
    val itemList : ArrayList<CarForList>,
    val inflater : LayoutInflater
) : RecyclerView.Adapter<RecycleViewAdpater.ViewHolder> () {

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val carName : TextView
        val carEngine : TextView
        
        init{
            carName = itemView.findViewById(R.id.car_name)
            carEngine = itemView.findViewById(R.id.car_engine)
            itemView.setOnClickListener {
                val position_count = adapterPosition
                val engine_name = itemList.get(position_count).engine
                Log.d("engine", engine_name)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = inflater.inflate(R.layout.item_view, parent , false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return  itemList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.carName.setText(itemList.get(position).name)
        holder.carEngine.setText(itemList.get(position).engine)
    }
}

class CarForList(val name: String, val engine: String) {

}