package io.github.rcarlosdasilva.weixin.model.request.custom;

import com.google.gson.annotations.SerializedName;

import io.github.rcarlosdasilva.weixin.common.ApiAddress;
import io.github.rcarlosdasilva.weixin.model.request.base.BasicWeixinRequest;

/**
 * 添加客服账号请求模型
 * 
 * @author <a href="mailto:rcarlosdasilva@qq.com">Dean Zhao</a>
 */
@SuppressWarnings("unused")
public class CustomAccountAppendRequest extends BasicWeixinRequest {

  @SerializedName("kf_account")
  private String account;
  private String nickname;

  public CustomAccountAppendRequest() {
    this.path = ApiAddress.URL_CUSTOM_ACCOUNT_APPEND;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

}
