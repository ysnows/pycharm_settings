package ${PACKAGE_NAME}.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.ysnows.common.ui.BaseAdapter;
import com.aspsine.irecyclerview.IViewHolder;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by xianguangjin on 16/6/2.
 */

public class ${classname}Adapter extends BaseAdapter {


    public  ${classname}Adapter(Context context) {
        super(context);
    }

    @Override
    public IViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.item_${itemLayout}, null);
        VHolder vHolder = new VHolder(itemView);

        return vHolder;
    }

    @Override
    public void onBindViewHolder(IViewHolder holder, int position) {
        if (holder != null) {
            VHolder vHolder = (VHolder) holder;

            ${item} item = (${item}) data.get(position);




            vHolder.itemView.setOnClickListener(v -> {
                if (mOnItemClickListener != null) {
                    mOnItemClickListener.onItemClick(position, item, v);
                }
            });

        }
    }

    static class VHolder extends IViewHolder {

        VHolder(View view) {
            super(view);
            try {
                ButterKnife.bind(this, view);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}
