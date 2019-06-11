package com.niyagrace.edalearn.response;

import com.google.gson.annotations.SerializedName;

public class SemuasoalItem{

	@SerializedName("noSoal")
	private String noSoal;

	@SerializedName("jawab1")
	private String jawab1;

	@SerializedName("jawab2")
	private String jawab2;

	@SerializedName("soal")
	private String soal;

	@SerializedName("jawab3")
	private String jawab3;

	@SerializedName("jawab4")
	private String jawab4;

	@SerializedName("id")
	private String id;

	@SerializedName("judul")
	private String judul;

	public void setNoSoal(String noSoal){
		this.noSoal = noSoal;
	}

	public String getNoSoal(){
		return noSoal;
	}

	public void setJawab1(String jawab1){
		this.jawab1 = jawab1;
	}

	public String getJawab1(){
		return jawab1;
	}

	public void setJawab2(String jawab2){
		this.jawab2 = jawab2;
	}

	public String getJawab2(){
		return jawab2;
	}

	public void setSoal(String soal){
		this.soal = soal;
	}

	public String getSoal(){
		return soal;
	}

	public void setJawab3(String jawab3){
		this.jawab3 = jawab3;
	}

	public String getJawab3(){
		return jawab3;
	}

	public void setJawab4(String jawab4){
		this.jawab4 = jawab4;
	}

	public String getJawab4(){
		return jawab4;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setJudul(String judul){
		this.judul = judul;
	}

	public String getJudul(){
		return judul;
	}

	@Override
 	public String toString(){
		return 
			"SemuasoalItem{" + 
			"noSoal = '" + noSoal + '\'' + 
			",jawab1 = '" + jawab1 + '\'' + 
			",jawab2 = '" + jawab2 + '\'' + 
			",soal = '" + soal + '\'' + 
			",jawab3 = '" + jawab3 + '\'' + 
			",jawab4 = '" + jawab4 + '\'' + 
			",id = '" + id + '\'' + 
			",judul = '" + judul + '\'' + 
			"}";
		}
}