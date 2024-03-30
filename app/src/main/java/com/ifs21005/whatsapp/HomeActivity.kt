package com.ifs21005.whatsapp

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val chatFragment = ChatFragment()

        loadFragment(chatFragment)

        val tombolHome : ImageButton = findViewById(R.id.imageButton4)
        val tombolPembaruan : ImageButton = findViewById(R.id.imageButton)
        val tombolKomunitas : ImageView = findViewById(R.id.imageButton2)
        val tombolPanggilan : ImageButton = findViewById(R.id.imageButton3)

        tombolHome.setOnClickListener{
            loadFragment(ChatFragment())
        }

        tombolPembaruan.setOnClickListener {
            loadFragment(PembaruanFragment())
        }

        tombolKomunitas.setOnClickListener {
            loadFragment(KomunitasFragment())
        }

        tombolPanggilan.setOnClickListener {
            loadFragment(PanggilanFragment())
        }
    }

    fun loadFragment (fragment : Fragment) {
        val fragmentManager = supportFragmentManager

        val fragmentTransaction : FragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.tempat_fragment, fragment)
        fragmentTransaction.commit()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id : Int = item.itemId

        if (id == R.id.grup) {
            loadFragment(GrupFragment())
        }

        if (id == R.id.broadcast) {
            loadFragment(BroadcastFragment())
        }

        if (id == R.id.linked) {
            loadFragment(PerangkatTertautFragment())
        }

        if (id == R.id.pesan_berbintang) {
            loadFragment(PesanBerbintangFragment())
        }

        if (id == R.id.setelan) {
            loadFragment(SetelanFragment())
        }

        if (id == R.id.beralih_akun) {
            loadFragment(BeralihAkunFragment())
        }

        return true
    }

}