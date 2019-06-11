package com.niyagrace.edalearn.response;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseMateri{

	@SerializedName("error")
	private boolean error;

	@SerializedName("message")
	private String message;

	@SerializedName("semuamateri")
	private List<SemuamateriItem> semuamateri;

	public void setError(boolean error){
		this.error = error;
	}

	public boolean isError(){
		return error;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setSemuamateri(List<SemuamateriItem> semuamateri){
		this.semuamateri = semuamateri;
	}

	public List<SemuamateriItem> getSemuamateri(){
		return semuamateri;
	}

	@Override
 	public String toString(){
		return 
			"ResponseMateri{" + 
			"error = '" + error + '\'' + 
			",message = '" + message + '\'' + 
			",semuamateri = '" + semuamateri + '\'' + 
			"}";
		}
}