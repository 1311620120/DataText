package com.example.day0322.model;

import java.util.List;

/**
 * @Auther: 白俊岭
 * @Date: 2019/3/22 14:26:00
 * @Description:
 */
public class DataBean {
    /**
     * result : [{"commodityId":124,"commodityName":"台湾AC5高清4K摄像机数码DV12倍光学变焦专业家用旅游","masterPic":"http://172.17.8.100/images/small/commodity/sjsm/zxj/4/1.jpg","price":1998,"saleNum":0},{"commodityId":189,"commodityName":"高尔夫GOLF锦纶双肩包男士个性旅行背包大容量电脑背包D8BV33913J","masterPic":"http://172.17.8.100/images/small/commodity/xbsd/sjb/6/1.jpg","price":179,"saleNum":0},{"commodityId":115,"commodityName":"Skyworth/创维 55H5 55英寸全面屏防蓝光护眼4K超高清智能液晶电视","masterPic":"http://172.17.8.100/images/small/commodity/sjsm/yyyl/2/1.jpg","price":2988,"saleNum":0},{"commodityId":144,"commodityName":"冬季新款高帮帆布鞋加绒保暖平底百搭时尚气质绑带字母经典款帆布鞋男士系带休闲靴","masterPic":"http://172.17.8.100/images/small/commodity/nx/nfbx/3/1.jpg","price":148,"saleNum":0},{"commodityId":82,"commodityName":"三彩冬季新款 高腰修身包臀裙假两件开叉半身裙","masterPic":"http://172.17.8.100/images/small/commodity/nz/qz/4/1.jpg","price":68,"saleNum":0},{"commodityId":128,"commodityName":"儿童人工智能机器人玩具语音对话早教第五代学习机3-6-12岁高科技遥控教育语音聊天对话会跳舞的智能机器人","masterPic":"http://172.17.8.100/images/small/commodity/sjsm/znsb/1/1.jpg","price":689,"saleNum":0},{"commodityId":70,"commodityName":"衣香丽影毛衣套头打底衫长袖修身冬季高领针织衫女装","masterPic":"http://172.17.8.100/images/small/commodity/nz/ddmy/6/1.jpg","price":158,"saleNum":0},{"commodityId":42,"commodityName":"【清仓】浅口尖头中空交叉带单鞋高跟鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/ggx/4/1.jpg","price":99,"saleNum":0},{"commodityId":38,"commodityName":"明星同款舒适一脚蹬厚底增高休闲小白鞋 拼色圆头深口套脚帆布鞋女鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/fbx/7/1.jpg","price":480,"saleNum":0},{"commodityId":66,"commodityName":"秋冬新品韩版女装毛衣纯色时尚简约花边领半高领套头打底上衣长袖针织衫","masterPic":"http://172.17.8.100/images/small/commodity/nz/ddmy/2/1.jpg","price":49,"saleNum":0}]
     * message : 查询成功
     * status : 0000
     */

    private String message;
    private String status;
    private List<ResultBean> result;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * commodityId : 124
         * commodityName : 台湾AC5高清4K摄像机数码DV12倍光学变焦专业家用旅游
         * masterPic : http://172.17.8.100/images/small/commodity/sjsm/zxj/4/1.jpg
         * price : 1998
         * saleNum : 0
         */

        private int commodityId;
        private String commodityName;
        private String masterPic;
        private int price;
        private int saleNum;

        public int getCommodityId() {
            return commodityId;
        }

        public void setCommodityId(int commodityId) {
            this.commodityId = commodityId;
        }

        public String getCommodityName() {
            return commodityName;
        }

        public void setCommodityName(String commodityName) {
            this.commodityName = commodityName;
        }

        public String getMasterPic() {
            return masterPic;
        }

        public void setMasterPic(String masterPic) {
            this.masterPic = masterPic;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getSaleNum() {
            return saleNum;
        }

        public void setSaleNum(int saleNum) {
            this.saleNum = saleNum;
        }
    }
}
