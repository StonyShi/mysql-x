package com.stony.mysql;

import com.stony.mysql.io.LittleByteBuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * <p>mysql-x
 * <p>com.stony.mysql.test
 *
 * @author stony
 * @version 下午3:04
 * @since 2018/10/11
 */
public class ByteTest {


    public static byte[] intToBytes2(int value) {
        byte[] src = new byte[4];
        src[0] = (byte) ((value >> 24) & 0xFF);
        src[1] = (byte) ((value >> 16) & 0xFF);
        src[2] = (byte) ((value >> 8) & 0xFF);
        src[3] = (byte) (value & 0xFF);
        return src;
    }

    public static byte[] intToBytes(int value) {
        byte[] src = new byte[4];
        src[3] = (byte) ((value >> 24) & 0xFF);
        src[2] = (byte) ((value >> 16) & 0xFF);
        src[1] = (byte) ((value >> 8) & 0xFF);
        src[0] = (byte) (value & 0xFF);
        return src;
    }

    public static byte[] Int2ByteArray(int n) {
        byte[] b = new byte[4];
        b[0] = (byte) (n & 0xff);
        b[1] = (byte) (n >> 8 & 0xff);
        b[2] = (byte) (n >> 16 & 0xff);
        b[3] = (byte) (n >> 24 & 0xff);
        return b;
    }

    public static byte[] Short2ByteArray(short n) {
        byte[] b = new byte[2];
        b[1] = (byte) (n & 0xff);
        b[0] = (byte) (n >> 8 & 0xff);
        return b;
    }

    public static int ByteArray2Int(byte[] b) {
        int iOutcome = 0;
        byte bLoop;
        for (int i = 0; i < 4; i++) {
            bLoop = b[i];
            iOutcome += (bLoop & 0xff) << (8 * i);
        }
        return iOutcome;
    }

    public static short ByteArray2Short(byte[] b) {
        short iOutcome = 0;
        byte bLoop;
        for (int i = 0; i < 2; i++) {
            bLoop = b[i];
            iOutcome += (bLoop & 0xff) << (8 * i);
        }
        return iOutcome;
    }

    public static int ByteArray2Int2(byte[] b) {
        int iOutcome = 0;
        int len = b.length;
        for (int i = 0; i < len; i++) {
            iOutcome += (b[i] & 0xff) << (8 * i);
        }
        return iOutcome;
    }
    public static long ByteArray2Long2(byte[] b) {
        long iOutcome = 0;
        int len = b.length;
        for (int i = 0; i < len; i++) {
            iOutcome += (b[i] & 0xff) << (8 * i);
        }
        return iOutcome;
    }

    public static int byteArrayToInt(byte[] b) {
        return  b[3] & 0xFF |
                (b[2] & 0xFF) << 8 |
                (b[1] & 0xFF) << 16 |
                (b[0] & 0xFF) << 24;
    }
    public static int byteArrayToInt2(byte[] b) {
        return  b[0] & 0xFF |
                (b[1] & 0xFF) << 8 |
                (b[2] & 0xFF) << 16 |
                (b[3] & 0xFF) << 24;
    }

