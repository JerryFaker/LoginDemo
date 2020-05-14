
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Base64;

//随机生成验证码图片
public class Captcha implements Serializable {
    private String str;
    private BufferedImage img;

    public BufferedImage getImg() {
        return img;
    }

    public void setImg(BufferedImage img) {
        this.img = img;
    }

    private void ImageMerge() {
        BufferedImage[] list = new BufferedImage[4];
        char[] list2 = str.toCharArray();
        try {
            for (int i = 0; i < 4; i++) {
                list[i] = ImageIO.read(this.getClass().getClassLoader().getResourceAsStream(list2[i]+".png"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        img = new BufferedImage(472, 118, BufferedImage.TYPE_INT_RGB);
        Graphics g = img.getGraphics();
        int x = 0;
        for(BufferedImage image:list) {
            g.drawImage(image,x,0,null);
            x += 118;
        }
    }

    public Captcha() {
        str = Integer.toString((int)(Math.random() * 10000));
        ImageMerge();
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

}
