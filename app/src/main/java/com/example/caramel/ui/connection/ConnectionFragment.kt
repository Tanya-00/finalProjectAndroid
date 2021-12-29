package com.example.caramel.ui.connection

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.caramel.R
import com.example.caramel.databinding.FragmentConnectionBinding
import com.squareup.picasso.Picasso
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory

class ConnectionFragment : Fragment() {

    private lateinit var connectionViewModel: ConnectionViewModel
    private var _binding: FragmentConnectionBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        connectionViewModel =
            ViewModelProvider(this).get(ConnectionViewModel::class.java)

        _binding = FragmentConnectionBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val retrofit: Retrofit =  Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val gitAPI: GitApi = retrofit.create(GitApi::class.java)

        gitAPI.getUser("Tanya-00").enqueue(object: Callback<GitApi.GitUser> {
            override fun onFailure(call: Call<GitApi.GitUser>, t: Throwable) {

            }

            override fun onResponse(call: Call<GitApi.GitUser>, response: Response<GitApi.GitUser>) {
                val user: GitApi.GitUser? = response.body()

                Log.d("AvatarURL", "${user?.avatarURL}")
                Log.d("Login", "${user?.login}")

                val imageView: ImageView = binding.avatar

                Picasso.get()
                    .load(user?.avatarURL)
                    .placeholder(R.drawable.ic_launcher_foreground)
                    .error(R.drawable.ic_launcher_background)
                    .into(imageView);
            }
        })

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}