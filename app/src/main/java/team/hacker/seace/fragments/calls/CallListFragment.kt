package team.hacker.seace.fragments.calls

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import team.hacker.seace.databinding.FragmentCallListBinding


class CallListFragment : Fragment()  {
private lateinit var fmCallListBinding: FragmentCallListBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        fmCallListBinding= FragmentCallListBinding.inflate(layoutInflater)

        return fmCallListBinding.root
fmCallListBinding.ivAvatar.setOnClickListener(View.OnClickListener {

})
    }

}