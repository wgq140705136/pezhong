package cn.zjicm.wgq.pe.common.utils;

public interface HttpCallbackListener {

	void onFinish(String response);

	void onError(Exception e);

}
