package com.devansh.calculator;

import android.R.id;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.String;
import java.lang.StringBuilder;

public class MainActivity extends ActionBarActivity {
	
	
	String curOper = null , nextOper = null ;
	float dataOne = 0 , dataTwo = 0 ,result = 0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final EditText et = (EditText) findViewById(R.id.editText1); 
		Button one = (Button) findViewById(R.id.button1);
		Button two = (Button) findViewById(R.id.button2);
		Button three = (Button) findViewById(R.id.button3);
		Button four = (Button) findViewById(R.id.button4);
		Button five = (Button) findViewById(R.id.button5);
		Button six = (Button) findViewById(R.id.button6);
		Button seven = (Button) findViewById(R.id.button7);
		Button eight = (Button) findViewById(R.id.button8);
		Button nine = (Button) findViewById(R.id.button9);
		Button zero = (Button) findViewById(R.id.button10);
		Button plus = (Button) findViewById(R.id.button11);
		Button minus = (Button) findViewById(R.id.button12);
		Button multi = (Button) findViewById(R.id.button13);
		Button div = (Button) findViewById(R.id.button14);
		Button eql = (Button) findViewById(R.id.button15);
		Button dec = (Button) findViewById(R.id.button16);
		Button ac = (Button) findViewById(R.id.button17);
		Button c = (Button) findViewById(R.id.button18);
		
	//	et.setText("0", TextView.BufferType.EDITABLE);
		
