package io.github.rcarlosdasilva.weixin.model.request.template;

import com.google.gson.annotations.SerializedName;

import io.github.rcarlosdasilva.weixin.common.ApiAddress;
import io.github.rcarlosdasilva.weixin.model.request.base.BasicWeixinRequest;

/**
 * 添加模板请求模型
 * 
 * @author <a href="mailto:rcarlosdasilva@qq.com">Dean Zhao</a>
 */
public class TemplateAppendRequest extends BasicWeixinRequest {

  @SerializedName("template_id_short")
  private String code;

  public TemplateAppendRequest() {
    this.path = ApiAddress.URL_TEMPLATE_APPEND;
  }

  /**
   * 模板id.
   * 
   * @param code
   *          id
   */
  public void setCode(String code) {
    this.code = code;
  }

}
