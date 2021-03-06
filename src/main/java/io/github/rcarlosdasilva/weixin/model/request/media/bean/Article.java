package io.github.rcarlosdasilva.weixin.model.request.media.bean;

import com.google.gson.annotations.SerializedName;

import io.github.rcarlosdasilva.weixin.common.Convention;

@SuppressWarnings("unused")
public class Article {

  private String title;
  @SerializedName("thumb_media_id")
  private String thumbnailMediaId;
  private String author;
  private String digest;
  @SerializedName("show_cover_pic")
  private int showCover;
  private String content;
  @SerializedName("content_source_url")
  private String sourceUrl;
  @SerializedName("need_open_comment")
  private int openComment;
  @SerializedName("only_fans_can_comment")
  private int onlyFansComment;

  /**
   * 构造函数.
   * 
   * @param title
   *          标题
   * @param thumbnailMediaId
   *          图文消息的封面图片素材id（必须是永久mediaID）
   * @param author
   *          作者
   * @param digest
   *          图文消息的摘要，仅有单图文消息才有摘要，多图文此处为空
   * @param isShowCover
   *          是否显示封面，0为false，即不显示，1为true，即显示
   * @param content
   *          图文消息的具体内容，支持HTML标签，必须少于2万字符，小于1M，且此处会去除JS
   * @param sourceUrl
   *          图文消息的原文地址，即点击“阅读原文”后的URL
   */
  public Article(String title, String thumbnailMediaId, String author, String digest,
      boolean isShowCover, String content, String sourceUrl) {
    this.title = title;
    this.thumbnailMediaId = thumbnailMediaId;
    this.author = author;
    this.digest = digest;
    this.showCover = isShowCover ? Convention.GLOBAL_TRUE_NUMBER : Convention.GLOBAL_FALSE_NUMBER;
    this.content = content;
    this.sourceUrl = sourceUrl;
  }

  /**
   * 构造函数.
   * 
   * @param title
   *          标题
   * @param thumbnailMediaId
   *          图文消息的封面图片素材id（必须是永久mediaID）
   * @param author
   *          作者
   * @param digest
   *          图文消息的摘要，仅有单图文消息才有摘要，多图文此处为空
   * @param isShowCover
   *          是否显示封面，0为false，即不显示，1为true，即显示
   * @param content
   *          图文消息的具体内容，支持HTML标签，必须少于2万字符，小于1M，且此处会去除JS
   * @param sourceUrl
   *          图文消息的原文地址，即点击“阅读原文”后的URL
   * @param openComment
   *          是否打开评论，0不打开，1打开
   * @param onlyFansComment
   *          是否粉丝才可评论，0所有人可评论，1粉丝才可评论
   */
  public Article(String title, String thumbnailMediaId, String author, String digest,
      boolean isShowCover, String content, String sourceUrl, boolean openComment,
      boolean onlyFansComment) {
    this.title = title;
    this.thumbnailMediaId = thumbnailMediaId;
    this.author = author;
    this.digest = digest;
    this.showCover = isShowCover ? Convention.GLOBAL_TRUE_NUMBER : Convention.GLOBAL_FALSE_NUMBER;
    this.content = content;
    this.sourceUrl = sourceUrl;
    this.openComment = openComment ? Convention.GLOBAL_TRUE_NUMBER : Convention.GLOBAL_FALSE_NUMBER;
    this.onlyFansComment = onlyFansComment ? Convention.GLOBAL_TRUE_NUMBER
        : Convention.GLOBAL_FALSE_NUMBER;
  }

  /**
   * 标题.
   * 
   * @param title
   *          title
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * 图文消息的封面图片素材id（必须是永久mediaID）.
   * 
   * @param thumbnailMediaId
   *          media id
   */
  public void setThumbnailMediaId(String thumbnailMediaId) {
    this.thumbnailMediaId = thumbnailMediaId;
  }

  /**
   * 作者.
   * 
   * @param author
   *          author
   */
  public void setAuthor(String author) {
    this.author = author;
  }

  /**
   * 图文消息的摘要，仅有单图文消息才有摘要，多图文此处为空.
   * 
   * @param digest
   *          digest
   */
  public void setDigest(String digest) {
    this.digest = digest;
  }

  /**
   * 是否显示封面，0为false，即不显示，1为true，即显示.
   * 
   * @param isShowCover
   *          is show
   */
  public void setShowCover(boolean isShowCover) {
    this.showCover = isShowCover ? Convention.GLOBAL_TRUE_NUMBER : Convention.GLOBAL_FALSE_NUMBER;
  }

  /**
   * 图文消息的具体内容，支持HTML标签，必须少于2万字符，小于1M，且此处会去除JS.
   * 
   * @param content
   *          content
   */
  public void setContent(String content) {
    this.content = content;
  }

  /**
   * 图文消息的原文地址，即点击“阅读原文”后的URL.
   * 
   * @param sourceUrl
   *          url
   */
  public void setSourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
  }

  /**
   * 是否打开评论，0不打开，1打开.
   * 
   * @param openComment
   *          open comment
   */
  public void setOpenComment(boolean openComment) {
    this.openComment = openComment ? Convention.GLOBAL_TRUE_NUMBER : Convention.GLOBAL_FALSE_NUMBER;
  }

  /**
   * 是否粉丝才可评论，0所有人可评论，1粉丝才可评论.
   * 
   * @param onlyFansComment
   *          only fans comment
   */
  public void setOnlyFansComment(boolean onlyFansComment) {
    this.onlyFansComment = onlyFansComment ? Convention.GLOBAL_TRUE_NUMBER
        : Convention.GLOBAL_FALSE_NUMBER;
  }

}
