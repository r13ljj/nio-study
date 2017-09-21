package com.jonex.nio.study.test;

/**
 * @Author jonex [r13ljj@gmail.com]
 * @Date 2017/9/21 17:51
 */
public class InterestOpsTest {

    public static void main(String[] args) {
        int OP_READ = 1 << 0;
        int OP_WRITE = 1 << 1;
        int OP_CONNECT = 1 << 2;
        int OP_ACCEPT = 1 << 3;
        System.out.println(OP_READ);
        System.out.println(OP_WRITE);
        System.out.println(OP_CONNECT);
        System.out.println(OP_ACCEPT);
    }
}
