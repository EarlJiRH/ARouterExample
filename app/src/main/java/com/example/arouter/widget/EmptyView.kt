package com.example.arouter.widget

import android.annotation.SuppressLint
import android.content.Context
import android.text.TextUtils
import android.util.AttributeSet
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.IntegerRes
import com.example.arouter.R
import com.hjq.shape.view.ShapeButton

/**
 * ================================================
 * 类名：com.example.arouter.widget
 * 时间：2021/9/1 15:58
 * 描述：
 * 修改人：
 * 修改时间：
 * 修改备注：
 * ================================================
 * @author Admin
 */
class EmptyView : LinearLayout {

    var icon: ImageView? = null
    var title: TextView? = null
    var button: ShapeButton? = null

    constructor(context: Context) : this(context, null) {}

    constructor(context: Context, attributes: AttributeSet?) : this(context, attributes, 0) {}

    constructor(context: Context, attributes: AttributeSet?, defstyle: Int) : super(
        context,
        attributes,
        defstyle
    ) {
        orientation = VERTICAL
        gravity = Gravity.CENTER
        LayoutInflater.from(context).inflate(R.layout.layout_empty_view, this, true)


        icon = findViewById(R.id.empty_icon)
        title = findViewById(R.id.empty_text)
        button = findViewById(R.id.empty_action)


//        val typeface: Typeface = Typeface.createFromAsset(context.assets, "font/iconfont.ttf")
//        icon!!.typeface = typeface
    }


    fun setIcon(iconRes: Int) {
        icon?.apply {
            setImageResource(iconRes)
        }
    }


    fun setTitle(text: String) {
        title?.apply {
            setText(text)
            visibility = if (TextUtils.isDigitsOnly(text)) View.GONE else View.VISIBLE
        }
    }


    fun setButton(text: String, listener: OnClickListener) {
        button?.apply {
            if (TextUtils.isEmpty(text)) {
                visibility = View.GONE
            } else {
                visibility = View.VISIBLE
                setText(text)
                setOnClickListener(listener)
            }
        }

    }
}