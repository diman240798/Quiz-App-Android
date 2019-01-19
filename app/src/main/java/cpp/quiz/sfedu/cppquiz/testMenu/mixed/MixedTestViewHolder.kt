package cpp.quiz.sfedu.cppquiz.testMenu.mixed

import android.support.v7.widget.RecyclerView
import android.view.View
import cpp.quiz.sfedu.cppquiz.testMenu.listener.TestClickListener

class MixedTestViewHolder(itemView: View, testClickListener: TestClickListener) : RecyclerView.ViewHolder(itemView) {

    init {
        itemView.setOnClickListener {
            testClickListener.onTestClicked(itemView.context, adapterPosition)
        }
    }

    fun bindItems(mixedTest: MixedTest) {
        itemView.apply {

        }
    }

}
