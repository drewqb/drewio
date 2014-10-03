package com.visibolic.sayit.fragments;

import java.util.List;

import android.app.Fragment;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.visibolic.sayit.R;
import com.visibolic.sayit.extensibility.impl.StockPrice;

public class StockTableFragment extends Fragment 
{
	private TableLayout mTableLayout;
	private LayoutInflater mInflater;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) 
	{
		View rootView = inflater.inflate(R.layout.stock_table, container, false);
		mTableLayout = (TableLayout)rootView.findViewById(R.id.StockTable);
		
		Button refresh = (Button)rootView.findViewById(R.id.StockRefresh);
		refresh.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) {
				refreshStocks();
			}
			
		});
		Button refreshQuotues = (Button)rootView.findViewById(R.id.StockQuotes);
		refreshQuotues.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) {
				refreshQuotes();
			}
			
		});
		mInflater=inflater;
		
		refreshStocks();
		
		return rootView;
	}
	private void refreshStocks()
	{
		PopulateListTask task = new PopulateListTask();
		task.execute(new String[] { "Start" });
	}
	private void refreshQuotes()
	{
		PopulateQuotesTask task = new PopulateQuotesTask();
		task.execute(new String[] { "Start" });
	}
	private void setTaskResult(CustomAdapter result)
	{
		mInflater.inflate(R.layout.launcher_row, null);
		 
		if(result!=null && mTableLayout!=null)
		{
			mTableLayout.removeAllViews();
			TableRow header = (TableRow)mInflater.inflate(R.layout.stock_header_row, null);
			mTableLayout.addView(header);
			
			for(StockPrice pr : result.getPrices())
			{
				TableRow tr = (TableRow)mInflater.inflate(R.layout.stock_row, null);
				TextView tv_name = (TextView) tr.findViewById(R.id.StockName);
				TextView tv_price = (TextView) tr.findViewById(R.id.StockPrice);
				TextView tv_change = (TextView) tr.findViewById(R.id.StockChange);
				
				tv_name.setText(pr.getSymbol());
				tv_price.setText(pr.getPriceStr());
				tv_change.setText(pr.getChangeStr());
				if(pr.getChange()<0)
				{
					tv_name.setTextColor(getResources().getColor(android.R.color.holo_red_light));
					tv_price.setTextColor(getResources().getColor(android.R.color.holo_red_light));
					tv_change.setTextColor(getResources().getColor(android.R.color.holo_red_light));
				}
				else if(pr.getChange()>0)
				{
					tv_name.setTextColor(getResources().getColor(android.R.color.holo_green_light));
					tv_price.setTextColor(getResources().getColor(android.R.color.holo_green_light));
					tv_change.setTextColor(getResources().getColor(android.R.color.holo_green_light));
					
				}
				mTableLayout.addView(tr);
				
			}
		}
	}
	
	class CustomAdapter extends BaseAdapter
	{
		private List<StockPrice> myData;
		private LayoutInflater l_Inflater;

		public CustomAdapter(List<StockPrice> results)
		{
			myData = results;
			l_Inflater = LayoutInflater.from(getActivity());

		}
		public List<StockPrice> getPrices()
		{
			return myData;
		}
		@Override
		public int getCount() {
			return myData.size();

		}

		@Override
		public Object getItem(int position) {
			return myData.get(position);

		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) 
		{

			return null;

		}

	}
	
	class PopulateListTask extends  AsyncTask<String, Void, CustomAdapter>
	{
		@Override
		public void onPreExecute() 
		{
			getActivity().setProgressBarIndeterminateVisibility(true);
		}
		@Override
		protected CustomAdapter doInBackground(String... params) 
		{
			
			String[] symbols ={"ratl" ,"ibm", "aleri", "sap"}; 
			String jsonInput = StockPrice.getJsonPrices(symbols);
			CustomAdapter adapter = new CustomAdapter (StockPrice.getStockJson(jsonInput));
			
			return adapter;
		}
		@Override
		protected void onPostExecute(CustomAdapter result) 
		{
			getActivity().setProgressBarIndeterminateVisibility(false);
			setTaskResult(result);
		}


	}
	class PopulateQuotesTask extends  AsyncTask<String, Void, CustomAdapter>
	{
		@Override
		public void onPreExecute() 
		{
			getActivity().setProgressBarIndeterminateVisibility(true);
		}
		@Override
		protected CustomAdapter doInBackground(String... params) 
		{
			
			String[] symbols ={"NASDAQ:GOOG" ,"NASDAQ:MSFT","NSE:IBM", "NSE:SAP"}; 
			String jsonInput = StockPrice.readJsonGooglePrices(symbols);
			CustomAdapter adapter = new CustomAdapter (StockPrice.getGoogleStockJson(jsonInput));
			
			return adapter;
		}
		@Override
		protected void onPostExecute(CustomAdapter result) 
		{
			getActivity().setProgressBarIndeterminateVisibility(false);
			setTaskResult(result);
		}


	}
}
