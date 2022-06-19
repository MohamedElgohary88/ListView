package com.example.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.list_row.view.*

// ده كلاس PersonAdapter بياخد 2 باراميتر  وهما 1-السياق / 2-المصفوفة اللى هيحولها اللى فيها العناصر
class PersonAdapter(context: Context, person: ArrayList<Person>) :
// بياخد الحاجات  من ArrayAdapter ونوعها Person  احنا اللى بنحدده عادى وبياخد 3 باراميتر  1-السياق 2- يكون null او 0 عادى 3-اسم الكلاس اللى المصفوفة موجودة فيه
    ArrayAdapter<Person>(context,0,person){

// getView  كده عشان نضع العناصر والصور فى كل صف من ListView لازم نستدعى داله
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
// باختصار هذا السطر القادم معناه ان يتم به الوصول الى row اللى احنا عملناه الموجود داخل listview
    // اما inflate معناه
// عملنا متغير listItemView يساوى LayoutInflater واستدعينا دالة from واعطيناها السياق context
// واستدعينا دالة inflate تاخذ 3 باراميتر /// "1- المكان اللى هتضع فيه البيانات وهو R.layout.list_row"
// "2-parent وهو view group" //// "3- false او true"
    val listItemView = LayoutInflater.from(context).inflate(R.layout.list_row,parent,false)

    // هذه الدالة تاتى بالبيانات على حسب position وهنخزنها فى متغير
    //  position عندما تكون position   يساوى 0 مثلا ///1 يتم جلب هذه البيانات

    val person = getItem(position)
    person!!.name
    person.description
    person.image

//  ( name description image ) ومن ثم نضعها فى كل row من list على حسب
    // وضعنا كل من البيانات فى مكانها الصحيح فى الليست فيو
    listItemView.name_txt.text = person.name
    listItemView.desc_txt.text = person.description
    listItemView.person_image.setImageResource(person.image)
    // وبعد كده ارجع ل listItemView
    return listItemView

    }
}