		one.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				int index;
				String s = et.getText().toString();   // check the return value of this when et is empty
				s = s + "1";
				et.setText(s, TextView.BufferType.EDITABLE);
				if(curOper != null){
					index = s.indexOf(curOper);
					dataTwo = Float.parseFloat(s.substring(index + 1));
				}
				else{
					dataOne = Float.parseFloat(s);
				}
			}
		});
		
		two.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int index;
				String s = et.getText().toString();
				s = s + "2";
				et.setText(s, TextView.BufferType.EDITABLE);
				if(curOper != null){
					index = s.indexOf(curOper);
					dataTwo = Float.parseFloat(s.substring(index + 1));   //check this function again
				}
				else{
					dataOne = Float.parseFloat(s);
				}
				
			}
		});
		
		three.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						int index;
						String s = et.getText().toString();
						s = s + "3";
						et.setText(s, TextView.BufferType.EDITABLE);
						if(curOper != null){
							index = s.indexOf(curOper);
							dataTwo = Float.parseFloat(s.substring(index + 1));
						}
						else{
							dataOne = Float.parseFloat(s);
						}
					}
				});
		four.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						int index;
						String s = et.getText().toString();
						s = s + "4";
						et.setText(s, TextView.BufferType.EDITABLE);
						if(curOper != null){
							index = s.indexOf(curOper);
							dataTwo = Float.parseFloat(s.substring(index + 1));
						}
						else{
							dataOne = Float.parseFloat(s);
						}
						
					}
				});
		five.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int index;
				String s = et.getText().toString();
				s = s + "5";
				et.setText(s, TextView.BufferType.EDITABLE);
				if(curOper != null){
					index = s.indexOf(curOper);
					dataTwo = Float.parseFloat(s.substring(index + 1));
				}
				else{
					dataOne = Float.parseFloat(s);
				}
				
			}
		});
		six.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int index;
				String s = et.getText().toString();
				s = s + "6";
				et.setText(s, TextView.BufferType.EDITABLE);
				if(curOper != null){
					index = s.indexOf(curOper);
					dataTwo = Float.parseFloat(s.substring(index + 1));
				}
				else{
					dataOne = Float.parseFloat(s);
				}
				
			}
		});
		seven.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int index;
				String s = et.getText().toString();
				s = s + "7";
				et.setText(s, TextView.BufferType.EDITABLE);
				if(curOper != null){
					index = s.indexOf(curOper);
					dataTwo = Float.parseFloat(s.substring(index + 1));
				}
				else{
					dataOne = Float.parseFloat(s);
				}
				
			}
		});
		eight.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int index;
				String s = et.getText().toString();
				s = s + "8";
				et.setText(s, TextView.BufferType.EDITABLE);
				if(curOper != null){
					index = s.indexOf(curOper);
					dataTwo = Float.parseFloat(s.substring(index + 1));
				}
				else{
					dataOne = Float.parseFloat(s);
				}
				
			}
		});
		nine.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int index;
				String s = et.getText().toString();
				s = s + "9";
				et.setText(s, TextView.BufferType.EDITABLE);
				if(curOper != null){
					index = s.indexOf(curOper);
					dataTwo = Float.parseFloat(s.substring(index + 1));
				}
				else{
					dataOne = Float.parseFloat(s);
				}
				
			}
		});
		zero.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int index;
				String s = et.getText().toString();
				s = s + "0";
				et.setText(s, TextView.BufferType.EDITABLE);
				if(curOper != null){
					index = s.indexOf(curOper);
					dataTwo = Float.parseFloat(s.substring(index + 1));
				}
				else{
					dataOne = Float.parseFloat(s);
				}
				
			}
		});
		dec.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						int index;
						String s = et.getText().toString();
						s = s + ".";
						et.setText(s, TextView.BufferType.EDITABLE);
						if(curOper != null){
							index = s.indexOf(curOper);
							dataTwo = Float.parseFloat(s.substring(index + 1));
						}
						else{
							dataOne = Float.parseFloat(s);
						}
						
					}
				});
		ac.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				et.setText("", TextView.BufferType.EDITABLE);
				curOper = null;
				dataOne = 0;
				dataTwo = 0;
				
			}
		});
		c.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						int index;
						String s = et.getText().toString();
						if(s == null || s == ""){
							et.setText("", TextView.BufferType.EDITABLE);
						}
						else{
							int length = s.length();
							char compare = s.charAt(length-1); 
							if(compare == '+' || compare == '-' || compare == '*' || compare == '/'){
								curOper = null;
							}
							if(length != 1){
								StringBuilder sb = new StringBuilder(s);
								sb.deleteCharAt(length-1);
								s = sb.toString();
								if(curOper != null){
									index = s.indexOf(curOper);
									dataTwo = Float.parseFloat(s.substring(index + 1));
								}
								else{
									dataOne = Float.parseFloat(s);              //error is here bcoz when s becomes null it is not working properly
								}
							}
							else{
								s = "";
								dataOne = 0;
								dataTwo = 0;
							}
							et.setText(s, TextView.BufferType.EDITABLE);
						}
						
						
					}
				});
	
		
		
		eql.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						String s;
						if(curOper == null){
							curOper = "null"; }
						switch(curOper){
						case "+" :
							result = dataOne + dataTwo;
							s = Float.toString(result);
							et.setText(s, TextView.BufferType.EDITABLE);
							dataOne = 0;
							dataTwo = 0;
							curOper = null;
							break;
						case "-" :
							result = dataOne - dataTwo;
							s = Float.toString(result); // + " " + Float.toString(dataOne) + " " + Float.toString(dataTwo);
							et.setText(s, TextView.BufferType.EDITABLE);
							dataOne = 0;
							dataTwo = 0;
							curOper = null;
							break;
						case "*" :
							result = dataOne * dataTwo;
							s = Float.toString(result);
							et.setText(s, TextView.BufferType.EDITABLE);
							dataOne = 0;
							dataTwo = 0;
							curOper = null;
							break;
						case "/" :
							if(dataTwo != 0){
								result = dataOne / dataTwo;
								s = Float.toString(result);
								et.setText(s, TextView.BufferType.EDITABLE);
								dataOne = 0;
								dataTwo = 0;
								curOper = null;
							}
							else{
								et.setText("Cannot devide by ZERO", TextView.BufferType.EDITABLE);
							}
							break;
						case "null":
							break;
							
						}
						
						
					}
				});
		plus.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(curOper == null){
					curOper = "+";
					String s = et.getText().toString();
					et.setText(s + "+", TextView.BufferType.EDITABLE);
				}
				else{
					nextOper = "+";
					doEql(et,nextOper);
				}
			}
		});
		minus.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						if(curOper == null){
							curOper = "-";
							String s = et.getText().toString();
							et.setText(s + "-", TextView.BufferType.EDITABLE);
						}
						else{
							nextOper = "-";
							doEql(et,nextOper);
						}
					}
				});
			multi.setOnClickListener(new View.OnClickListener() {
						
						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							if(curOper == null){
								curOper = "*";
								String s = et.getText().toString();
								et.setText(s + "*", TextView.BufferType.EDITABLE);
							}
							else{
								nextOper = "*";
								doEql(et,nextOper);
							}
						}
					});
			div.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					if(curOper == null){
						curOper = "/";
						String s = et.getText().toString();
						et.setText(s + "/", TextView.BufferType.EDITABLE);
					}
					else{
						nextOper = "/";
						doEql(et , nextOper);
					}
				}
			});
		
	}
	
	

	private void doEql(EditText et , String nextOper) {
		// TODO Auto-generated method stub
		String s;
		if(curOper == null){
			curOper = "null"; }
		switch(curOper){
		case "+" :
			result = dataOne + dataTwo;
			s = Float.toString(result);
			et.setText(s + nextOper, TextView.BufferType.EDITABLE);
			dataOne = result;
			dataTwo = 0;
			curOper = nextOper;
			break;
		case "-":
			result = dataOne - dataTwo;
			s = Float.toString(result);
			et.setText(s + nextOper, TextView.BufferType.EDITABLE);
			dataOne = result;
			dataTwo = 0;
			curOper = nextOper;
			break;
		case "*":
			result = dataOne * dataTwo;
			s = Float.toString(result);
			et.setText(s + nextOper, TextView.BufferType.EDITABLE);
			dataOne = result;
			dataTwo = 0;
			curOper = nextOper;
			break;
		case "/":
			if(dataTwo != 0){
				result = dataOne / dataTwo;
				s = Float.toString(result);
				et.setText(s + nextOper, TextView.BufferType.EDITABLE);
				dataOne = result;
				dataTwo = 0;
				curOper = nextOper;
			}
			else{
				et.setText("Cannot devide by ZERO", TextView.BufferType.EDITABLE);
			}
			break;
		case "null":
			break;
			
		}
		
	}



	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
