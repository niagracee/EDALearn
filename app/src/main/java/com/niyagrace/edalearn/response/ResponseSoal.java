package com.niyagrace.edalearn.response;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseSoal{

	@SerializedName("semuasoal")
	private List<SemuasoalItem> semuasoal;

	@SerializedName("error")
	private boolean error;

	@SerializedName("message")
	private String message;

	public void setSemuasoal(List<SemuasoalItem> semuasoal){
		this.semuasoal = semuasoal;
	}

	public List<SemuasoalItem> getSemuasoal(){
		return semuasoal;
	}

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

	@Override
 	public String toString(){
		return 
			"ResponseSoal{" + 
			"semuasoal = '" + semuasoal + '\'' + 
			",error = '" + error + '\'' + 
			",message = '" + message + '\'' + 
			"}";
		}
}