import java.util.*;

public class RandomChineseWord {
    public static void main(String[] args) {
        // รายการคำศัพท์ภาษาจีนพร้อมพินอิน
        String[][] words = {
            {"爱好", "ài hào"}, {"天气", "tiān qì"}, {"春天", "chūn tiān"}, {"冬天", "dōng tiān"},
            {"空姐", "kōng jiě"}, {"医生", "yī shēng"}, {"泰国", "Tài guó"}, {"中国", "Zhōng guó"},
            {"饺子", "jiǎo zi"}, {"啤酒", "pí jiǔ"}, {"跑步", "pǎo bù"}, {"衣服", "yī fu"},
            {"书法", "shū fǎ"}, {"电影", "diàn yǐng"}, {"国外", "guó wài"}, {"电脑", "diàn nǎo"},
            {"邮局", "yóu jú"}, {"大概", "dà gài"}, {"颜色", "yán sè"}, {"3.5元", "sān diǎn wǔ yuán"},
            {"480元", "sì bǎi bā shí yuán"}, {"面条", "miàn tiáo"}, {"馒头", "mán tou"}, {"餐厅", "cān tīng"},
            {"图书馆", "tú shū guǎn"}, {"篮球场", "lán qiú chǎng"}, {"教学楼", "jiào xué lóu"},
            {"怎么样", "zěn me yàng"}, {"多少钱", "duō shǎo qián"}, {"英语课", "yīng yǔ kè"}
        };

        // สุ่มคำศัพท์
        String[] randomWord = getRandomWord(words);

        // แสดงผล
        System.out.println("คำศัพท์ที่สุ่มได้: " + randomWord[0]);
        System.out.println("พินอิน: " + randomWord[1]);
    }

    // ฟังก์ชันสุ่มคำศัพท์
    public static String[] getRandomWord(String[][] words) {
        Random random = new Random();
        int index = random.nextInt(words.length);
        return words[index];
    }
}
