package io.github.pnoker.common.utils;

public class HexUtil {
  /**
   * 把字符串按指定编码转成字节数组
   * @param text
   * @param charset UTF-8/GBK...
   * @return
   * @throws Exception
   */
  public static String toHex(String text, String charset) throws Exception {
    byte[] bytes = text.getBytes(charset);
    StringBuilder sb = new StringBuilder();
    for (byte b : bytes) {
      sb.append(String.format("%02X", b & 0xFF));
    }
    return sb.toString();
  }

  /**
   * 反向：十六进制转回字符串
   * @param hex
   * @param charset UTF-8/GBK...
   * @return
   * @throws Exception
   */
  public static String fromHex(String hex, String charset) throws Exception {
    int len = hex.length();
    byte[] bytes = new byte[len / 2];
    for (int i = 0; i < len; i += 2) {
      bytes[i / 2] = (byte) Integer.parseInt(hex.substring(i, i + 2), 16);
    }
    return new String(bytes, charset);
  }

/*  public static void main(String[] args){

    // 使用示例
      try {
          System.out.println(toHex("好", "UTF-8"));  // E4BDA0E5A5BD
          //System.out.println(toHex("你好", "GBK"));    // C4E3BAC3

          // 使用示例
          System.out.println(fromHex("E4BDA0E5A5BD", "UTF-8"));  // 你好
      } catch (Exception e) {
          throw new RuntimeException(e);
      }




  }*/


}
