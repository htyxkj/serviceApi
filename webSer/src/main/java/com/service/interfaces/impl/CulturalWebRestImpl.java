package com.service.interfaces.impl;

import javax.ws.rs.*;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.iflytek.entity.AccessParameters;
import com.iflytek.entity.MDMData;
import com.iflytek.entity.ResponseMessage;
import com.iflytek.interfaces.ICulturalWebRest;

@Path("/services/cultural")
@Consumes({ContentType.APPLICATION_JSON_UTF_8,ContentType.TEXT_XML_UTF_8})
@Produces({ContentType.APPLICATION_JSON_UTF_8,ContentType.TEXT_XML_UTF_8})/**指定返回值类型是xml格式格式*///"application/json;charset=UTF-8",
public class CulturalWebRestImpl implements ICulturalWebRest {
	@GET
    @Path("addMDMData")
	@Override
	public ResponseMessage increaseMDMData(AccessParameters accessParameters) {
		// TODO Auto-generated method stub
		return null;
	}
	@GET
    @Path("checkMDMInfo")
	@Override
	public ResponseMessage checkMDMInfo(AccessParameters accessParameters) {
		// TODO Auto-generated method stub
		return null;
	}
	@GET
    @Path("distributeMDMInfo")
	@Override
	public ResponseMessage distributeMDMInfo(AccessParameters accessParameters) {
		return null;
	}
	@POST
    @Path("getMDMId")
//	@Produces({"text/xml;charset=UTF-8"})/**指定返回值类型是xml格式格式*/
    @Override
	public ResponseMessage getMDMId(AccessParameters accessParameters) {
		System.out.println(accessParameters.toString());
		ResponseMessage rr = new ResponseMessage();
		rr.makeSuccess();
		MDMData dd = new MDMData();
		dd.addParams("sid","9999");
		dd.addParams("name","张三");
		rr.setMdmData(dd);
    	return rr;
	}
	@POST
	@Path("nnt")
	@Produces({"text/xml;charset=UTF-8"})/**指定返回值类型是xml格式格式*/
	public AccessParameters nnt(AccessParameters accessParameters) {
		AccessParameters aa = new AccessParameters("11111", "23111121", "1321");
		MDMData mpMap = new MDMData();
		mpMap.addParams("id", "999");
		mpMap.addParams("name", "name999");
		aa.setParams(mpMap);
		return aa;
	}

	@GET
    @Path("lockMDMInfo")
	@Override
	public ResponseMessage lockMDMInfo(AccessParameters accessParameters) {
		ResponseMessage returnObject = new ResponseMessage();
		returnObject.makeSuccess();
		return returnObject;
	}
	@GET
    @Path("loginAuthCheck")
	@Override
	public ResponseMessage loginAuthCheck(AccessParameters accessParameters) {
		// TODO Auto-generated method stub
		return null;
	}
	@GET
    @Path("mergeMDMInfo")
	@Override
	public ResponseMessage mergeMDMInfo(AccessParameters accessParameters) {
		// TODO Auto-generated method stub
		return null;
	}
	@GET
    @Path("modifyMDMInfo")
	@Override
	public ResponseMessage modifyMDMInfo(AccessParameters accessParameters) {
		// TODO Auto-generated method stub
		return null;
	}

}
