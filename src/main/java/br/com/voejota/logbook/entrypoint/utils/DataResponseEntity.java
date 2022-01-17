package br.com.voejota.logbook.entrypoint.utils;

public class DataResponseEntity<T> {

	private T data;

	public DataResponseEntity(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}
