package com.example.t1.adapters;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.t1.R;
import com.example.t1.models.Africa;
import com.example.t1.models.America;
import com.example.t1.models.Asia;
import com.example.t1.models.Australia;
import com.example.t1.models.Europa;
import com.example.t1.models.Fauna;
import com.example.t1.models.Type;

import java.util.List;

public class FaunaAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private List<Fauna> animals;
    private OnItemClickListener mListener;
    public interface OnItemClickListener {
        void onItemClick(int position,String animal);
    }
    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }

    public FaunaAdapter(List<Fauna> animals) {
        this.animals = animals;
    }

    @Override
    public int getItemViewType(int position) {
        return animals.get(position).getType().getKey();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == Type.EUROPA.getKey()) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.europa, parent, false);

            EuropaViewHolder viewHolder = new EuropaViewHolder(view);

            Log.e("Adapter", "onCreateViewHolder europa");

            return viewHolder;
        } else if (viewType == Type.AFRICA.getKey()) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.africa, parent, false);

            AfricaViewHolder viewHolder = new AfricaViewHolder(view);

            Log.e("Adapter", "onCreateViewHolder africa");

            return viewHolder;
        } else if (viewType == Type.ASIA.getKey()) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.asia, parent, false);

            AsiaViewHolder viewHolder = new AsiaViewHolder(view);

            Log.e("Adapter", "onCreateViewHolder africa");

            return viewHolder;
        } else if (viewType == Type.AMERICA.getKey()) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.america, parent, false);

            AmericaViewHolder viewHolder = new AmericaViewHolder(view);

            Log.e("Adapter", "onCreateViewHolder africa");

            return viewHolder;
        } else if (viewType == Type.AUSTRALIA.getKey()) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.australia, parent, false);

            AustraliaViewHolder viewHolder = new AustraliaViewHolder(view);

            Log.e("Adapter", "onCreateViewHolder africa");

            return viewHolder;
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        if(holder instanceof EuropaViewHolder) {
            Europa europaModel = (Europa) animals.get(position);

            ((EuropaViewHolder)holder).bind(europaModel);
        } else if(holder instanceof AfricaViewHolder) {
            Africa africaModel = (Africa) animals.get(position);

            ((AfricaViewHolder)holder).bind(africaModel);
        }else if(holder instanceof AsiaViewHolder) {
            Asia asiaModel = (Asia) animals.get(position);

            ((AsiaViewHolder)holder).bind(asiaModel);
        }else if(holder instanceof AmericaViewHolder) {
            America americaModel = (America) animals.get(position);

            ((AmericaViewHolder)holder).bind(americaModel);
        }else if(holder instanceof AustraliaViewHolder) {
            Australia australiaModel = (Australia) animals.get(position);

            ((AustraliaViewHolder)holder).bind(australiaModel);
        }

        Log.e("Adapter", "onBindViewHolder; position=" + position);
    }

    public int getItemCount() {
        return animals.size();
    }

    class EuropaViewHolder extends RecyclerView.ViewHolder {

        TextView animalTextView;
        TextView continentTextView;
        public EuropaViewHolder(@NonNull View itemView) {
            super(itemView);

            animalTextView = itemView.findViewById(R.id.animal);
            continentTextView=itemView.findViewById(R.id.continent);
            animalTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mListener != null) {
                        int position = getAdapterPosition();
                        Europa europaModel = (Europa) animals.get(position);
                        if (position != RecyclerView.NO_POSITION) {
                            mListener.onItemClick(position,europaModel.getAnimal());
                        }
                    }
                }
            });
            continentTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mListener != null) {
                        int position = getAdapterPosition();
                        Europa europaModel = (Europa) animals.get(position);
                        if (position != RecyclerView.NO_POSITION) {
                            mListener.onItemClick(position,europaModel.getAnimal());
                        }
                    }
                }
            });
        }

        public void bind(Europa europaModel) {
            animalTextView.setText(europaModel.getAnimal());
            continentTextView.setText(europaModel.getType().toString());
        }
    }
    class AfricaViewHolder extends RecyclerView.ViewHolder {
        TextView animalTextView;
        TextView continentTextView;
        public AfricaViewHolder(@NonNull View itemView) {
            super(itemView);

            animalTextView = itemView.findViewById(R.id.animal);
            continentTextView=itemView.findViewById(R.id.continent);
            animalTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mListener != null) {
                        int position = getAdapterPosition();

                        Africa africaModel = (Africa) animals.get(position);
                        if (position != RecyclerView.NO_POSITION) {
                            mListener.onItemClick(position,africaModel.getAnimal());
                        }
                    }
                }
            });
            continentTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mListener != null) {
                        int position = getAdapterPosition();

                        Africa africaModel = (Africa) animals.get(position);
                        if (position != RecyclerView.NO_POSITION) {
                            mListener.onItemClick(position,africaModel.getAnimal());
                        }
                    }
                }
            });
        }

        public void bind(Africa africaModel) {
            animalTextView.setText(africaModel.getAnimal());
            continentTextView.setText(africaModel.getType().toString());
        }
    }
    class AsiaViewHolder extends RecyclerView.ViewHolder {
        TextView animalTextView;
        TextView continentTextView;
        public AsiaViewHolder(@NonNull View itemView) {
            super(itemView);

            animalTextView = itemView.findViewById(R.id.animal);
            continentTextView=itemView.findViewById(R.id.continent);
            animalTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mListener != null) {
                        int position = getAdapterPosition();
                        Asia asia = (Asia) animals.get(position);
                        if (position != RecyclerView.NO_POSITION) {
                            mListener.onItemClick(position,asia.getAnimal());
                        }
                    }
                }
            });
            continentTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mListener != null) {
                        int position = getAdapterPosition();
                        Asia asia = (Asia) animals.get(position);
                        if (position != RecyclerView.NO_POSITION) {
                            mListener.onItemClick(position,asia.getAnimal());
                        }
                    }
                }
            });
        }

        public void bind(Asia asiaModel) {
            animalTextView.setText(asiaModel.getAnimal());
            continentTextView.setText(asiaModel.getType().toString());
        }
    }
    class AmericaViewHolder extends RecyclerView.ViewHolder {
        TextView animalTextView;
        TextView continentTextView;
        public AmericaViewHolder(@NonNull View itemView) {
            super(itemView);

            animalTextView = itemView.findViewById(R.id.animal);
            continentTextView=itemView.findViewById(R.id.continent);
            animalTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mListener != null) {
                        int position = getAdapterPosition();
                        America america = (America) animals.get(position);
                        if (position != RecyclerView.NO_POSITION) {
                            mListener.onItemClick(position,america.getAnimal());
                        }
                    }
                }
            });
            continentTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mListener != null) {
                        int position = getAdapterPosition();
                        America america = (America) animals.get(position);
                        if (position != RecyclerView.NO_POSITION) {
                            mListener.onItemClick(position,america.getAnimal());
                        }
                    }
                }
            });
        }

        public void bind(America americaModel) {
            animalTextView.setText(americaModel.getAnimal());
            continentTextView.setText(americaModel.getType().toString());
        }
    }class AustraliaViewHolder extends RecyclerView.ViewHolder {
        TextView animalTextView;
        TextView continentTextView;
        public AustraliaViewHolder(@NonNull View itemView) {
            super(itemView);

            animalTextView = itemView.findViewById(R.id.animal);
            continentTextView=itemView.findViewById(R.id.continent);
            animalTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mListener != null) {
                        int position = getAdapterPosition();
                        Australia australia = (Australia) animals.get(position);
                        if (position != RecyclerView.NO_POSITION) {
                            mListener.onItemClick(position,australia.getAnimal());
                        }
                    }
                }
            });
            continentTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mListener != null) {
                        int position = getAdapterPosition();
                        Australia australia = (Australia) animals.get(position);
                        if (position != RecyclerView.NO_POSITION) {
                            mListener.onItemClick(position,australia.getAnimal());
                        }
                    }
                }
            });
        }

        public void bind(Australia australiaModel) {
            animalTextView.setText(australiaModel.getAnimal());
            continentTextView.setText(australiaModel.getType().toString());
        }
    }
}
