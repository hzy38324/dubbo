package org.apache.dubbo.demo.consumer;

import org.apache.dubbo.rpc.Filter;
import org.apache.dubbo.rpc.Invocation;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.Result;
import org.apache.dubbo.rpc.RpcException;

/**
 * @author: nitzschhong
 * @create: 2022-09-16 11:03
 */
public class CustomFilter implements Filter {
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        System.out.println("CustomFilter");
        return invoker.invoke(invocation);
    }
}
