package com.filter;
import com.alibaba.dubbo.rpc.*;

import javax.servlet.http.HttpServletRequest;

public class AuthorityFilter implements Filter {

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        HttpServletRequest req = (HttpServletRequest) RpcContext.getContext().getRequest();
        System.out.println("fdsfdsfds");// 校验token
        return invoker.invoke(invocation);
    }
}
