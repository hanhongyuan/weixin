package io.github.rcarlosdasilva.weixin.model.builder;

/**
 * 请求模型构建器
 * 
 * @author <a href="mailto:rcarlosdasilva@qq.com">Dean Zhao</a>
 */
public class Builder {

  private Builder() {
    throw new IllegalStateException("Builder class");
  }

  /**
   * 构建一个自定义菜单.
   * 
   * @return {@link MenuBuilder}
   */
  public static MenuBuilder buildMenu() {
    return new MenuBuilder();
  }

  /**
   * 构建一个模板消息.
   * 
   * @return {@link TemplateMessageBuilder}
   */
  public static TemplateMessageBuilder buildTemplateMessage() {
    return new TemplateMessageBuilder();
  }

  /**
   * 构建客服消息内容.
   * 
   * @return {@link MassOrCustomMessageBuilder}
   */
  public static MassOrCustomMessageBuilder buildMessage() {
    return new MassOrCustomMessageBuilder();
  }

  /**
   * 构建微信推送通知回复消息构建器.
   * 
   * @return {@link NotificationResponseBuilder}
   */
  public static NotificationResponseBuilder buildNotificationResponse() {
    return new NotificationResponseBuilder();
  }

}
