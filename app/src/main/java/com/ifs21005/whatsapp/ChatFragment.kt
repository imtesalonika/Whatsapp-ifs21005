package com.ifs21005.whatsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ChatFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chat, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dataChat : ArrayList<ChatData> = ArrayList()

        val chatPertama = ChatData(
            R.drawable.byun,
            "Byun Baekhyun",
            "Chegiya. Jinca",
            "29/03/2024"
        )

        val chatKedua= ChatData(
            R.drawable.suho,
            "Suho",
            "EX0-L Saranghaja ",
            "29/03/2024"
        )

        val chatKetiga= ChatData(
            R.drawable.kai,
            "Kai",
            "Namja chingu",
            "29/03/2024"
        )

        val chatKeempat= ChatData(
            R.drawable.chanyeol,
            "Park Chanyeol",
            "Jangan lupa datang ke konser kami ya",
            "29/03/2024"
        )

        val chatKelima= ChatData(
            R.drawable.chen,
            "Chen",
            "Aku sudah menikah",
            "29/03/2024"
        )

        val chatKeenam= ChatData(
            R.drawable.sehun,
            "Sehun",
            "Aku member termuda di EXO",
            "29/03/2024"
        )

        val chatKetujuh= ChatData(
            R.drawable.kyungso,
            "Do Kyungsoo",
            "Aku adalah seorang aktor seklaigus penyanyi",
            "29/03/2024"
        )

        val chatKedelapan= ChatData(
            R.drawable.xiumun,
            "Xiumin",
            "Aku member paling putih di EXO",
            "29/03/2024"
        )

        val chatKesembilan= ChatData(
            R.drawable.lay,
            "Lay",
            "Aku member yang berasal dari China",
            "29/03/2024"
        )

        val chatKesepuluh= ChatData(
            R.drawable.jaemin,
            "Na Jaemin ",
            "Nama panggilanku nana",
            "29/03/2024"
        )

        val chatKesebelas= ChatData(
            R.drawable.jeno,
            "Lee Jeno",
            "Aku member yang memiliki otot",
            "29/03/2024"
        )

        val chatKeduabelas= ChatData(
            R.drawable.taeyong,
            "Lee Taeyong",
            "Aku leader NCT",
            "29/03/2024"
        )

        val chatKetigabelas= ChatData(
            R.drawable.chenle,
            "Zhong Chenle",
            "Aku member terkaya",
            "29/03/2024"
        )

        val chatKeempatbelas= ChatData(
            R.drawable.jisung,
            "Jisung",
            "Aku member paling muda di NCT",
            "29/03/2024"
        )


        dataChat.add(chatPertama)
        dataChat.add(chatKedua)
        dataChat.add(chatKetiga)
        dataChat.add(chatKeempat)
        dataChat.add(chatKelima)
        dataChat.add(chatKeenam)
        dataChat.add(chatKetujuh)
        dataChat.add(chatKedelapan)
        dataChat.add(chatKesembilan)
        dataChat.add(chatKesepuluh)
        dataChat.add(chatKesebelas)
        dataChat.add(chatKeduabelas)
        dataChat.add(chatKetigabelas)
        dataChat.add(chatKeempatbelas)


        val recyclerView : RecyclerView = view.findViewById(R.id.my_recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(
            context,
            LinearLayoutManager.VERTICAL,
            false
        )

        val adapter = MyAdapter(dataChat)
        recyclerView.adapter = adapter
    }
}