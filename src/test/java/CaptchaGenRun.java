import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by wkgcass on 16/4/4.
 */
public class CaptchaGenRun {
        public static void main(String[] args) throws IOException {
                StringBuilder sb = new StringBuilder();
                // 大小1000*50, 40个字, 500个噪音 (恶搞配置)
                CaptchaGen foo = new CaptchaGen(CaptchaGen.ALL_ENGLISH_CHARS_AND_NUMBERS, 1000, 50, 30, 40, 0.4, 8, 30, 500, 10, 2);
                // 大小150*50, 4个字, 50个噪音 (常见配置)
                CaptchaGen bar = CaptchaGen.DEFAULT;
                BufferedImage img =
                        bar.generate(sb);
                //foo.generate(sb);
                System.out.println(sb);
                File file = new File("/Volumes/PROJECTS/openSource/Captcha/src/test/resources/file.png");
                if (!file.exists())
                        file.createNewFile();
                ImageIO.write(img, "PNG", file);
        }
}
