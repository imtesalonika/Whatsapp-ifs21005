package com.ifs21005.whatsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PembaruanFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pembaruan, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val storyList : ArrayList<Story> = ArrayList()

        val storyPertama = Story(
            R.drawable.byun,
            "Byun Baekhyun",
            "18.08",
        )

        val storyKedua= Story(
            R.drawable.suho,
            "Suho",
            "17.30",
        )

        val storyKetiga= Story(
            R.drawable.kai,
            "Kai",
            "17.00"
        )

        val storyKeempat= Story(
            R.drawable.chanyeol,
            "Park Chanyeol",
            "16.30"
        )

        val storyKelima= Story(
            R.drawable.chen,
            "Chen",
            "16.00"
        )

        val storyKeenam= Story(
            R.drawable.sehun,
            "Sehun",
            "15.48"
        )

        val storyKetujuh= Story(
            R.drawable.kyungso,
            "Do Kyungsoo",
            "15.30"
        )

        val storyKedelapan= Story(
            R.drawable.xiumun,
            "Xiumin",
            "15.25"
        )

        val storyKesembilan= Story(
            R.drawable.lay,
            "Lay",
            "15.02"
        )

        val storyKesepuluh= Story(
            R.drawable.jaemin,
            "Na Jaemin ",
            "14.50"
        )

        val storyKesebelas= Story(
            R.drawable.jeno,
            "Lee Jeno",
            "14.38"
        )

        val storyKeduabelas= Story(
            R.drawable.taeyong,
            "Lee Taeyong",
            "14.24"
        )

        val storyKetigabelas= Story(
            R.drawable.chenle,
            "Zhong Chenle",
            "14.03"
        )

        val storyKeempatbelas= Story(
            R.drawable.jisung,
            "Jisung",
            "13.58"
        )

        storyList.add(storyPertama)
        storyList.add(storyKedua)
        storyList.add(storyKetiga)
        storyList.add(storyKeempat)
        storyList.add(storyKelima)
        storyList.add(storyKeenam)
        storyList.add(storyKetujuh)
        storyList.add(storyKedelapan)
        storyList.add(storyKesembilan)
        storyList.add(storyKesepuluh)
        storyList.add(storyKesebelas)
        storyList.add(storyKeduabelas)
        storyList.add(storyKetigabelas)
        storyList.add(storyKeempatbelas)


        val recyclerView : RecyclerView = view.findViewById(R.id.story_recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(
            context,
            LinearLayoutManager.VERTICAL,
            false
        )

        val adapter = StoryAdapter(storyList)
        recyclerView.adapter = adapter
    }
}