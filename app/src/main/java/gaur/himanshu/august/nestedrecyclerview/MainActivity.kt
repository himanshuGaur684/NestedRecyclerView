package gaur.himanshu.august.nestedrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import gaur.himanshu.august.nestedrecyclerview.adapter.ParentAdapter
import gaur.himanshu.august.nestedrecyclerview.databinding.ActivityMainBinding
import gaur.himanshu.august.nestedrecyclerview.model.Parent

class MainActivity : AppCompatActivity() {


    val list = mutableListOf<Parent>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding= DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)

        initList()


        binding.mainRecycler.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = ParentAdapter(list)
        }


    }


    private fun initList() {
        list.add(Parent("Section 1", mutableListOf("one", "two", "three", "four", "five")))
        list.add(Parent("Section 2", mutableListOf("one", "four", "three", "four", "five")))
        list.add(Parent("Section 3", mutableListOf("one", "two", "ten", "four", "five")))
        list.add(Parent("Section 4", mutableListOf("one", "two", "three", "four", "five")))
        list.add(Parent("Section 5", mutableListOf("one", "nine", "three", "four", "five")))
        list.add(Parent("Section 6", mutableListOf("twelve", "two", "three", "four", "five")))
        list.add(Parent("Section 7", mutableListOf("one", "two", "three", "four", "five")))
        list.add(Parent("Section 8", mutableListOf("one", "two", "three", "four", "five")))
        list.add(Parent("Section 9", mutableListOf("one", "two", "three", "four", "five")))
        list.add(Parent("Section 10", mutableListOf("one", "two", "three", "four", "five")))
        list.add(Parent("Section 11", mutableListOf("one", "two", "three", "four", "five")))
    }
}