    public static void main(String[] args) {

//        System.out.println(CapabilityFlags.CLIENT_PLUGIN_AUTH);
//        System.out.println("_-sdfsdf");
//
//        System.out.println(Arrays.toString(intToBytes(128)));
//        System.out.println();
//
        byte[] temp = {63, -96, -1, -9};
//        System.out.println(ByteArray2Int(temp) & CapabilityFlags.CLIENT_PLUGIN_AUTH);
//        System.out.println(byteArrayToInt(temp) & CapabilityFlags.CLIENT_PLUGIN_AUTH);
//        System.out.println(byteArrayToInt2(temp) & CapabilityFlags.CLIENT_PLUGIN_AUTH);
//        System.out.println((byteArrayToInt2(temp) & CapabilityFlags.CLIENT_SECURE_CONNECTION) == CapabilityFlags.CLIENT_SECURE_CONNECTION);
//
//        System.out.println("----------");
//
//        byte[] temp2 = {-1, -9, 63, -96};
//        System.out.println(ByteArray2Int(temp2) & CapabilityFlags.CLIENT_PLUGIN_AUTH);
//        System.out.println(byteArrayToInt(temp2) & CapabilityFlags.CLIENT_PLUGIN_AUTH);
//        System.out.println(byteArrayToInt2(temp2) & CapabilityFlags.CLIENT_PLUGIN_AUTH);
//
//        System.out.println(">>>>>>>");
//        for (int i = 0; i < 8; i++) {
//            System.out.println((i << 3));
//        }
//
//        byte[] req = {21,4,65,99,99,101,115,115,32,100,101,110,105,101,100,32,102,111,114,32,117,115,101,114,32,39,39,64,39,49,48,46,49,46,50,49,46,49,50,55,39,32,40,117,115,105,110,103,32,112,97,115,115,119,111,114,100,58,32,78,79,41};
//        System.out.println(new String(req));
//
//        byte[] req2 = {115, 100, 102, 115, 100, 102};
//        System.out.println(new String(req2));
//
//        byte[] req3 = {4, -126, 0, 0};
//        System.out.println(byteArrayToInt2(req3));


//        System.out.println(0xFE);
//        System.out.println(Arrays.toString(intToBytes2(254)));
//        System.out.println(Arrays.toString(intToBytes(254)));
//        System.out.println(0xFF);
//        System.out.println(0x00);
//        System.out.println(0xFB);
//
//        System.out.println(0x12);
//        System.out.println(0x13);
//
//        System.out.println(Arrays.toString("app".getBytes()));
//
//        byte[] bb = {100, 101, 102};
//        System.out.println(new String(bb));

//        byte[] bc = {34, 0};
//        System.out.println(new String(bc));
//        System.out.println(ByteArray2Int2(bc));
//
//        byte[] cc = {51, 0, 0};
//        System.out.println(ByteArray2Int2(cc));
//        System.out.println(new String(cc));
//
//        System.out.println(" >> " + Arrays.toString("vvv".getBytes()));
//
//
//        byte[] vv = {1, 54, 3, 118, 118, 118, 1, 49, 1, 49, -5, 19, 50, 48, 49, 56, 45, 49, 48, 45, 49, 50, 32, 49, 54, 58, 53, 56, 58, 52, 57, 19, 50, 48, 49, 56, 45, 49, 48, 45, 49, 50, 32, 49, 54, 58, 53, 56, 58, 52, 57,
//        };
//        System.out.println(vv.length);
//
//        byte[] vv2 = {1, 53, 3, 118, 118, 54, 1, 50, 1, 49, -5, 19, 50, 48, 49, 56, 45, 49, 48, 45, 49, 50, 32, 49, 54, 58, 52, 49, 58, 48, 53, 19, 50, 48, 49, 56, 45, 49, 48, 45, 49, 50, 32, 49, 54, 58, 52, 49, 58, 48, 53};
//        System.out.println(vv2.length);


//        System.out.println(" BEGIN".replaceAll("\u0000", ""));
//        System.out.println(" BEGIN".trim());

//        byte[] xx = {73, 78, 74, 125, -91, -85};
//        System.out.println(new String(xx));
//        System.out.println(ByteArray2Int2(xx));
//
//        byte[] xx2 = {44, 73, 122, -62, 90, 18, 0, 0};
//        System.out.println(ByteArray2Long2(xx2));
//        System.out.println(new String(xx2));


//        System.out.println(Arrays.toString(Int2ByteArray(131)));
//        System.out.println(Arrays.toString(Int2ByteArray(132)));


        byte[] LONGLONG;
        LONGLONG = new byte[]{-61, -49, 34, -96, 102, 1, 0, 0};
        System.out.println(ByteBuffer.wrap(LONGLONG).order(ByteOrder.BIG_ENDIAN).getLong());
        System.out.println(ByteBuffer.wrap(LONGLONG).order(ByteOrder.LITTLE_ENDIAN).getLong());
        System.out.println(LittleByteBuffer.warp(LONGLONG).readLong());
        System.out.println(LittleByteBuffer.warp(LONGLONG).readLong(8));
        System.out.println(LittleByteBuffer.warp(LONGLONG).readLong(7));
        System.out.println(LittleByteBuffer.warp(LONGLONG).readLong(6));

        LONGLONG = new byte[]{82, -100, 30, -96, 102, 1, 0, 0};
        System.out.println(ByteBuffer.wrap(LONGLONG).order(ByteOrder.BIG_ENDIAN).getLong());
        System.out.println(ByteBuffer.wrap(LONGLONG).order(ByteOrder.LITTLE_ENDIAN).getLong());

        System.out.println(LittleByteBuffer.warp(LONGLONG).readLong());
        System.out.println(LittleByteBuffer.warp(LONGLONG).readLong(8));
        System.out.println(LittleByteBuffer.warp(LONGLONG).readLong(7));
        System.out.println(LittleByteBuffer.warp(LONGLONG).readLong(6));


        System.out.println("-----------");
//        LONGLONG = new byte[]{35, -100, 30, -96, 102, 1, 0, 0};
//        System.out.println(LittleByteBuffer.warp(LONGLONG).readLong(8));
//        LONGLONG = new byte[]{79, -100, 30, -96, 102, 1, 0, 0};
//        System.out.println(LittleByteBuffer.warp(LONGLONG).readLong(8));
//        LONGLONG = new byte[]{-61, -49, 34, -96, 102, 1, 0, 0};
//        System.out.println(LittleByteBuffer.warp(LONGLONG).readLong(8));
//        LONGLONG = new byte[]{87, -100, 30, -96, 102, 1, 0, 0};
//        System.out.println(LittleByteBuffer.warp(LONGLONG).readLong(8));
//        LONGLONG = new byte[]{35, -100, 30, -96, 102, 1, 0, 0};
//        System.out.println(LittleByteBuffer.warp(LONGLONG).readLong(8));
//        LONGLONG = new byte[]{85, -100, 30, -96, 102, 1, 0, 0};
//        System.out.println(LittleByteBuffer.warp(LONGLONG).readLong(8));


    }


}
