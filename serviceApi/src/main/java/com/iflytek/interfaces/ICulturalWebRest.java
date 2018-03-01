package com.iflytek.interfaces;

import com.iflytek.entity.AccessParameters;
import com.iflytek.entity.ResponseMessage;

/**
 * dubbo Rest服务接口类
 *
 * @author Administrator
 */
public interface ICulturalWebRest {
    /***
     * 登录验证服务
     *
     * @param params
     *            用户密码（base64加密）
     * @return 返回验证信息
     */
    public ResponseMessage loginAuthCheck(AccessParameters params);

    /***
     * 4.2.2编码申请服务：提供核心主数据编码申请服务，以实现各业务系统主数据增加时统一的编码信息，
     * 本服务为独立编码申请接口，该接口在主数据创建服务时同时调用
     *
     * @param params  参数对象
     * @return 返回相应主数据的唯一码
     */
    public ResponseMessage getMDMId(AccessParameters params);


    /***
     * 4.2.3主数据增加服务 :提供核心主数据增加服务，以实现各业务系统主数据增加新的数据，本服务接口同步调用编码申请接口
     *
     * @param params
     *            访问参数信息对象
     * @return
     */
    public ResponseMessage increaseMDMData(AccessParameters params);

    /***
     * 4.2.4主数据变更服务:提供核心主数据变更服务，以实现各业务系统主数据修改的需求（需要判断各个业务系统能够修改哪些字段）
     *
     * @param params
     *            访问参数信息
     * @return 返回主数据信息XML格式数据或JSON格式，看具体需求
     */
    public ResponseMessage modifyMDMInfo(AccessParameters params);

    /***
     * 4.2.5主数据验证服务:提供核心主数据验证服务，以实现各业务系统对主数据的合法性和有效性的验证服务
     *
     * @param params
     *            访问参数信息
     * @return 返回主数据信息XML格式数据或JSON格式，看具体需求
     */
    public ResponseMessage checkMDMInfo(AccessParameters params);

    /***
     * 4.2.6主数据合并服务 功能待定
     * @param params
     * @return
     */
    public ResponseMessage mergeMDMInfo(AccessParameters params);

    /***
     * 4.2.7主数据分发服务
     * @param params
     *            主数据唯一主键
     * @return
     */
    public ResponseMessage distributeMDMInfo(AccessParameters params);

    /***
     * 4.2.8主数据封存服务
     * @param params
     *            主数据唯一主键
     * @return
     */
    public ResponseMessage lockMDMInfo(AccessParameters params);


}
