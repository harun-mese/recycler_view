package www.harunmese.dev.recycler_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import www.harunmese.dev.recycler_view.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        //val recyclerview = binding.recyclerview
        //val adapter = RecyclerviewAdapter()
        //recyclerview.layoutManager = LinearLayoutManager(this)
        //recyclerview.adapter = adapter

        val recyclerview = binding.recyclerview
        val adapter = MultipleViewRecyclerAdapter()
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = adapter


    }
}