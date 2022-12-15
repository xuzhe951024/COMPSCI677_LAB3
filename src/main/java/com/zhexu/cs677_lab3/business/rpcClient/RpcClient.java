package com.zhexu.cs677_lab3.business.rpcClient;

/**
 * @project: CS677_Lab1
 * @description:
 * @author: zhexu
 * @create: 10/27/22
 **/


import com.zhexu.cs677_lab3.api.bean.basic.Address;
import com.zhexu.cs677_lab3.utils.SerializeUtils;
import com.zhexu.cs677_lab3.business.rpcClient.proxy.RPCInvocationHandler;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * RPC client, use socket to communicate with server
 *
 */
public class RpcClient {

    public static Object send(byte[] bs, Address address) {
        Socket socket = null;
        OutputStream outputStream = null;
        InputStream in = null;

        try {
            socket = new Socket(address.getDomain(), address.getPort());

            outputStream = socket.getOutputStream();

            outputStream.write(bs);

            in = socket.getInputStream();
            byte[] buf = new byte[1024];
            in.read(buf);

            Object formatData = SerializeUtils.deserialize(buf);

            return formatData;
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        throw new RuntimeException("Fail to send data!");
    }

    /**
     * Test
     *
     * @param args
     */
    public static void main(String[] args) {
        Address address = new Address("127.0.0.1", 9999);
        RPCInvocationHandler handler = new RPCInvocationHandler(address);
//        System.out.println(HelloService.class);
//        HelloService helloService = ProxyFactory.getInstance(HelloService.class, handler);
//        System.out.println("say: " + helloService.sayHello("zhangsan"));
//        System.out.println("Person: " + helloService.getPerson("zhangsan"));
//        System.out.println("Adress: " + helloService.getPerson("zhangsan").getAddress().toString());

    }

}
