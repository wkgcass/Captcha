# Captcha
Generate all kinds of captcha

```xml
<dependency>
  <groupId>net.cassite</groupId>
  <artifactId>captcha</artifactId>
  <version>0.0.1-RELEASE</version>
</dependency>
```

#How to use

```java
CaptchaGen cg = CaptchaGen.DEFAULT;
StringBuilder sb = new StringBuilder();
BufferedImage img = cg.generate(sb);
```