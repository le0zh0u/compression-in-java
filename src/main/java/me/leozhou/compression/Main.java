package me.leozhou.compression;

import java.util.Random;

/**
 * Main class
 *
 * @author zhouchunjie
 * @date 2021/5/19
 */
public class Main {

    public static final String allChar = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String generateString(int length) {
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(allChar.charAt(random.nextInt(allChar.length())));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        try {
            String data = "{\"businessOps\":0,\"crmOrderList\":[{\"appId\":50005,\"appName\":\"有赞连锁-网店L\",\"buyType\":1,\"comboId\":311619773688550,\"createdAt\":\"2021-04-30 17:08:08\",\"crmApprovalNo\":\"TD3258\",\"duration\":1,\"extInfo\":\"\",\"id\":1619773691914774483,\"isValid\":1,\"itemId\":8431,\"itemName\":\"有赞连锁-网店L 1年\",\"itemPrice\":200000,\"itemRule\":\"\",\"kdtId\":93894201,\"kdtName\":\"乔府大院\",\"operatorId\":13572,\"orderId\":311619773688550,\"payOrderId\":6638928889965182976,\"payTime\":\"2021-04-30 00:00:00\",\"preferentialDetail\":\"\",\"price\":200000,\"quantity\":1,\"realPrice\":200000,\"rightsDetail\":\"\",\"status\":0},{\"appId\":50005,\"appName\":\"有赞连锁-网店L\",\"buyType\":1,\"comboId\":311619773689551,\"createdAt\":\"2021-04-30 17:08:09\",\"crmApprovalNo\":\"TD3258\",\"duration\":1,\"extInfo\":\"\",\"id\":1619773691923463763,\"isValid\":1,\"itemId\":8431,\"itemName\":\"有赞连锁-网店L 1年\",\"itemPrice\":200000,\"itemRule\":\"\",\"kdtId\":93894201,\"kdtName\":\"乔府大院\",\"operatorId\":13572,\"orderId\":311619773689551,\"payOrderId\":6638928889965182976,\"payTime\":\"2021-04-30 00:00:00\",\"preferentialDetail\":\"\",\"price\":200000,\"quantity\":1,\"realPrice\":200000,\"rightsDetail\":\"\",\"status\":0},{\"appId\":50005,\"appName\":\"有赞连锁-网店L\",\"buyType\":1,\"comboId\":311619773689552,\"createdAt\":\"2021-04-30 17:08:09\",\"crmApprovalNo\":\"TD3258\",\"duration\":1,\"extInfo\":\"\",\"id\":1619773691928762957,\"isValid\":1,\"itemId\":8431,\"itemName\":\"有赞连锁-网店L 1年\",\"itemPrice\":200000,\"itemRule\":\"\",\"kdtId\":93894201,\"kdtName\":\"乔府大院\",\"operatorId\":13572,\"orderId\":311619773689552,\"payOrderId\":6638928889965182976,\"payTime\":\"2021-04-30 00:00:00\",\"preferentialDetail\":\"\",\"price\":200000,\"quantity\":1,\"realPrice\":200000,\"rightsDetail\":\"\",\"status\":0},{\"appId\":50005,\"appName\":\"有赞连锁-网店L\",\"buyType\":1,\"comboId\":311619773689553,\"createdAt\":\"2021-04-30 17:08:09\",\"crmApprovalNo\":\"TD3258\",\"duration\":1,\"extInfo\":\"\",\"id\":1619773691933593759,\"isValid\":1,\"itemId\":8431,\"itemName\":\"有赞连锁-网店L 1年\",\"itemPrice\":200000,\"itemRule\":\"\",\"kdtId\":93894201,\"kdtName\":\"乔府大院\",\"operatorId\":13572,\"orderId\":311619773689553,\"payOrderId\":6638928889965182976,\"payTime\":\"2021-04-30 00:00:00\",\"preferentialDetail\":\"\",\"price\":200000,\"quantity\":1,\"realPrice\":200000,\"rightsDetail\":\"\",\"status\":0},{\"appId\":50005,\"appName\":\"有赞连锁-网店L\",\"buyType\":1,\"comboId\":311619773689554,\"createdAt\":\"2021-04-30 17:08:09\",\"crmApprovalNo\":\"TD3258\",\"duration\":1,\"extInfo\":\"\",\"id\":1619773691938614402,\"isValid\":1,\"itemId\":8431,\"itemName\":\"有赞连锁-网店L 1年\",\"itemPrice\":200000,\"itemRule\":\"\",\"kdtId\":93894201,\"kdtName\":\"乔府大院\",\"operatorId\":13572,\"orderId\":311619773689554,\"payOrderId\":6638928889965182976,\"payTime\":\"2021-04-30 00:00:00\",\"preferentialDetail\":\"\",\"price\":200000,\"quantity\":1,\"realPrice\":200000,\"rightsDetail\":\"\",\"status\":0},{\"appId\":50005,\"appName\":\"有赞连锁-网店L\",\"buyType\":1,\"comboId\":311619773689555,\"createdAt\":\"2021-04-30 17:08:09\",\"crmApprovalNo\":\"TD3258\",\"duration\":1,\"extInfo\":\"\",\"id\":1619773691943901382,\"isValid\":1,\"itemId\":8431,\"itemName\":\"有赞连锁-网店L 1年\",\"itemPrice\":200000,\"itemRule\":\"\",\"kdtId\":93894201,\"kdtName\":\"乔府大院\",\"operatorId\":13572,\"orderId\":311619773689555,\"payOrderId\":6638928889965182976,\"payTime\":\"2021-04-30 00:00:00\",\"preferentialDetail\":\"\",\"price\":200000,\"quantity\":1,\"realPrice\":200000,\"rightsDetail\":\"\",\"status\":0},{\"appId\":50005,\"appName\":\"有赞连锁-网店L\",\"buyType\":1,\"comboId\":311619773689556,\"createdAt\":\"2021-04-30 17:08:09\",\"crmApprovalNo\":\"TD3258\",\"duration\":1,\"extInfo\":\"\",\"id\":1619773691948835128,\"isValid\":1,\"itemId\":8431,\"itemName\":\"有赞连锁-网店L 1年\",\"itemPrice\":200000,\"itemRule\":\"\",\"kdtId\":93894201,\"kdtName\":\"乔府大院\",\"operatorId\":13572,\"orderId\":311619773689556,\"payOrderId\":6638928889965182976,\"payTime\":\"2021-04-30 00:00:00\",\"preferentialDetail\":\"\",\"price\":200000,\"quantity\":1,\"realPrice\":200000,\"rightsDetail\":\"\",\"status\":0},{\"appId\":50005,\"appName\":\"有赞连锁-网店L\",\"buyType\":1,\"comboId\":311619773689557,\"createdAt\":\"2021-04-30 17:08:09\",\"crmApprovalNo\":\"TD3258\",\"duration\":1,\"extInfo\":\"\",\"id\":1619773691954160698,\"isValid\":1,\"itemId\":8431,\"itemName\":\"有赞连锁-网店L 1年\",\"itemPrice\":200000,\"itemRule\":\"\",\"kdtId\":93894201,\"kdtName\":\"乔府大院\",\"operatorId\":13572,\"orderId\":311619773689557,\"payOrderId\":6638928889965182976,\"payTime\":\"2021-04-30 00:00:00\",\"preferentialDetail\":\"\",\"price\":200000,\"quantity\":1,\"realPri";
//            String data = generateString(1024 * 10);
            System.out.println("压缩前数据内容：" + data);
            System.out.println("压缩前数据大小：" + data.getBytes().length);

            String compressedStr = CompressUtils.GZIP.compress(data);
            System.out.println("压缩后数据大小:" + compressedStr.getBytes().length);
            System.out.println("压缩后数据内容:" + compressedStr);

            String uncompressStr = CompressUtils.GZIP.uncompress(compressedStr);
            System.out.println("解压后数据大小：" + uncompressStr.getBytes().length);
            System.out.println("解压后数据内容：" + uncompressStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
