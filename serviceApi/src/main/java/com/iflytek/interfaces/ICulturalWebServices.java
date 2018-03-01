package com.iflytek.interfaces;

import com.iflytek.entity.AccessParameters;
import com.iflytek.entity.ResponseMessage;

/***
 * webService接口类
 * @author Administrator
 */

public interface ICulturalWebServices {

    /***
     * 登录验证服务
     *
     * @param accessParameters
     *           访问参数，密码Base64加密，放入mdmData
     * @return 返回验证信息
     */
    public ResponseMessage loginAuthCheck(AccessParameters accessParameters);

    /***
     * 4.2.2编码申请服务：提供核心主数据编码申请服务，以实现各业务系统主数据增加时统一的编码信息，
     * 本服务为独立编码申请接口，该接口在主数据创建服务时同时调用
     * @param accessParameters 主数据参数(企业编码，用户账号，业务号为必填项)
     * @return 返回相应主数据的唯一码
     */
    public ResponseMessage getMDMId(AccessParameters accessParameters);

    /***
     * 4.2.3主数据增加服务 :提供核心主数据增加服务，以实现各业务系统主数据增加新的数据
     * @param accessParameters 主数据参数
     * @return 返回添加结果，在returnObject的mdmData中获取添加的整体信息
     */
    public ResponseMessage increaseMDMData(AccessParameters accessParameters);

    /***
     * 4.2.4主数据变更服务:提供核心主数据变更服务，以实现各业务系统主数据修改的需求（需要判断各个业务系统能够修改哪些字段）
     * @param accessParameters 主数据参数
     * @return 返回添加结果，在returnObject的mdmData中获取整体信息
     */
    public ResponseMessage modifyMDMData(AccessParameters accessParameters);

    /***
     * 4.2.5主数据验证服务:提供核心主数据验证服务，以实现各业务系统对主数据的合法性和有效性的验证服务
     * @param accessParameters 主数据参数
     * @return 返回添加结果，在returnObject的mdmData中获取整体信息
     */
    public ResponseMessage checkMDMData(AccessParameters accessParameters);

    /***
     * 4.2.6主数据合并服务 功能待定
     * @param accessParameters 主数据参数
     * @return 返回添加结果，在returnObject的mdmDataList中获取整体信息
     */
    public ResponseMessage mergeMDMData(AccessParameters accessParameters);

    /***
     * 4.2.7主数据分发服务
     * @param accessParameters 主数据参数
     * @return 返回添加结果，在returnObject的mdmDataList中获取整体信息
     */
    public ResponseMessage distributeMDMData(AccessParameters accessParameters);

    /***
     * 4.2.8主数据封存服务
     * @param accessParameters 主数据参数
     * @return 返回添加结果，在returnObject的mdmDataList中获取整体信息
     */
    public ResponseMessage lockedMDMData(AccessParameters accessParameters);

}
