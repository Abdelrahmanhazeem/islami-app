package com.example.islami.ui.home.quran

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.islami.R


class QuranFragment : Fragment() {

    private lateinit var chaptersRecycler: RecyclerView
    private lateinit var adapter: ChaptersRecyclerAdapter
    private lateinit var chaptersList: MutableList<Chapter>


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quran, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initList()
        initViews(view)
    }


    private fun initViews(view: View) {
        chaptersRecycler = view.findViewById(R.id.rv_chapters)
        adapter = ChaptersRecyclerAdapter(chaptersList)
        chaptersRecycler.adapter = adapter

    }

    private fun initList() {
        chaptersList = mutableListOf()
        Constants.chapters.forEachIndexed { index, item ->
            chaptersList.add(Chapter(item, index + 1))
        }

    }

}