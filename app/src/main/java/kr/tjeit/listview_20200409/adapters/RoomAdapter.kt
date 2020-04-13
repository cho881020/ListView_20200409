package kr.tjeit.listview_20200409.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kr.tjeit.listview_20200409.R
import kr.tjeit.listview_20200409.datas.Room

class RoomAdapter(context: Context, resId:Int, list: ArrayList<Room>) : ArrayAdapter<Room>(context, resId, list) {

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.room_list_item, null)
        }

        val row = tempRow!!

//        row변수를 활용해서 각줄에 맞는 데이터 가공.

        return row

    }


}