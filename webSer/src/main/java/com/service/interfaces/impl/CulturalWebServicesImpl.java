package com.service.interfaces.impl;

import javax.jws.WebService;

import com.iflytek.entity.AccessParameters;
import com.iflytek.entity.ResponseMessage;
import com.iflytek.interfaces.ICulturalWebServices;

@WebService
public class CulturalWebServicesImpl implements ICulturalWebServices {

	@Override
	public ResponseMessage checkMDMData(AccessParameters arg0) {
		ResponseMessage returnObject = new ResponseMessage();
		returnObject.makeSuccess();
		return returnObject;
	}

	@Override
	public ResponseMessage distributeMDMData(AccessParameters arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	/***
	 * 登录验证服务
	 *
	 * @param accessParameters
	 *           访问参数，密码Base64加密，放入mdmData
	 * @return 返回验证信息
	 */
	@Override
	public ResponseMessage loginAuthCheck(AccessParameters accessParameters) {
		return null;
	}

	@Override
	public ResponseMessage getMDMId(AccessParameters arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseMessage increaseMDMData(AccessParameters arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseMessage lockedMDMData(AccessParameters arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ResponseMessage mergeMDMData(AccessParameters arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseMessage modifyMDMData(AccessParameters arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
