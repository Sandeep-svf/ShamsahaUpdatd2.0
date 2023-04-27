package com.sam.shamsahaupdatd20.victim.dashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import com.sam.shamsahaupdatd20.R
import com.sam.shamsahaupdatd20.databinding.ActivityDashboardBinding
import com.sam.shamsahaupdatd20.utils.UtilFun
import com.sam.shamsahaupdatd20.victim.chat.chatFragment

class DashboardActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_dashboard)

        binding.homeVictimLayout.setOnClickListener(View.OnClickListener {
            val activity =it.context as FragmentActivity
            val homeFragment  = HomeFragment()
            UtilFun.replaceFragmentVictim(activity,homeFragment);
        })

        binding.chatVictimLayout.setOnClickListener(View.OnClickListener {
            val activity =it.context as FragmentActivity
            val chatFragmentobj  = chatFragment()
            UtilFun.replaceFragmentVictim(activity,chatFragmentobj);
        })



    }
}